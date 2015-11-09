/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Levvy055
 *
 */
public interface Editor extends Hoster {
	
	/**
	 * @return The userLogoSmall
	 */
	String getUserLogoSmall();
	
}