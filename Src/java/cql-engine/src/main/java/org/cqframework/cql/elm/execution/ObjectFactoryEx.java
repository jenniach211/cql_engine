package org.cqframework.cql.elm.execution;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * Created by Bryn on 5/24/2016.
 */
@XmlRegistry
public class ObjectFactoryEx extends ObjectFactory {
    @Override
    public Abs createAbs() {
        return new AbsEvaluator();
    }
    
    @Override
    public Add createAdd() { return new AddEvaluator(); }

    @Override
    public AllTrue createAllTrue() { return new AllTrueEvaluator(); }

    @Override
    public And createAnd() { return new AndEvaluator(); }

    @Override
    public AnyTrue createAnyTrue() { return new AnyTrueEvaluator(); }

    @Override
    public As createAs() { return new AsEvaluator(); }

    @Override
    public Ceiling createCeiling() { return new CeilingEvaluator(); }

    @Override
    public Coalesce createCoalesce() { return new CoalesceEvaluator(); }

    @Override
    public Code createCode() { return new CodeEvaluator(); }

    @Override
    public Combine createCombine() { return new CombineEvaluator(); }

    @Override
    public Concatenate createConcatenate() { return new ConcatenateEvaluator(); }

    @Override
    public Contains createContains() { return new ContainsEvaluator(); }

    @Override
    public Convert createConvert() { return new ConvertEvaluator(); }

    @Override
    public DateTime createDateTime() { return new DateTimeEvaluator(); }

    @Override
    public Distinct createDistinct() { return new DistinctEvaluator(); }

    @Override
    public Divide createDivide() { return new DivideEvaluator(); }

    @Override
    public End createEnd() { return new EndEvaluator(); }

    @Override
    public Equal createEqual() { return new EqualEvaluator(); }

    @Override
    public Equivalent createEquivalent() { return new EquivalentEvaluator(); }

    @Override
    public Except createExcept() { return new ExceptEvaluator(); }

    @Override
    public Exists createExists() { return new ExistsEvaluator(); }

    @Override
    public Exp createExp() { return new ExpEvaluator(); }

    @Override
    public ExpressionDef createExpressionDef() { return new ExpressionDefEvaluator(); }

    @Override
    public ExpressionRef createExpressionRef() { return new ExpressionRefEvaluator(); }

    @Override
    public First createFirst() { return new FirstEvaluator(); }

    @Override
    public Flatten createFlatten() { return new FlattenEvaluator(); }

    @Override
    public Floor createFloor() { return new FloorEvaluator(); }

    @Override
    public FunctionRef createFunctionRef() { return new FunctionRefEvaluator(); }

    @Override
    public Greater createGreater() { return new GreaterEvaluator(); }

    @Override
    public GreaterOrEqual createGreaterOrEqual() { return new GreaterOrEqualEvaluator(); }

    @Override
    public Implies createImplies() { return new ImpliesEvaluator(); }

    @Override
    public IncludedIn createIncludedIn() { return new IncludedInEvaluator(); }

    @Override
    public Includes createIncludes() { return new IncludesEvaluator(); }

    @Override
    public Indexer createIndexer() { return new IndexerEvaluator(); }

    @Override
    public IndexOf createIndexOf() { return new IndexOfEvaluator(); }

    @Override
    public In createIn() { return new InEvaluator(); }

    @Override
    public Instance createInstance() { return new InstanceEvaluator(); }

    @Override
    public Intersect createIntersect() { return new IntersectEvaluator(); }

    @Override
    public Interval createInterval() { return new IntervalEvaluator(); }

    @Override
    public IsFalse createIsFalse() { return new IsFalseEvaluator(); }

    @Override
    public IsNull createIsNull() { return new IsNullEvaluator(); }

    @Override
    public IsTrue createIsTrue() { return new IsTrueEvaluator(); }

    @Override
    public Last createLast() { return new LastEvaluator(); }

    @Override
    public Length createLength() { return new LengthEvaluator(); }

    @Override
    public Less createLess() { return new LessEvaluator(); }

    @Override
    public LessOrEqual createLessOrEqual() { return new LessOrEqualEvaluator(); }

    @Override
    public List createList() { return new ListEvaluator(); }

    @Override
    public Literal createLiteral() { return new LiteralEvaluator(); }

    @Override
    public Ln createLn() { return new LnEvaluator(); }

    @Override
    public Log createLog() { return new LogEvaluator(); }

    @Override
    public Lower createLower() { return new LowerEvaluator(); }

    @Override
    public MaxValue createMaxValue() { return new MaxValueEvaluator(); }

    @Override
    public MinValue createMinValue() { return new MinValueEvaluator(); }

    @Override
    public Modulo createModulo() { return new ModuloEvaluator(); }

    @Override
    public Multiply createMultiply() { return new MultiplyEvaluator(); }

    @Override
    public Negate createNegate() { return new NegateEvaluator(); }

    @Override
    public NotEqual createNotEqual() { return new NotEqualEvaluator(); }

    @Override
    public Not createNot() { return new NotEvaluator(); }

    @Override
    public Null createNull() { return new NullEvaluator(); }

    @Override
    public OperandRef createOperandRef() { return new OperandRefEvaluator(); }

    @Override
    public Or createOr() { return new OrEvaluator(); }

    @Override
    public ParameterRef createParameterRef() { return new ParameterRefEvaluator(); }

    @Override
    public PositionOf createPositionOf() { return new PositionOfEvaluator(); }

    @Override
    public Power createPower() { return new PowerEvaluator(); }

    @Override
    public Predecessor createPredecessor() { return new PredecessorEvaluator(); }

    @Override
    public Property createProperty() { return new PropertyEvaluator(); }

    @Override
    public Quantity createQuantity() { return new QuantityEvaluator(); }

    @Override
    public Query createQuery() { return new QueryEvaluator(); }

    @Override
    public Retrieve createRetrieve() { return new RetrieveEvaluator(); }

    @Override
    public Round createRound() { return new RoundEvaluator(); }

    @Override
    public SingletonFrom createSingletonFrom() { return new SingletonFromEvaluator(); }

    @Override
    public Split createSplit() { return new SplitEvaluator(); }

    @Override
    public Start createStart() { return new StartEvaluator(); }

    @Override
    public Substring createSubstring() { return new SubstringEvaluator(); }

    @Override
    public Subtract createSubtract() { return new SubtractEvaluator(); }

    @Override
    public Successor createSuccessor() { return new SuccessorEvaluator(); }

    @Override
    public ToConcept createToConcept() { return new ToConceptEvaluator(); }

    @Override
    public ToDecimal createToDecimal() { return new ToDecimalEvaluator(); }

    @Override
    public TruncatedDivide createTruncatedDivide() { return new TruncatedDivideEvaluator(); }

    @Override
    public Truncate createTruncate() { return new TruncateEvaluator(); }

    @Override
    public Union createUnion() { return new UnionEvaluator(); }

    @Override
    public Upper createUpper() { return new UpperEvaluator(); }

    @Override
    public Xor createXor() { return new XorEvaluator(); }
}