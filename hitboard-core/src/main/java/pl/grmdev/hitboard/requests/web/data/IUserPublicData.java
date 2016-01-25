package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface IUserPublicData {
	
	/**
	 * @return The userId
	 */
	String getUserId();
	
	/**
	 * @return The userName
	 */
	String getUserName();
	
	/**
	 * @return The userLogo
	 */
	String getUserLogo();
	
	/**
	 * @return The userLogoSmall
	 */
	String getUserLogoSmall();
	
	/**
	 * @return The followers
	 */
	String getFollowers();
	
	/**
	 * @return
	 * 			The userCover
	 */
	String getUserCover();
	
	/**
	 * @return
	 * 			The userStatus
	 */
	String getUserStatus();
	
	/**
	 * @return
	 * 			The userIsBroadcaster
	 */
	Boolean getUserIsBroadcaster();
	
	/**
	 * @return
	 * 			The isLive
	 */
	String getIsLive();
	
	/**
	 * @return
	 * 			The liveSince
	 */
	String getLiveSince();
	
	/**
	 * @return
	 * 			The twitterAccount
	 */
	String getTwitterAccount();
	
	/**
	 * @return
	 * 			The twitterEnabled
	 */
	String getTwitterEnabled();
	
	/**
	 * @return
	 * 			The userBetaProfile
	 */
	String getUserBetaProfile();
	
}