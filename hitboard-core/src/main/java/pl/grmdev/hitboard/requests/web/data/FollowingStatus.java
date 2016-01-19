package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface FollowingStatus {
	
	/**
	 * @return
	 * 			The followId
	 */
	String getFollowId();
	
	/**
	 * @param followId
	 *           The follow_id
	 */
	void setFollowId(String followId);
	
	/**
	 * @return
	 * 			The followerUserId
	 */
	String getFollowerUserId();
	
	/**
	 * @param followerUserId
	 *           The follower_user_id
	 */
	void setFollowerUserId(String followerUserId);
	
	/**
	 * @return
	 * 			The followerNotify
	 */
	String getFollowerNotify();
	
	/**
	 * @param followerNotify
	 *           The follower_notify
	 */
	void setFollowerNotify(String followerNotify);
	
}