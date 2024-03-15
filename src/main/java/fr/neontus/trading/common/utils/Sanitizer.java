package fr.neontus.trading.common.utils;

public class Sanitizer {

	public static final String EMPTY_STRING = "";
	public static String stringSanitizer(String str)
	{
		if (str == null)
		{
			return EMPTY_STRING;
		}
		
		str.trim();
		str.strip();
		
		return str;
	}
}
