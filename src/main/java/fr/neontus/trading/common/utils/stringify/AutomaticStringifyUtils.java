package fr.neontus.trading.common.utils.stringify;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class AutomaticStringifyUtils 
{
	public static final <T> String stringify(T a)
	{
		return stringifier(a);
	}
	
	private static final <T> String stringifier(T a)
	{
		Map<String, String> annoted_fields = getMethodsAnnotatedWith(a, Printable.class);
		
		return annoted_fields.toString();
	}
	
	private static <T> Map<String, String> getMethodsAnnotatedWith(T a, final Class<? extends Annotation> annotation) {
	    final Map<String, String> attributes = new HashMap<String, String>();
    	System.out.println("class: " + a.getClass().getName());
	    Class<?> klass = a.getClass();
	    while (klass != Object.class) { // need to traverse a type hierarchy in order to process methods from super types
	        // iterate though the list of methods declared in the class represented by klass variable, and add those annotated with the specified annotation
	        for (final Field field : klass.getDeclaredFields()) {
	            if (field.isAnnotationPresent(annotation)) {
	                // Annotation annotInstance = field.getAnnotation(annotation);
	                // TODO process annotInstance
	                try {
	                	field.setAccessible(true);
	                	final String key = klass.getSimpleName();
	                	String result = key.substring(key.lastIndexOf(".") + 1);
						attributes.put(result + "." + field.getName(), field.get(a).toString());
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
	                //attributes.putAll(getMethodsAnnotatedWith(a, Printable.class));
	            }
	        }
	        // move to the upper class in the hierarchy in search for more methods
	        klass = klass.getSuperclass();
	    }
	    return attributes;
	}
	
}