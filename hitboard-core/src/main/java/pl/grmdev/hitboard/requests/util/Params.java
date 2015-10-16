/**
 * 
 */
package pl.grmdev.hitboard.requests.util;

import java.util.*;
/**
 * @author Levvy055
 */
public class Params implements Iterable<String> {
	
	private Map<String, Object> params;
	
	public Params() {
		params = new HashMap<>();
	}
	
	/**
	 * @param key
	 *            without value (so null)
	 * @return new filled up param object
	 */
	public Params p(String key) {
		return p(key, null);
	}
	
	/**
	 * Adds new param to existing {@link Params} object and returns supplemented
	 * object
	 * 
	 * @param key
	 *            {@link String} value to which value is assigned
	 * @param value
	 *            object to add to params map
	 * @return supplemented {@link Params} object with new param
	 */
	public Params p(String key, Object value) {
		params.put(key, value);
		return this;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<String> iterator() {
		return params.keySet().iterator();
	}
	
	/**
	 * @param key
	 *            mapped to object you want receive
	 * @return object mapped to specified key
	 */
	public Object get(String key) {
		return params.get(key);
	}
	
	/**
	 * @return map of all params
	 */
	public Map<String, Object> getAll() {
		return params;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((params == null) ? 0 : params.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Params other = (Params) obj;
		if (params == null) {
			if (other.params != null)
				return false;
		} else if (params.equals(other.params))
			return true;
		if (params.size() == other.params.size()) {
			for (Iterator<String> it = iterator(); it.hasNext();) {
				if (!other.params.containsKey(it.next()))
					return false;
			}
			for (Iterator<String> it = other.iterator(); it.hasNext();) {
				if (!params.containsKey(it.next()))
					return false;
			}
			return true;
		}
		return false;
	}
	
	/**
	 * @return true if there is no params
	 */
	public boolean isEmpty() {
		return getAll().isEmpty();
	}
}
