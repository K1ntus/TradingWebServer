package fr.neontus.trading.model.io.connection;

public interface IDataConnection 
{
	public boolean connect();
	public boolean get();
	public boolean isConnected();
}
