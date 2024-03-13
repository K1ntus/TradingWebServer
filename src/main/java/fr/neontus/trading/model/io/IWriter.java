package fr.neontus.trading.model.io;

public interface IWriter {
	public boolean connect();
	public boolean write(String string);
}
