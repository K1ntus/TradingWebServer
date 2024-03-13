package fr.neontus.trading.model.strategy;

import fr.neontus.trading.model.strategy.exception.InvalidStrategyException;
import fr.neontus.trading.model.strategy.exception.NoStrategyFoundException;
import fr.neontus.trading.model.strategy.exception.StrategyException;
import fr.neontus.trading.model.strategy.implementation.BreakoutStrategy;
import fr.neontus.trading.model.strategy.implementation.CarryTradeStrategy;
import fr.neontus.trading.model.strategy.implementation.MeanReversionStrategy;
import fr.neontus.trading.model.strategy.implementation.MomentumStrategy;
import fr.neontus.trading.model.strategy.implementation.MovingAverageStrategy;
import fr.neontus.trading.model.strategy.implementation.ReversalStrategy;

public class StrategyFactory 
{
	
	public IStrategy createStrategy(StrategyType type) throws StrategyException
	{
		IStrategy strategy = null;
		switch (type)
		{
			case Breakout:
			{
				strategy = new BreakoutStrategy();
				break;
			}
			case CarryTrade:
			{
				strategy = new CarryTradeStrategy();
				break;
			}
			case MeanReversion:
			{
				strategy = new MeanReversionStrategy();
				break;
			}
			case Momentum:
			{
				strategy = new MomentumStrategy();
				break;
			}
			case MovingAverage:
			{
				strategy = new MovingAverageStrategy();
				break;
			}
			case Reversal:
			{
				strategy = new ReversalStrategy();
				break;
			}
			case Invalid:
			{
				throw new InvalidStrategyException();
			}
			default:
			{
				throw new NoStrategyFoundException(type);
			}
		}
		
		return strategy;
	}

}
