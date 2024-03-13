package fr.neontus.trading.model.strategy;

import fr.neontus.trading.model.pricing.Price;

public interface IStrategy 
{
	public void tick();
	
	public void shouldBuy(Price price);
	
	public void shouldSell(Price price);
}
