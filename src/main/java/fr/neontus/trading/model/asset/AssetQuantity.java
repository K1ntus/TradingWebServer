package fr.neontus.trading.model.asset;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AssetQuantity extends AData implements IEqualable, ISingleDataHolder<Integer>{
	public static final AssetQuantity EmptyAssetQuantity = new AssetQuantity(0);
	
	@Equalable
	@Printable
	private int _quantity;
	
	public AssetQuantity(int quantity)
	{
		quantity = 0;
		if (quantity > 0)
		{
			this._quantity = quantity;
		}
	}
	
	public Integer value()
	{
		return this._quantity;
	}
	
	public void increment()
	{
		this._quantity++;
	}
	
	public void decrement()
	{
		if (this._quantity > 0)
		{
			this._quantity--;
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
