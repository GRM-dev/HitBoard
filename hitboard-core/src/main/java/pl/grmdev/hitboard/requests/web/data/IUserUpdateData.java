package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface IUserUpdateData {
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserId()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserId()
	 */
	String getUserId();
	
	/**
	 * @param userId
	 *           The user_id
	 */
	void setUserId(String userId);
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserName()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserName()
	 */
	String getUserName();
	
	/**
	 * @param userName
	 *           The user_name
	 */
	void setUserName(String userName);
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterAccount()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getTwitterAccount()
	 */
	String getTwitterAccount();
	
	/**
	 * @param twitterAccount
	 *           The twitter_account
	 */
	void setTwitterAccount(String twitterAccount);
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterEnabled()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getTwitterEnabled()
	 */
	String getTwitterEnabled();
	
	/**
	 * @param twitterEnabled
	 *           The twitter_enabled
	 */
	void setTwitterEnabled(String twitterEnabled);
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserEmail()
	 */
	String getUserEmail();
	
	/**
	 * @param userEmail
	 *           The user_email
	 */
	void setUserEmail(String userEmail);
	
	String getUserDisplayName();
	
	void setUserDisplayName(String userDisplayName);
	
}