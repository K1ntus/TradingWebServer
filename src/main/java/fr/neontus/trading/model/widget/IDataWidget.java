package fr.neontus.trading.model.widget;

import fr.neontus.trading.model.common.IData;
import fr.neontus.trading.model.io.connection.IDataConnection;

public interface IDataWidget {
	public IData getData();
	public IDataConnection getOrCreateDataConnection();
}
