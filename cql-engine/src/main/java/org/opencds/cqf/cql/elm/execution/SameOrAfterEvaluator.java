package org.opencds.cqf.cql.elm.execution;

import org.opencds.cqf.cql.execution.Context;
import org.opencds.cqf.cql.runtime.DateTime;
import org.opencds.cqf.cql.runtime.Interval;
import org.opencds.cqf.cql.runtime.Time;

/*
same precision or after(left DateTime, right DateTime) Boolean
same precision or after(left Time, right Time) Boolean

The same-precision-or after operator compares two date/time values to the specified precision to determine
  whether the first argument is the same or after the second argument.
For DateTime values, precision must be one of: year, month, day, hour, minute, second, or millisecond.
For Time values, precision must be one of: hour, minute, second, or millisecond.
For comparisons involving date/time or time values with imprecision, note that the result of the comparison may be null,
  depending on whether the values involved are specified to the level of precision used for the comparison.
If either or both arguments are null, the result is null.

OnOrAfter overload
on or after precision (left Interval<T>, right Interval<T>) Boolean
on or after precision (left T, right Interval<T>) Boolean
on or after precision (left Interval<T>, right T) Boolean

The on or after operator for intervals returns true if the first interval starts on or after the second one ends.
    In other words, if the starting point of the first interval is greater than or equal to the ending point of the second interval.
For the point-interval overload, the operator returns true if the given point is greater than or equal to the end of the interval.
For the interval-point overload, the operator returns true if the given interval starts on or after the given point.
This operator uses the semantics described in the Start and End operators to determine interval boundaries.
If precision is specified and the point type is a date/time type,
    comparisons used in the operation are performed at the specified precision.
If either argument is null, the result is null.
Note that this operator can be invoked using either the on or after or the after or on syntax.
*/

/**
 * Created by Chris Schuler on 6/23/2016
 */
public class SameOrAfterEvaluator extends org.cqframework.cql.elm.execution.SameOrAfter {

    public static Object onOrAfter(Object left, Object right, String precision) {
        // Interval, Interval
        if (left instanceof Interval && right instanceof Interval) {
            if (((Interval) left).getStart() instanceof DateTime
                    || ((Interval) left).getStart() instanceof Time)
            {
                return sameOrAfter(((Interval) left).getStart(), ((Interval) right).getEnd(), precision);
            }
            return GreaterOrEqualEvaluator.greaterOrEqual(((Interval) left).getStart(), ((Interval) right).getEnd());
        }

        // Interval, Point
        else if (left instanceof Interval) {
            if (right instanceof DateTime || right instanceof Time) {
                return sameOrAfter(((Interval) left).getStart(), right, precision);
            }
            return GreaterOrEqualEvaluator.greaterOrEqual(((Interval) left).getStart(), right);
        }

        // Point, Interval
        else if (right instanceof Interval) {
            if (left instanceof DateTime || left instanceof Time) {
                return sameOrAfter(left, ((Interval) right).getEnd(), precision);
            }
            return GreaterOrEqualEvaluator.greaterOrEqual(left, ((Interval) right).getEnd());
        }

        throw new IllegalArgumentException(String.format("Cannot perform OnOrAfter operator with arguments %s and %s", left.getClass().getName(), right.getClass().getName()));
    }

    public static Object sameOrAfter(Object left, Object right, String precision) {
        if (left == null || right == null) {
            return null;
        }

        // Interval OnOrAfter overload
        if (left instanceof Interval || right instanceof Interval) {
            return onOrAfter(left, right, precision);
        }

        if (precision == null) {
            throw new IllegalArgumentException("Precision must be specified.");
        }

        if (left instanceof DateTime && right instanceof DateTime) {
            DateTime leftDT = (DateTime)left;
            DateTime rightDT = (DateTime)right;

            int idx = DateTime.getFieldIndex(precision);

            if (idx != -1) {
                // check level of precision
                if (idx + 1 > leftDT.getPartial().size() || idx + 1 > rightDT.getPartial().size()) {
                    return null;
                }

                for (int i = 0; i < idx + 1; ++i) {
                    if (leftDT.getPartial().getValue(i) < rightDT.getPartial().getValue(i)) {
                        return false;
                    }
                    else if (leftDT.getPartial().getValue(i) > rightDT.getPartial().getValue(i)) {
                        return true;
                    }
                }

                return leftDT.getPartial().getValue(idx) >= rightDT.getPartial().getValue(idx);
            }

            else {
                throw new IllegalArgumentException(String.format("Invalid duration precision: %s", precision));
            }
        }

        else if (left instanceof Time && right instanceof Time) {
            Time leftT = (Time)left;
            Time rightT = (Time)right;

            int idx = Time.getFieldIndex(precision);

            if (idx != -1) {
                // check level of precision
                if (idx + 1 > leftT.getPartial().size() || idx + 1 > rightT.getPartial().size()) {
                    return null;
                }

                for (int i = 0; i < idx + 1; ++i) {
                    if (leftT.getPartial().getValue(i) < rightT.getPartial().getValue(i)) {
                        return false;
                    }
                    else if (leftT.getPartial().getValue(i) > rightT.getPartial().getValue(i)) {
                        return true;
                    }
                }

                return leftT.getPartial().getValue(idx) >= rightT.getPartial().getValue(idx);
            }

            else {
                throw new IllegalArgumentException(String.format("Invalid duration precision: %s", precision));
            }
        }
        throw new IllegalArgumentException(String.format("Cannot perform SameOrAfter operation with arguments of type '%s' and '%s'.", left.getClass().getName(), right.getClass().getName()));
    }

    @Override
    public Object evaluate(Context context) {
        Object left = getOperand().get(0).evaluate(context);
        Object right = getOperand().get(1).evaluate(context);
        String precision = getPrecision() == null ? null : getPrecision().value();

        return context.logTrace(this.getClass(), sameOrAfter(left, right, precision), left, right, precision);
    }
}
