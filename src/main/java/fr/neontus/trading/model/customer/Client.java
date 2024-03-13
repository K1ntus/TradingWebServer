package fr.neontus.trading.model.customer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.model.common.AData;

@JsonRootName("Client")
public class Client extends AData 
{
	@Equalable
	private CustomerIdentification identification;
	
	@Equalable
	private WalletHolder wallet_holder;
	
	public Client (String name)
	{
		this.identification = new CustomerIdentification(name);
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
