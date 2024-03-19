package fr.neontus.trading.model.common;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.APrintable;
import fr.neontus.trading.common.utils.stringify.Printable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UniqueIdentifier extends APrintable implements IEqualable, Serializable
{
	private static final long serialVersionUID = -1212536877639554987L;
	@Printable
	@Equalable
	private UUID _unique_identifier;
	
	public UniqueIdentifier()
	{
		 this._unique_identifier = UUID.randomUUID();
	}

	/**
	 * @return the _unique_identifier
	 */
	public UUID value() {
		return _unique_identifier;
	}

	/**
	 * @param _unique_identifier the _unique_identifier to set
	 */
	public void setValue(UUID _unique_identifier) {
		this._unique_identifier = _unique_identifier;
	}
	
	
}
