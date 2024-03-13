package fr.neontus.trading.common.equals;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AutomaticComparisonUtils 
{
	public static final boolean areEquals(Object a, Object b)
	{
		if (a.getClass().equals(b.getClass()))
		{
			return areValuesEquals(a, b);
		}
		
		return false;
	}
	
	private static final <ObjectType> boolean areValuesEquals(ObjectType a, ObjectType b)
	{
		if (a.getClass().equals(b.getClass()))
		{
			List<Field> annoted_fields = getMethodsAnnotatedWith(a.getClass(), Equalable.class);
			
			for (Field field : annoted_fields)
			{
				if (!isFieldEquals(field, a, b))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static <ObjectType> List<Field> getMethodsAnnotatedWith(final Class<?> type, final Class<? extends Annotation> annotation) {
	    final List<Field> attributes = new ArrayList<Field>();
	    Class<?> klass = type;
	    while (klass != Object.class) { // need to traverse a type hierarchy in order to process methods from super types
	        // iterate though the list of methods declared in the class represented by klass variable, and add those annotated with the specified annotation
	        for (final Field field : klass.getDeclaredFields()) {
	            if (field.isAnnotationPresent(annotation)) {
	                // Annotation annotInstance = field.getAnnotation(annotation);
	                // TODO process annotInstance
	                attributes.add(field);
	            }
	        }
	        // move to the upper class in the hierarchy in search for more methods
	        klass = klass.getSuperclass();
	    }
	    return attributes;
	}
	
	private static <ObjectType> boolean isFieldEquals(Field field, ObjectType a, ObjectType b)
	{
		try
		{
			field.setAccessible(true);
			return (field.get(a).equals(field.get(b)));
		} catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		return false;
	}
}