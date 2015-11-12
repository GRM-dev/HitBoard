/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

/**
 * @author Levvy055
 *
 */
public interface Commercial {
	
	String getMethod();
	
	String getChannel();
	
	String getCount();
	
	String getDelay();
	
	String getToken();
	
	String getUrl();
	
	long getTimestamp();
	
}