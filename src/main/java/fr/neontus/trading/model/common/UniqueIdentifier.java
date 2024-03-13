package fr.neontus.trading.model.common;

import java.util.UUID;

import fr.neontus.trading.common.utils.equals.IEqualable;

public class UniqueIdentifier implements IEqualable 
{
	private UUID _unique_identifier;
	
	public UniqueIdentifier()
	{
		 this._unique_identifier = UUID.randomUUID();
	}

	/**
	 * @return the _unique_identifier
	 */
	public UUID uuid() {
		return _unique_identifier;
	}

	/**
	 * @param _unique_identifier the _unique_identifier to set
	 */
	public void setUUID(UUID _unique_identifier) {
		this._unique_identifier = _unique_identifier;
	}
	
	
}
