package fr.neontus.trading.common.utils.stringify;

public abstract class APrintable 
{
	public String toString()
	{
		return AutomaticStringifyUtils.stringify(this);
	}
}
