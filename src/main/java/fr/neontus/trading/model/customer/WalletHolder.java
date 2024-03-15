package fr.neontus.trading.model.customer;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.APrintable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.UniqueIdentifier;
import fr.neontus.trading.model.customer.exception.NoWalletException;
import fr.neontus.trading.model.customer.exception.UninitializedWalletException;
import fr.neontus.trading.model.customer.exception.WalletAlreadyLoggedException;

public class WalletHolder extends APrintable implements IEqualable
{
	@Printable
	@Equalable
	private Map<UniqueIdentifier, Wallet> wallets;

	public WalletHolder()
	{
		this.wallets = getNewWallet();
	}
	
	public WalletHolder(Map<UniqueIdentifier, Wallet> wallets)
	{
		if (wallets != null)
		{
			this.wallets = wallets;
		}
	}
	
	@JsonGetter("wallets")
	public Map<UniqueIdentifier, Wallet> wallets()
	{
		return this.wallets;
	}
	
	private Map<UniqueIdentifier, Wallet> getNewWallet()
	{
		return new HashMap<UniqueIdentifier, Wallet>();
	}
	
	public Wallet getWallet(UniqueIdentifier uuid) throws NoWalletException
	{
		if (this.wallets.containsKey(uuid))
		{
			return this.wallets.get(uuid);
		}
		
		throw new NoWalletException();
	}
	
	public void addWallet(Wallet ... wallets) throws UninitializedWalletException, WalletAlreadyLoggedException
	{
		if (this.wallets != null)
		{
			Map<UniqueIdentifier, Wallet> new_wallets = getNewWallet();
			for (Wallet wallet : wallets)
			{
				if (!this.wallets.containsKey(wallet.getUUID()))
				{
					new_wallets.put(wallet.getUUID(), wallet);
				}
				else
				{
					throw new WalletAlreadyLoggedException();
				}
			}	
			
			// Replace old wallet by new one
			this.wallets = new_wallets;
		}
		else
		{
			throw new UninitializedWalletException();
		}
	}
}
