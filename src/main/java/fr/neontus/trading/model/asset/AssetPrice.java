package fr.neontus.trading.model.asset;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

public class AssetPrice extends AData implements ISingleDataHolder<Double>
{
	public static final double __INVALID_PRICE = 0.;

	@Equalable
	@Printable
	private double price;
	
	public AssetPrice()
	{
		this(__INVALID_PRICE);
	}
	
	public AssetPrice(double value)
	{
		this.price = value;
	}
	

	@Override
	public Double value() {
		return this.price;
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
