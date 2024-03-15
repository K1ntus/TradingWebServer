package fr.neontus.trading.model.customer;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.UniqueIdentifier;

public class WalletIdentifier {
	@Printable
	@Equalable
	private UniqueIdentifier uuid;

	@Printable
	@Equalable
	private String name;
	
	public UniqueIdentifier uuid()
	{
		return this.uuid;
	}
}
