package fr.neontus.trading.common.equals;

public interface IEqualable 
{
	default boolean equals(IEqualable a)
	{
		return AutomaticComparisonUtils.areEquals(this, a);
	}
}
