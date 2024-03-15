package fr.neontus.trading.model.asset;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

public class AssetSymbol extends AData implements ISingleDataHolder<String>
{
	public static final String __UNDEFINED_SYMBOL = "UNDFD";
	
	@Equalable
	@Printable
	private String symbol;
	
	public AssetSymbol()
	{
		this(__UNDEFINED_SYMBOL);
	}
	
	public AssetSymbol(String str)
	{
		this.symbol = str;
	}
	
	public String value()
	{
		return this.symbol;
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
