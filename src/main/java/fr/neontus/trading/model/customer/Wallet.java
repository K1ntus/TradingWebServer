package fr.neontus.trading.model.customer;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.asset.Asset;
import fr.neontus.trading.model.asset.AssetQuantity;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.UniqueIdentifier;
import fr.neontus.trading.model.customer.exception.AssetAlreadyExisting;
import fr.neontus.trading.model.customer.exception.NoAssetException;
import fr.neontus.trading.model.pricing.CurrencyType;

@JsonRootName("Wallet")
public class Wallet extends AData {

	@Equalable
	@Printable
	private WalletIdentifier id;

	@Printable
	@Equalable
	private CurrencyType currency;

	@Printable
	@Equalable
	private Map<Asset, AssetQuantity> assets;
	
	@Printable
	@Equalable
	private Map<UniqueIdentifier, Asset> assets_mapping;
	
	public Wallet()
	{
		this.id = new WalletIdentifier();
		System.out.println("Initializing new wallet: " + id + "...");
		this.currency = CurrencyType.EURO;
		this.assets = new HashMap<>();
		this.assets_mapping = new HashMap<>();
		System.out.println("Initializing new wallet: OK");
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
	
	public void addAsset(Asset asset) throws AssetAlreadyExisting
	{
		this.addAsset(asset, AssetQuantity.EmptyAssetQuantity);
	}
	
	public void addAsset(Asset asset, AssetQuantity assetQuantity) throws AssetAlreadyExisting
	{
		if (!this.assets.containsKey(asset))
		{
			this.assets.put(asset, assetQuantity);
			this.assets_mapping.put(asset.getUUID(), asset);
		}
		else
		{
			throw new AssetAlreadyExisting();
		}
	}
	
	public Asset getAsset(UniqueIdentifier uuid) throws NoAssetException
	{
		if (this.assets_mapping.containsKey(uuid))
		{
			return this.assets_mapping.get(uuid);
		}
		
		throw new NoAssetException();
	}

	public void incrementAssetQuantity(Asset asset, int amount)
	{
		for (int i = 0; i < amount; ++i)
		{
			this.incrementAssetQuantity(asset.getUUID());
		}
	}
	
	public void incrementAssetQuantity(UniqueIdentifier uid, int amount)
	{
		for (int i = 0; i < amount; ++i)
		{
			this.incrementAssetQuantity(uid);
		}
	}
	
	public void incrementAssetQuantity(UniqueIdentifier uid)
	{
		try {
			this.incrementAssetQuantity(this.getAsset(uid));
		} catch (NoAssetException e) {
			e.printStackTrace();
		}
	}
	
	public void incrementAssetQuantity(Asset asset) throws NoAssetException
	{
		if (this.assets.containsKey(asset))
		{
			this.assets.get(asset).increment();
		}
		else
		{
			throw new NoAssetException();
		}
	}

	public void decrementAssetQuantity(Asset asset, int amount)
	{
		for (int i = 0; i < amount; ++i)
		{
			this.decrementAssetQuantity(asset.getUUID());
		}
	}
	
	public void decrementAssetQuantity(UniqueIdentifier uid, int amount)
	{
		for (int i = 0; i < amount; ++i)
		{
			this.decrementAssetQuantity(uid);
		}
	}
	
	public void decrementAssetQuantity(UniqueIdentifier uid)
	{
		try {
			this.decrementAssetQuantity(this.getAsset(uid));
		} catch (NoAssetException e) {
			e.printStackTrace();
		}
	}
	
	public void decrementAssetQuantity(Asset asset) throws NoAssetException
	{
		if (this.assets.containsKey(asset))
		{
			this.assets.get(asset).decrement();
		}
		else
		{
			throw new NoAssetException();
		}
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
	
	public void deleteAsset(UniqueIdentifier uuid)
	{
		try {
			Asset asset_to_remove = this.getAsset(uuid);
			this.deleteAsset(asset_to_remove);
		} catch (NoAssetException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAsset(Asset asset) throws NoAssetException
	{
		if (this.assets.containsKey(asset))
		{
			UniqueIdentifier asset_to_remove_uuid = asset.getUUID();
			
			this.assets_mapping.remove(asset_to_remove_uuid);
			this.assets.remove(asset);
		}
		else
		{
			throw new NoAssetException();
		}
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
