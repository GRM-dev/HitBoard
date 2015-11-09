/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.*;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"user_status", "twitter_enabled", "user_beta_profile",
		"user_name", "user_logo", "media_live_since", "livestream_count",
		"user_logo_small", "user_cover", "media_is_live", "channel_link",
		"followers", "user_id", "user_partner", "user_media_id",
		"twitter_account"})
public class ChannelData implements Editor {
	
	@JsonProperty("user_status")
	private String userStatus;
	@JsonProperty("twitter_enabled")
	private Object twitterEnabled;
	@JsonProperty("user_beta_profile")
	private String userBetaProfile;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("user_logo")
	private String userLogo;
	@JsonProperty("media_live_since")
	private Object mediaLiveSince;
	@JsonProperty("livestream_count")
	private String livestreamCount;
	@JsonProperty("user_logo_small")
	private String userLogoSmall;
	@JsonProperty("user_cover")
	private Object userCover;
	@JsonProperty("media_is_live")
	private String mediaIsLive;
	@JsonProperty("channel_link")
	private String channelLink;
	@JsonProperty("followers")
	private String followers;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_partner")
	private Object userPartner;
	@JsonProperty("user_media_id")
	private String userMediaId;
	@JsonProperty("twitter_account")
	private Object twitterAccount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public ChannelData() {}
	
	/**
	 * @param userBetaProfile
	 * @param twitterAccount
	 * @param userPartner
	 * @param userCover
	 * @param livestreamCount
	 * @param userMediaId
	 * @param followers
	 * @param channelLink
	 * @param userLogo
	 * @param mediaLiveSince
	 * @param userId
	 * @param userStatus
	 * @param mediaIsLive
	 * @param userName
	 * @param userLogoSmall
	 * @param twitterEnabled
	 */
	public ChannelData(String userStatus, Object twitterEnabled,
			String userBetaProfile, String userName, String userLogo,
			Object mediaLiveSince, String livestreamCount, String userLogoSmall,
			Object userCover, String mediaIsLive, String channelLink,
			String followers, String userId, Object userPartner,
			String userMediaId, Object twitterAccount) {
		this.userStatus = userStatus;
		this.twitterEnabled = twitterEnabled;
		this.userBetaProfile = userBetaProfile;
		this.userName = userName;
		this.userLogo = userLogo;
		this.mediaLiveSince = mediaLiveSince;
		this.livestreamCount = livestreamCount;
		this.userLogoSmall = userLogoSmall;
		this.userCover = userCover;
		this.mediaIsLive = mediaIsLive;
		this.channelLink = channelLink;
		this.followers = followers;
		this.userId = userId;
		this.userPartner = userPartner;
		this.userMediaId = userMediaId;
		this.twitterAccount = twitterAccount;
	}
	
	/**
	 * @return The userStatus
	 */
	@JsonProperty("user_status")
	public String getUserStatus() {
		return userStatus;
	}
	
	/**
	 * @param userStatus
	 *            The user_status
	 */
	@JsonProperty("user_status")
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	/**
	 * @return The twitterEnabled
	 */
	@JsonProperty("twitter_enabled")
	public Object getTwitterEnabled() {
		return twitterEnabled;
	}
	
	/**
	 * @param twitterEnabled
	 *            The twitter_enabled
	 */
	@JsonProperty("twitter_enabled")
	public void setTwitterEnabled(Object twitterEnabled) {
		this.twitterEnabled = twitterEnabled;
	}
	
	/**
	 * @return The userBetaProfile
	 */
	@JsonProperty("user_beta_profile")
	public String getUserBetaProfile() {
		return userBetaProfile;
	}
	
	/**
	 * @param userBetaProfile
	 *            The user_beta_profile
	 */
	@JsonProperty("user_beta_profile")
	public void setUserBetaProfile(String userBetaProfile) {
		this.userBetaProfile = userBetaProfile;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Editor#getUserName()
	 */
	@Override
	@JsonProperty("user_name")
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName
	 *            The user_name
	 */
	@JsonProperty("user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Editor#getUserLogo()
	 */
	@Override
	@JsonProperty("user_logo")
	public String getUserLogo() {
		return userLogo;
	}
	
	/**
	 * @param userLogo
	 *            The user_logo
	 */
	@JsonProperty("user_logo")
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	
	/**
	 * @return The mediaLiveSince
	 */
	@JsonProperty("media_live_since")
	public Object getMediaLiveSince() {
		return mediaLiveSince;
	}
	
	/**
	 * @param mediaLiveSince
	 *            The media_live_since
	 */
	@JsonProperty("media_live_since")
	public void setMediaLiveSince(Object mediaLiveSince) {
		this.mediaLiveSince = mediaLiveSince;
	}
	
	/**
	 * @return The livestreamCount
	 */
	@JsonProperty("livestream_count")
	public String getLivestreamCount() {
		return livestreamCount;
	}
	
	/**
	 * @param livestreamCount
	 *            The livestream_count
	 */
	@JsonProperty("livestream_count")
	public void setLivestreamCount(String livestreamCount) {
		this.livestreamCount = livestreamCount;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Editor#getUserLogoSmall()
	 */
	@Override
	@JsonProperty("user_logo_small")
	public String getUserLogoSmall() {
		return userLogoSmall;
	}
	
	/**
	 * @param userLogoSmall
	 *            The user_logo_small
	 */
	@JsonProperty("user_logo_small")
	public void setUserLogoSmall(String userLogoSmall) {
		this.userLogoSmall = userLogoSmall;
	}
	
	/**
	 * @return The userCover
	 */
	@JsonProperty("user_cover")
	public Object getUserCover() {
		return userCover;
	}
	
	/**
	 * @param userCover
	 *            The user_cover
	 */
	@JsonProperty("user_cover")
	public void setUserCover(Object userCover) {
		this.userCover = userCover;
	}
	
	/**
	 * @return The mediaIsLive
	 */
	@JsonProperty("media_is_live")
	public String getMediaIsLive() {
		return mediaIsLive;
	}
	
	/**
	 * @param mediaIsLive
	 *            The media_is_live
	 */
	@JsonProperty("media_is_live")
	public void setMediaIsLive(String mediaIsLive) {
		this.mediaIsLive = mediaIsLive;
	}
	
	/**
	 * @return The channelLink
	 */
	@JsonProperty("channel_link")
	public String getChannelLink() {
		return channelLink;
	}
	
	/**
	 * @param channelLink
	 *            The channel_link
	 */
	@JsonProperty("channel_link")
	public void setChannelLink(String channelLink) {
		this.channelLink = channelLink;
	}
	
	/**
	 * @return The followers
	 */
	@JsonProperty("followers")
	public String getFollowers() {
		return followers;
	}
	
	/**
	 * @param followers
	 *            The followers
	 */
	@JsonProperty("followers")
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
	/**
	 * @return The userId
	 */
	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId
	 *            The user_id
	 */
	@JsonProperty("user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return The userPartner
	 */
	@JsonProperty("user_partner")
	public Object getUserPartner() {
		return userPartner;
	}
	
	/**
	 * @param userPartner
	 *            The user_partner
	 */
	@JsonProperty("user_partner")
	public void setUserPartner(Object userPartner) {
		this.userPartner = userPartner;
	}
	
	/**
	 * @return The userMediaId
	 */
	@JsonProperty("user_media_id")
	public String getUserMediaId() {
		return userMediaId;
	}
	
	/**
	 * @param userMediaId
	 *            The user_media_id
	 */
	@JsonProperty("user_media_id")
	public void setUserMediaId(String userMediaId) {
		this.userMediaId = userMediaId;
	}
	
	/**
	 * @return The twitterAccount
	 */
	@JsonProperty("twitter_account")
	public Object getTwitterAccount() {
		return twitterAccount;
	}
	
	/**
	 * @param twitterAccount
	 *            The twitter_account
	 */
	@JsonProperty("twitter_account")
	public void setTwitterAccount(Object twitterAccount) {
		this.twitterAccount = twitterAccount;
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
}