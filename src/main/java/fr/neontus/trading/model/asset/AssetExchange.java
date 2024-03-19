package fr.neontus.trading.model.asset;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AssetExchange extends AData implements ISingleDataHolder<String>
{
	public static final String __INVALID_EXCHANGE_PLATFORM = "No Platform";
	
	@Equalable
	@Printable
	private String exchange;

	public AssetExchange()
	{
		this(__INVALID_EXCHANGE_PLATFORM);
	}
	
	public AssetExchange(String str)
	{
		this.exchange = str;
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

	@Override
	public String value() {
		return exchange;
	}

}
