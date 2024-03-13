package fr.neontus.trading.common.utils.equals;

public interface IEqualable 
{
	default boolean equals(IEqualable a)
	{
		return AutomaticComparisonUtils.areEquals(this, a);
	}
}
