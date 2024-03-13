package fr.neontus.trading.model.common;

import com.fasterxml.jackson.annotation.JsonGetter;

import fr.neontus.trading.common.utils.equals.Equalable;

public abstract class AData implements IData<AData>
{
	@Equalable
	private UniqueIdentifier identifier = new UniqueIdentifier();
	

	@JsonGetter("uuid")
	public UniqueIdentifier getUUID()
	{
		return this.identifier;
	}
}
