package fr.neontus.trading.model.common;

import com.fasterxml.jackson.annotation.JsonGetter;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.APrintable;

public abstract class AData extends APrintable implements IData<AData>, IEqualable
{
	@Equalable
	private UniqueIdentifier identifier = new UniqueIdentifier();
	

	@JsonGetter("uuid")
	public UniqueIdentifier getUUID()
	{
		return this.identifier;
	}
}
