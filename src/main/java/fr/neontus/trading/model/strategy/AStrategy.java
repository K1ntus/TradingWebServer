package fr.neontus.trading.model.strategy;

import fr.neontus.trading.model.pricing.Price;

public abstract class AStrategy implements IStrategy 
{
	private StrategyType type = StrategyType.Invalid;
	
	public AStrategy(StrategyType type)
	{
		this.setType(type);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shouldBuy(Price price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shouldSell(Price price) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the type
	 */
	public StrategyType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(StrategyType type) {
		this.type = type;
	}
}
