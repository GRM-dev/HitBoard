package pl.grmdev.hitboard.requests.web.data;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"followers", "user_name", "user_id", "user_logo", "user_logo_small", "follow_id", "follower_user_id", "follower_notify", "date_added"})
public class Follower implements FollowingStatus {

	@JsonProperty("followers")
	private String						followers;
	@JsonProperty("user_name")
	private String						userName;
	@JsonProperty("user_id")
	private String						userId;
	@JsonProperty("user_logo")
	private String						userLogo;
	@JsonProperty("user_logo_small")
	private String						userLogoSmall;
	@JsonProperty("follow_id")
	private String						followId;
	@JsonProperty("follower_user_id")
	private String						followerUserId;
	@JsonProperty("follower_notify")
	private String						followerNotify;
	@JsonProperty("date_added")
	private String						dateAdded;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
																		
	/**
	 * @return
	 * 			The followers
	 */
	@JsonProperty("followers")
	public String getFollowers() {
		return followers;
}

	/**
	 * @param followers
	 *           The followers
	 */
	@JsonProperty("followers")
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
	/**
	 * @return
	 * 			The userName
	 */
	@JsonProperty("user_name")
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName
	 *           The user_name
	 */
	@JsonProperty("user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return
	 * 			The userId
	 */
	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId
	 *           The user_id
	 */
	@JsonProperty("user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return
	 * 			The userLogo
	 */
	@JsonProperty("user_logo")
	public String getUserLogo() {
		return userLogo;
	}
	
	/**
	 * @param userLogo
	 *           The user_logo
	 */
	@JsonProperty("user_logo")
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	
	/**
	 * @return
	 * 			The userLogoSmall
	 */
	@JsonProperty("user_logo_small")
	public String getUserLogoSmall() {
		return userLogoSmall;
	}
	
	/**
	 * @param userLogoSmall
	 *           The user_logo_small
	 */
	@JsonProperty("user_logo_small")
	public void setUserLogoSmall(String userLogoSmall) {
		this.userLogoSmall = userLogoSmall;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.FollowingStatus#getFollowId()
	 */
	@Override
	@JsonProperty("follow_id")
	public String getFollowId() {
		return followId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.FollowingStatus#setFollowId(java.lang
	 * .String)
	 */
	@Override
	@JsonProperty("follow_id")
	public void setFollowId(String followId) {
		this.followId = followId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.FollowingStatus#getFollowerUserId()
	 */
	@Override
	@JsonProperty("follower_user_id")
	public String getFollowerUserId() {
		return followerUserId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.FollowingStatus#setFollowerUserId(
	 * java.lang.String)
	 */
	@Override
	@JsonProperty("follower_user_id")
	public void setFollowerUserId(String followerUserId) {
		this.followerUserId = followerUserId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.FollowingStatus#getFollowerNotify()
	 */
	@Override
	@JsonProperty("follower_notify")
	public String getFollowerNotify() {
		return followerNotify;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.FollowingStatus#setFollowerNotify(
	 * java.lang.String)
	 */
	@Override
	@JsonProperty("follower_notify")
	public void setFollowerNotify(String followerNotify) {
		this.followerNotify = followerNotify;
	}
	
	/**
	 * @return
	 * 			The dateAdded
	 */
	@JsonProperty("date_added")
	public String getDateAdded() {
		return dateAdded;
	}
	
	/**
	 * @param dateAdded
	 *           The date_added
	 */
	@JsonProperty("date_added")
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(followers).append(userName).append(userId).append(userLogo).append(userLogoSmall).append(followId).append(followerUserId).append(followerNotify)
			.append(dateAdded).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Follower) == false) { return false; }
		Follower rhs = ((Follower) other);
		return new EqualsBuilder().append(followers, rhs.followers).append(userName, rhs.userName).append(userId, rhs.userId).append(userLogo, rhs.userLogo).append(userLogoSmall, rhs.userLogoSmall)
			.append(followId, rhs.followId).append(followerUserId, rhs.followerUserId).append(followerNotify, rhs.followerNotify).append(dateAdded, rhs.dateAdded)
			.append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}