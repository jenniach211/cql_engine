package org.opencds.cqf.cql.execution;

import org.joda.time.Partial;
import org.opencds.cqf.cql.runtime.DateTime;
import org.opencds.cqf.cql.runtime.Interval;
import org.opencds.cqf.cql.runtime.Quantity;
import org.opencds.cqf.cql.runtime.Time;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * Created by Bryn on 5/1/2016.
 */
public class CqlIntervalOperatorsTest extends CqlExecutionTestBase {

    /**
     * {@link org.opencds.cqf.cql.elm.execution.AfterEvaluator#evaluate(Context)}
     */
    @Test
    public void TestAfter() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestAfterNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalPointAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalPointAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalAfterPointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalAfterPointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalPointAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalPointAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalAfterPointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalAfterPointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalPointAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalPointAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalAfterPointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalAfterPointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.BeforeEvaluator#evaluate(Context)}
     */
    @Test
    public void TestBefore() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestBeforeNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalPointBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalPointBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalBeforePointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalBeforePointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalPointBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalPointBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalBeforePointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalBeforePointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalPointBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalPointBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalBeforePointTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalBeforePointFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.CollapseEvaluator#evaluate(Context)}
     */
    @Test
    public void TestCollapse() {
        Context context = new Context(library);
        Object result = context.resolveExpressionRef("TestCollapseNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalCollapse").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(1, true, 10, true)));
        Assert.assertTrue(((Interval)((List) result).get(1)).equal(new Interval(12, true, 19, true)));

        result = context.resolveExpressionRef("IntegerIntervalCollapse2").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(1, true, 19, true)));

        result = context.resolveExpressionRef("IntegerIntervalCollapse3").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(4, true, 8, true)));

        result = context.resolveExpressionRef("DecimalIntervalCollapse").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(new BigDecimal("1.0"), true, new BigDecimal("10.0"), true)));
        Assert.assertTrue(((Interval)((List) result).get(1)).equal(new Interval(new BigDecimal("12.0"), true, new BigDecimal("19.0"), true)));

        result = context.resolveExpressionRef("DecimalIntervalCollapse2").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(new BigDecimal("4.0"), true, new BigDecimal("8.0"), true)));

        result = context.resolveExpressionRef("QuantityIntervalCollapse").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)((List) result).get(0)).equal(new Interval(new Quantity().withValue(new BigDecimal("1.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("10.0")).withUnit("g"), true)));
        Assert.assertTrue(((Interval)((List) result).get(1)).equal(new Interval(new Quantity().withValue(new BigDecimal("12.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("19.0")).withUnit("g"), true)));

        result = context.resolveExpressionRef("DateTimeCollapse").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)((List)result).get(0)).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 1})));
        assertThat(((DateTime)((Interval)((List)result).get(0)).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 25})));
        assertThat(((DateTime)((Interval)((List)result).get(1)).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 5, 10})));
        assertThat(((DateTime)((Interval)((List)result).get(1)).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 5, 30})));
        assertThat(((List)result).size(), is(2));

        result = context.resolveExpressionRef("DateTimeCollapse2").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)((List)result).get(0)).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 1})));
        assertThat(((DateTime)((Interval)((List)result).get(0)).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 5, 25})));
        assertThat(((List)result).size(), is(1));

        result = context.resolveExpressionRef("TimeCollapse").getExpression().evaluate(context);
        assertThat(((Time)((Interval)((List)result).get(0)).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {1, 59, 59, 999})));
        assertThat(((Time)((Interval)((List)result).get(0)).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {15, 59, 59, 999})));
        assertThat(((Time)((Interval)((List)result).get(1)).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {17, 59, 59, 999})));
        assertThat(((Time)((Interval)((List)result).get(1)).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {22, 59, 59, 999})));
        assertThat(((List)result).size(), is(2));

        result = context.resolveExpressionRef("TimeCollapse2").getExpression().evaluate(context);
        assertThat(((Time)((Interval)((List)result).get(0)).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {1, 59, 59, 999})));
        assertThat(((Time)((Interval)((List)result).get(0)).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {15, 59, 59, 999})));
        assertThat(((List)result).size(), is(1));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.ContainsEvaluator#evaluate(Context)}
     */
    @Test
    public void TestContains() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestContainsNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("TestNullElement1").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestNullElement2").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalContainsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalContainsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalContainsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalContainsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalContainsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalContainsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeContainsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeContainsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeContainsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeContainsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.EndsEvaluator#evaluate(Context)}
     */
    @Test
    public void TestEnds() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestEndsNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalEndsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalEndsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalEndsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalEndsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalEndsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalEndsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeEndsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeEndsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeEndsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeEndsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.EqualEvaluator#evaluate(Context)}
     */
    @Test
    public void TestEqual() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestEqualNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.ExceptEvaluator#evaluate(Context)}
     */
    @Test
    public void TestExcept() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestExceptNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalExcept1to3").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(1, true, 3, true)));

        result = context.resolveExpressionRef("IntegerIntervalExceptNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DecimalIntervalExcept1to3").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new BigDecimal("1.0"), true, new BigDecimal("3.99999999"), true)));

        result = context.resolveExpressionRef("DecimalIntervalExceptNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("QuantityIntervalExcept1to4").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new Quantity().withValue(new BigDecimal("1.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("4.99999999")).withUnit("g"), true)));

        result = context.resolveExpressionRef("Except12").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(1, true, 2, true)));

        result = context.resolveExpressionRef("ExceptDateTime").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)result).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 5})));
        assertThat(((DateTime)((Interval)result).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 6})));

        result = context.resolveExpressionRef("ExceptDateTime2").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)result).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 13})));
        assertThat(((DateTime)((Interval)result).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 16})));

        result = context.resolveExpressionRef("ExceptTime").getExpression().evaluate(context);
        assertThat(((Time)((Interval)result).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {5, 59, 59, 999})));
        assertThat(((Time)((Interval)result).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {8, 59, 59, 998})));

        result = context.resolveExpressionRef("ExceptTime2").getExpression().evaluate(context);
        assertThat(((Time)((Interval)result).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {11, 0, 0, 0})));
        assertThat(((Time)((Interval)result).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {11, 59, 59, 999})));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.InEvaluator#evaluate(Context)}
     */
    @Test
    public void TestIn() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestInNull").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeInNullTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeInNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.IncludesEvaluator#evaluate(Context)}
     */
    @Test
    public void TestIncludes() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestIncludesNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.IncludedInEvaluator#evaluate(Context)}
     */
    @Test
    public void TestIncludedIn() {
        Context context = new Context(library);

        // This is going to the InEvaluator for some reason
        // result = context.resolveExpressionRef("TestIncludedInNull").getExpression().evaluate(context);
        // assertThat(result, is(nullValue()));

        Object result = context.resolveExpressionRef("IntegerIntervalIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.IntersectEvaluator#evaluate(Context)}
     */
    @Test
    public void TestIntersect() {
        Context context = new Context(library);

        // result = context.resolveExpressionRef("TestIntersectNull").getExpression().evaluate(context);
        // assertThat(result, is(nullValue()));

        Object result = context.resolveExpressionRef("IntegerIntervalIntersectTest4to10").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(4, true, 10, true)));

        result = context.resolveExpressionRef("IntegerIntervalIntersectTestNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DecimalIntervalIntersectTest4to10").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new BigDecimal("4.0"), true, new BigDecimal("10.0"), true)));

        result = context.resolveExpressionRef("IntegerIntervalIntersectTestNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("QuantityIntervalIntersectTest5to10").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new Quantity().withValue(new BigDecimal("5.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("10.0")).withUnit("g"), true)));

        result = context.resolveExpressionRef("QuantityIntervalIntersectTestNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DateTimeIntersect").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)result).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 7})));
        assertThat(((DateTime)((Interval)result).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 10})));

        result = context.resolveExpressionRef("TimeIntersect").getExpression().evaluate(context);
        assertThat(((Time)((Interval)result).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {4, 59, 59, 999})));
        assertThat(((Time)((Interval)result).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {6, 59, 59, 999})));

    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.EquivalentEvaluator#evaluate(Context)}
     */
    @Test
    public void TestEquivalent() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalEquivalentTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalEquivalentFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalEquivalentTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalEquivalentFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalEquivalentTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalEquivalentFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeEquivalentTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeEquivalentFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeEquivalentTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeEquivalentFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.MeetsEvaluator#evaluate(Context)}
     */
    @Test
    public void TestMeets() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestMeetsNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalMeetsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalMeetsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalMeetsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalMeetsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalMeetsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalMeetsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeMeetsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeMeetsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeMeetsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeMeetsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.MeetsBeforeEvaluator#evaluate(Context)}
     */
    @Test
    public void TestMeetsBefore() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestMeetsBeforeNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalMeetsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalMeetsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalMeetsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalMeetsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalMeetsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalMeetsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeMeetsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeMeetsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeMeetsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeMeetsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.MeetsAfterEvaluator#evaluate(Context)}
     */
    @Test
    public void TestMeetsAfter() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestMeetsAfterNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalMeetsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalMeetsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalMeetsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalMeetsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalMeetsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalMeetsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeMeetsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeMeetsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeMeetsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeMeetsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.NotEqualEvaluator#evaluate(Context)}
     */
    @Test
    public void TestNotEqual() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalNotEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalNotEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalNotEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalNotEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalNotEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalNotEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeNotEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeNotEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeNotEqualTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeNotEqualFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.SameOrAfterEvaluator#evaluate(Context)}
     */
    @Test
    public void TestOnOrAfter() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestOnOrAfterNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("TestOnOrAfterDateTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrAfterDateFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrAfterTimeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrAfterTimeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrAfterIntegerTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrAfterDecimalFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrAfterQuantityTrue").getExpression().evaluate(context);
        assertThat(result, is(true));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.SameOrBeforeEvaluator#evaluate(Context)}
     */
    @Test
    public void TestOnOrBefore() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestOnOrBeforeNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("TestOnOrBeforeDateTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrBeforeDateFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrBeforeTimeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrBeforeTimeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrBeforeIntegerTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TestOnOrBeforeDecimalFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TestOnOrBeforeQuantityTrue").getExpression().evaluate(context);
        assertThat(result, is(true));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.OverlapsEvaluator#evaluate(Context)}
     */
    @Test
    public void TestOverlaps() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestOverlapsNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeOverlapsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeOverlapsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeOverlapsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeOverlapsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.OverlapsBeforeEvaluator#evaluate(Context)}
     */
    @Test
    public void TestOverlapsBefore() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestOverlapsBeforeNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeOverlapsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeOverlapsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeOverlapsBeforeTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeOverlapsBeforeFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.OverlapsAfterEvaluator#evaluate(Context)}
     */
    @Test
    public void TestOverlapsAfter() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestOverlapsAfterNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalOverlapsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalOverlapsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalOverlapsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeOverlapsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeOverlapsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeOverlapsAfterTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeOverlapsAfterFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.PointFromEvaluator#evaluate(Context)}
     */
    @Test
    public void TestPointFrom() {
        Context context = new Context(library);
        Object result = context.resolveExpressionRef("TestPointFromNull").getExpression().evaluate(context);
        Assert.assertTrue(result == null);

        result = context.resolveExpressionRef("TestPointFromInteger").getExpression().evaluate(context);
        Assert.assertTrue((Integer) result == 1);

        result = context.resolveExpressionRef("TestPointFromDecimal").getExpression().evaluate(context);
        Assert.assertTrue(((BigDecimal) result).compareTo(new BigDecimal("1.0")) == 0);

        result = context.resolveExpressionRef("TestPointFromQuantity").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("1.0")).withUnit("cm")));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.ProperlyIncludesEvaluator#evaluate(Context)}
     */
    @Test
    public void TestProperlyIncludes() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestProperlyIncludesNull").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalProperlyIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalProperlyIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalProperlyIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalProperlyIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalProperlyIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalProperlyIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeProperlyIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeProperlyIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeProperlyIncludesTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeProperlyIncludesFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.ProperlyIncludedInEvaluator#evaluate(Context)}
     */
    @Test
    public void TestProperlyIncludedIn() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestProperlyIncludedInNull").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("IntegerIntervalProperlyIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalProperlyIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalProperlyIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalProperlyIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalProperlyIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalProperlyIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeProperlyIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeProperlyIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeProperlyIncludedInTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeProperlyIncludedInFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.IntervalEvaluator#evaluate(Context)}
     */
    @Test
    public void TestInterval() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalTest").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(1, true, 10, true)));

        result = context.resolveExpressionRef("DecimalIntervalTest").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new BigDecimal("1.0"), true, new BigDecimal("10.0"), true)));

        result = context.resolveExpressionRef("QuantityIntervalTest").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new Quantity().withValue(new BigDecimal("1.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("10.0")).withUnit("g"), true)));

        result = context.resolveExpressionRef("DateTimeIntervalTest").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)result).getStart()).getPartial(), is(new Partial(DateTime.getFields(7), new int[] {2016, 5, 1, 0, 0, 0, 0})));
        assertThat(((DateTime)((Interval)result).getEnd()).getPartial(), is(new Partial(DateTime.getFields(7), new int[] {2016, 5, 2, 0, 0, 0, 0})));

        result = context.resolveExpressionRef("TimeIntervalTest").getExpression().evaluate(context);
        assertThat(((Time)((Interval)result).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {0, 0, 0, 0})));
        assertThat(((Time)((Interval)result).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {23, 59, 59, 599})));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.StartEvaluator#evaluate(Context)}
     */
    @Test
    public void TestStart() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalStart").getExpression().evaluate(context);
        assertThat(result, is(1));

        result = context.resolveExpressionRef("DecimalIntervalStart").getExpression().evaluate(context);
        assertThat(result, is(new BigDecimal("1.0")));

        result = context.resolveExpressionRef("QuantityIntervalStart").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("1.0")).withUnit("g")));

        result = context.resolveExpressionRef("DateTimeIntervalStart").getExpression().evaluate(context);
        assertThat(((DateTime)result).getPartial(), is(new Partial(DateTime.getFields(7), new int[] {2016, 5, 1, 0, 0, 0, 0})));

        result = context.resolveExpressionRef("TimeIntervalStart").getExpression().evaluate(context);
        assertThat(((Time)result).getPartial(), is(new Partial(Time.getFields(4), new int[] {0, 0, 0, 0})));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.StartsEvaluator#evaluate(Context)}
     */
    @Test
    public void TestStarts() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestStartsNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalStartsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("IntegerIntervalStartsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DecimalIntervalStartsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DecimalIntervalStartsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("QuantityIntervalStartsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("QuantityIntervalStartsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("DateTimeStartsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("DateTimeStartsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));

        result = context.resolveExpressionRef("TimeStartsTrue").getExpression().evaluate(context);
        assertThat(result, is(true));

        result = context.resolveExpressionRef("TimeStartsFalse").getExpression().evaluate(context);
        assertThat(result, is(false));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.UnionEvaluator#evaluate(Context)}
     */
    @Test
    public void TestUnion() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("TestUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("IntegerIntervalUnion1To15").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(1, true, 15, true)));

        result = context.resolveExpressionRef("IntegerIntervalUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DecimalIntervalUnion1To15").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new BigDecimal("1.0"), true, new BigDecimal("15.0"), true)));

        result = context.resolveExpressionRef("DecimalIntervalUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("QuantityIntervalUnion1To15").getExpression().evaluate(context);
        Assert.assertTrue(((Interval)result).equal(new Interval(new Quantity().withValue(new BigDecimal("1.0")).withUnit("g"), true, new Quantity().withValue(new BigDecimal("15.0")).withUnit("g"), true)));

        result = context.resolveExpressionRef("QuantityIntervalUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DateTimeUnion").getExpression().evaluate(context);
        assertThat(((DateTime)((Interval)result).getStart()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 5})));
        assertThat(((DateTime)((Interval)result).getEnd()).getPartial(), is(new Partial(DateTime.getFields(3), new int[] {2012, 1, 28})));

        result = context.resolveExpressionRef("DateTimeUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("TimeUnion").getExpression().evaluate(context);
        assertThat(((Time)((Interval)result).getStart()).getPartial(), is(new Partial(Time.getFields(4), new int[] {5, 59, 59, 999})));
        assertThat(((Time)((Interval)result).getEnd()).getPartial(), is(new Partial(Time.getFields(4), new int[] {20, 59, 59, 999})));

        result = context.resolveExpressionRef("TimeUnionNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.WidthEvaluator#evaluate(Context)}
     */
    @Test
    public void TestWidth() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalTestWidth9").getExpression().evaluate(context);
        assertThat(result, is(9));

        result = context.resolveExpressionRef("IntervalTestWidthNull").getExpression().evaluate(context);
        assertThat(result, is(nullValue()));

        result = context.resolveExpressionRef("DecimalIntervalTestWidth11").getExpression().evaluate(context);
        assertThat(result, is(new BigDecimal("11.0")));

        result = context.resolveExpressionRef("QuantityIntervalTestWidth5").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("5.0")).withUnit("g")));

        result = context.resolveExpressionRef("DateTimeWidth").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("20")).withUnit("days")));

        result = context.resolveExpressionRef("TimeWidth").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("36000000")).withUnit("milliseconds")));
    }

    /**
     * {@link org.opencds.cqf.cql.elm.execution.EndEvaluator#evaluate(Context)}
     */
    @Test
    public void TestEnd() {
        Context context = new Context(library);

        Object result = context.resolveExpressionRef("IntegerIntervalEnd").getExpression().evaluate(context);
        assertThat(result, is(10));

        result = context.resolveExpressionRef("DecimalIntervalEnd").getExpression().evaluate(context);
        assertThat(result, is(new BigDecimal("10.0")));

        result = context.resolveExpressionRef("QuantityIntervalEnd").getExpression().evaluate(context);
        Assert.assertTrue(((Quantity) result).equal(new Quantity().withValue(new BigDecimal("10.0")).withUnit("g")));

        result = context.resolveExpressionRef("DateTimeIntervalEnd").getExpression().evaluate(context);
        assertThat(((DateTime)result).getPartial(), is(new Partial(DateTime.getFields(7), new int[] {2016, 5, 2, 0, 0, 0, 0})));

        result = context.resolveExpressionRef("TimeIntervalEnd").getExpression().evaluate(context);
        assertThat(((Time)result).getPartial(), is(new Partial(Time.getFields(4), new int[] {23, 59, 59, 599})));
    }
}
