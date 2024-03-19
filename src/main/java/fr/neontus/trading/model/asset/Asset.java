package fr.neontus.trading.model.asset;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.stringify.Printable;
import fr.neontus.trading.model.common.AData;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Asset extends AData {

	@Equalable
	@Printable
	private AssetExchange 			exchange;
	
	@Equalable
	@Printable
	private AssetPrice 				price;
	
	@Equalable
	@Printable
	private AssetSector				sector;
	
	@Equalable
	@Printable
	private AssetSymbol				symbol;
	
	@Equalable
	@Printable
	private AssetVolume				volume;
	
	public Asset()
	{
		this.exchange = new AssetExchange();
		this.price = new AssetPrice();
		this.sector = new AssetSector();
		this.symbol = new AssetSymbol();
		this.volume = new AssetVolume();
	}
	
	
	@Override
	public String getData() {
		List<String> result = new ArrayList<>();

		result.add(exchange.getData());
		result.add(price.getData());
		result.add(sector.getData());
		result.add(symbol.getData());
		result.add(volume.getData());

		return result.toString();
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


	/**
	 * @return the exchange
	 */
	public AssetExchange getExchange() {
		return exchange;
	}


	/**
	 * @param exchange the exchange to set
	 */
	public void setExchange(AssetExchange exchange) {
		this.exchange = exchange;
	}


	/**
	 * @return the price
	 */
	public AssetPrice getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(AssetPrice price) {
		this.price = price;
	}


	/**
	 * @return the sector
	 */
	public AssetSector getSector() {
		return sector;
	}


	/**
	 * @param sector the sector to set
	 */
	public void setSector(AssetSector sector) {
		this.sector = sector;
	}


	/**
	 * @return the symbol
	 */
	public AssetSymbol getSymbol() {
		return symbol;
	}


	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(AssetSymbol symbol) {
		this.symbol = symbol;
	}


	/**
	 * @return the volume
	 */
	public AssetVolume getVolume() {
		return volume;
	}


	/**
	 * @param volume the volume to set
	 */
	public void setVolume(AssetVolume volume) {
		this.volume = volume;
	}

}
