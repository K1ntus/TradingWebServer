package fr.neontus.trading.model.customer;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.APrintable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.UniqueIdentifier;

public class WalletIdentifier extends APrintable implements IEqualable 
{
	@Printable
	@Equalable
	private UniqueIdentifier uuid;

	@Printable
	@Equalable
	private String name;
	
	public WalletIdentifier()
	{
		this.name = "Invalid";
		this.uuid = new UniqueIdentifier();
	}
	
	public UniqueIdentifier uuid()
	{
		return this.uuid;
	}
}
