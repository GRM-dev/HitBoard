/**
 * 
 */
package pl.grmdev.hitboard.utils;

import java.lang.reflect.Array;
import java.util.*;
/**
 * @author Levvy055
 */
class ArrayUtil {
	
	public static Object[] disperseToArray(Object obj) {
		return disperseToList(obj).toArray();
	}
	
	public static List disperseToList(Object obj) {
		if (!obj.getClass().isArray()) {
			return null;
		}
		Class<?> ofArray = obj.getClass().getComponentType();
		List ar = new ArrayList();
		int length = Array.getLength(obj);
		for (int i = 0; i < length; i++) {
			Object o = Array.get(obj, i);
			ar.add(o.getClass().cast(o));
		}
		return ar;
	}
}
