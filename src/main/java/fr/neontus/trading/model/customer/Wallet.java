package fr.neontus.trading.model.customer;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.model.asset.Asset;
import fr.neontus.trading.model.asset.AssetQuantity;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.pricing.CurrencyType;

@JsonRootName("Wallet")
public class Wallet extends AData {

	@Equalable
	private WalletIdentifier id;
	
	private CurrencyType currency;
	
	private Map<Asset, AssetQuantity> assets;
	
	public Wallet()
	{
		this.id = new WalletIdentifier();
		this.currency = CurrencyType.EURO;
		this.assets = new HashMap<>();
	}
	
	
	@JsonGetter("id")
	public WalletIdentifier getId()
	{
		return this.id;
	}
	
	@JsonGetter("currency")
	public CurrencyType getUsedCurrency()
	{
		return currency;
	}
	
	@JsonGetter("assets")
	public Map<Asset, AssetQuantity> getAssets()
	{
		return this.assets;
	}
	
	public AssetQuantity getAssetQuantity(Asset asset)
	{
		return this.assets.get(asset);
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
