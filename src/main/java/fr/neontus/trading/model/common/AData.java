package fr.neontus.trading.model.common;

import fr.neontus.trading.common.utils.equals.Equalable;

public abstract class AData implements IData
{
	@Equalable
	private UniqueIdentifier identifier = new UniqueIdentifier();
	

	public UniqueIdentifier getUUID()
	{
		return this.identifier;
	}
}
