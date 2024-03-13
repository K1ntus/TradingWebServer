package fr.neontus.trading.model.common;

public interface IData<Type>
{
	 public UniqueIdentifier getUUID();
	 public String getData();
	 public boolean setData(String type);
	 public String serialize();
	 public Type deserialize(String str);
}
