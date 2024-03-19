package fr.neontus.trading.model.asset;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AssetVolume extends AData implements ISingleDataHolder<Long>
{
	public static final long __UNDEFINED_VOLUME = 0L;
	
	@Equalable
	@Printable
	private long volume;
	
	public AssetVolume()
	{
		this(__UNDEFINED_VOLUME);
	}
	
	public AssetVolume(long volume)
	{
		this.volume = volume;
	}
	
	public Long value()
	{
		return volume;
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
