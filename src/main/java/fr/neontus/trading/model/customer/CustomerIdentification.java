package fr.neontus.trading.model.customer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;
import fr.neontus.trading.common.utils.equals.IEqualable;
import fr.neontus.trading.common.utils.stringify.APrintable;
import fr.neontus.trading.common.utils.stringify.Printable;

@JsonRootName("customerId")
public class CustomerIdentification extends APrintable implements IEqualable {

	@Printable
	@Equalable
	private String name;
	
	public CustomerIdentification(String name)
	{
		this.setName(name);
	}
	/**
	 * @return the name
	 */
	@JsonGetter("name")
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
