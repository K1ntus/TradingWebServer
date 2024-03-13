package fr.neontus.trading.model.customer;

import fr.neontus.trading.model.common.UniqueIdentifier;

public class WalletIdentifier {
	private UniqueIdentifier uuid;
	private String name;
	
	public UniqueIdentifier uuid()
	{
		return this.uuid;
	}
}
