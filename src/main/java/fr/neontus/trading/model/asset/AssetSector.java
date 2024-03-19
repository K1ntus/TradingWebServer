package fr.neontus.trading.model.asset;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;
import fr.neontus.trading.model.common.ISingleDataHolder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AssetSector extends AData implements ISingleDataHolder<EAssetSector>
{
	@Equalable
	@Printable
	private EAssetSector sector;
	
	public AssetSector()
	{
		this(EAssetSector.UNDEFINED);
	}
	
	public AssetSector(EAssetSector sector)
	{
		this.sector = sector;
	}
	
	public EAssetSector value()
	{
		return this.sector;
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
