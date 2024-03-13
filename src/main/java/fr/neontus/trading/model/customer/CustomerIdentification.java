package fr.neontus.trading.model.customer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.neontus.trading.common.utils.equals.Equalable;

@JsonRootName("customerId")
public class CustomerIdentification {

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
