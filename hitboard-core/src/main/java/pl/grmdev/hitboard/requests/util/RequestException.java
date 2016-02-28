/**
 * 
 */
package pl.grmdev.hitboard.requests.util;


/**
 * @author Levvy055
 *
 */
public class RequestException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String requestType;
	
	/**
	 * 
	 */
	public RequestException() {
		super();
	}
	
	/**
	 * @param message
	 */
	public RequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param cause
	 */
	public RequestException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public RequestException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public RequestException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public RequestException(String requestType, String message, Throwable cause, boolean log, boolean timestamp) {
		this(message, cause);
		this.requestType = requestType;
		if (log) {
			if (timestamp) {
				// TODO: implement logger
			}
		}
	}
}
