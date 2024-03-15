package fr.neontus.trading.model.customer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.customer.exception.UninitializedWalletException;
import fr.neontus.trading.model.customer.exception.WalletAlreadyLoggedException;

@JsonRootName("Client")
public class Client extends AData 
{
	@Printable
	@Equalable
	private CustomerIdentification identification;

	@Printable
	@Equalable
	private WalletHolder wallet_holder;
	
	public Client (String name)
	{
		System.out.println("Creating identifier: " + name + "...");
		this.identification = new CustomerIdentification(name);
		System.out.println("Creating Wallet Holder...");
		this.wallet_holder = new WalletHolder();
	}

	@JsonGetter("Id")
	public CustomerIdentification getIdentification()
	{
		return this.identification;
	}
	
	@JsonGetter("Wallets")
	public WalletHolder getWallets()
	{
		return this.wallet_holder;
	}
	
	public boolean addWallet(Wallet wallet)
	{
		try 
		{
			this.wallet_holder.addWallet(wallet);
			return true;
		}
		catch (UninitializedWalletException | WalletAlreadyLoggedException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setData(String type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AData deserialize(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
