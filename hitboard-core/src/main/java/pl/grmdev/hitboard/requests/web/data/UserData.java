	/**
* 
*/
package pl.grmdev.hitboard.requests.web.data;
	
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
	
/**
 * @author Levvy055
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData implements IUserPublicData, IUserPrivateData, IUserUpdateData {
	
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("user_logo")
	private String userLogo;
	@JsonProperty("user_logo_small")
	private String userLogoSmall;
	@JsonProperty("user_banned")
	private String userBanned;
	@JsonProperty("user_partner")
	private String userPartner;
	@JsonProperty("user_banned_channel")
	private String userBannedChannel;
	@JsonProperty("superadmin")
	private String superadmin;
	@JsonProperty("livestream_count")
	private String livestreamCount;
	@JsonProperty("followers")
	private String followers;
	@JsonProperty("authToken")
	private String authToken;
	@JsonProperty("login")
	private String login;
	@JsonProperty("app")
	private String app;
	@JsonProperty("user_cover")
	private String userCover;
	@JsonProperty("user_status")
	private String userStatus;
	@JsonProperty("user_is_broadcaster")
	private Boolean userIsBroadcaster;
	@JsonProperty("is_live")
	private String isLive;
	@JsonProperty("live_since")
	private String liveSince;
	@JsonProperty("twitter_account")
	private String twitterAccount;
	@JsonProperty("twitter_enabled")
	private String twitterEnabled;
	@JsonProperty("user_beta_profile")
	private String userBetaProfile;
	@JsonProperty("user_email")
	private String userEmail;
	@JsonProperty("partner_type")
	private String partnerType;
	@JsonProperty("media_is_live")
	private String mediaIsLive;
	@JsonProperty("media_live_since")
	private String mediaLiveSince;
	@JsonProperty("user_media_id")
	private String userMediaId;
	@JsonProperty("user_display_name")
	private String userDisplayName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	private UserData() {}
	
	/**
	 * @return The app
	 */
	@JsonProperty("app")
	public String getApp() {
		return app;
	}
	
	/**
	 * @param app
	 *           The app
	 */
	@JsonProperty("app")
	public void setApp(String app) {
		this.app = app;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserId()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserId()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getUserId()
	 */
	@Override
	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setUserId(java.lang.String)
	 */
	@Override
	@JsonProperty("user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserName()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserName()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getUserName()
	 */
	@Override
	@JsonProperty("user_name")
	public String getUserName() {
		return userName;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setUserName(java.lang.String)
	 */
	@Override
	@JsonProperty("user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserLogo()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserLogo()
	 */
	@Override
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
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserLogoSmall()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserLogoSmall()
	 */
	@Override
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
	
	/**
	 * @return The userBanned
	 */
	@JsonProperty("user_banned")
	public String getUserBanned() {
		return userBanned;
	}
	
	/**
	 * @param userBanned
	 *           The user_banned
	 */
	@JsonProperty("user_banned")
	public void setUserBanned(String userBanned) {
		this.userBanned = userBanned;
	}
	
	/**
	 * @return The superadmin
	 */
	@JsonProperty("superadmin")
	public String getSuperadmin() {
		return superadmin;
	}
	
	/**
	 * @param superadmin
	 *           The superadmin
	 */
	@JsonProperty("superadmin")
	public void setSuperadmin(String superadmin) {
		this.superadmin = superadmin;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getLivestreamCount()
	 */
	@Override
	@JsonProperty("livestream_count")
	public String getLivestreamCount() {
		return livestreamCount;
	}
	
	/**
	 * @param livestreamCount
	 *           The livestream_count
	 */
	@JsonProperty("livestream_count")
	public void setLivestreamCount(String livestreamCount) {
		this.livestreamCount = livestreamCount;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getFollowers()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getFollowers()
	 */
	@Override
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
	 * @return The authToken
	 */
	@JsonProperty("authToken")
	public String getAuthToken() {
		return authToken;
	}
	
	/**
	 * @param authToken
	 *           The authToken
	 */
	@JsonProperty("authToken")
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	/**
	 * @return The login
	 */
	@JsonProperty("login")
	public String getLogin() {
		return login;
	}
	
	/**
	 * @param login
	 *           The login
	 */
	@JsonProperty("login")
	public void setLogin(String login) {
		this.login = login;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserCover()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserCover()
	 */
	@Override
	@JsonProperty("user_cover")
	public String getUserCover() {
		return userCover;
	}
	
	/**
	 * @param userCover
	 *           The user_cover
	 */
	@JsonProperty("user_cover")
	public void setUserCover(String userCover) {
		this.userCover = userCover;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserStatus()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserStatus()
	 */
	@Override
	@JsonProperty("user_status")
	public String getUserStatus() {
		return userStatus;
	}
	
	/**
	 * @param userStatus
	 *           The user_status
	 */
	@JsonProperty("user_status")
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserIsBroadcaster(
	 * )
	 */
	@Override
	@JsonProperty("user_is_broadcaster")
	public Boolean getUserIsBroadcaster() {
		return userIsBroadcaster;
	}
	
	/**
	 * @param userIsBroadcaster
	 *           The user_is_broadcaster
	 */
	@JsonProperty("user_is_broadcaster")
	public void setUserIsBroadcaster(Boolean userIsBroadcaster) {
		this.userIsBroadcaster = userIsBroadcaster;
	}
	
	/**
	 * @return user_partner
	 */
	@Override
	public String getUserPartner() {
		return userPartner;
	}
	
	/**
	 * @param userPartner
	 *           The user_partner
	 */
	@JsonProperty("user_partner")
	public void setUserPartner(String userPartner) {
		this.userPartner = userPartner;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getIsLive()
	 */
	@Override
	@JsonProperty("is_live")
	public String getIsLive() {
		return isLive;
	}
	
	/**
	 * @param isLive
	 *           The is_live
	 */
	@JsonProperty("is_live")
	public void setIsLive(String isLive) {
		this.isLive = isLive;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getLiveSince()
	 */
	@Override
	@JsonProperty("live_since")
	public String getLiveSince() {
		return liveSince;
	}
	
	/**
	 * @param liveSince
	 *           The live_since
	 */
	@JsonProperty("live_since")
	public void setLiveSince(String liveSince) {
		this.liveSince = liveSince;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterAccount()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getTwitterAccount()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getTwitterAccount()
	 */
	@Override
	@JsonProperty("twitter_account")
	public String getTwitterAccount() {
		return twitterAccount;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setTwitterAccount(java.lang.String)
	 */
	@Override
	@JsonProperty("twitter_account")
	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterEnabled()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getTwitterEnabled()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getTwitterEnabled()
	 */
	@Override
	@JsonProperty("twitter_enabled")
	public String getTwitterEnabled() {
		return twitterEnabled;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setTwitterEnabled(java.lang.String)
	 */
	@Override
	@JsonProperty("twitter_enabled")
	public void setTwitterEnabled(String twitterEnabled) {
		this.twitterEnabled = twitterEnabled;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserBetaProfile()
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserBetaProfile()
	 */
	@Override
	@JsonProperty("user_beta_profile")
	public String getUserBetaProfile() {
		return userBetaProfile;
	}
	
	/**
	 * @param userBetaProfile
	 *           The user_beta_profile
	 */
	@JsonProperty("user_beta_profile")
	public void setUserBetaProfile(String userBetaProfile) {
		this.userBetaProfile = userBetaProfile;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserEmail()
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getUserEmail()
	 */
	@Override
	@JsonProperty("user_email")
	public String getUserEmail() {
		return userEmail;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setUserEmail(java.lang.String)
	 */
	@Override
	@JsonProperty("user_email")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getPartnerType()
	 */
	@Override
	@JsonProperty("partner_type")
	public String getPartnerType() {
		return partnerType;
	}
	
	/**
	 * @param partnerType
	 *           The partner_type
	 */
	@JsonProperty("partner_type")
	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getMediaIsLive()
	 */
	@Override
	@JsonProperty("media_is_live")
	public String getMediaIsLive() {
		return mediaIsLive;
	}
	
	/**
	 * @param mediaIsLive
	 *           The media_is_live
	 */
	@JsonProperty("media_is_live")
	public void setMediaIsLive(String mediaIsLive) {
		this.mediaIsLive = mediaIsLive;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getMediaLiveSince()
	 */
	@Override
	@JsonProperty("media_live_since")
	public String getMediaLiveSince() {
		return mediaLiveSince;
	}
	
	/**
	 * @param mediaLiveSince
	 *           The media_live_since
	 */
	@JsonProperty("media_live_since")
	public void setMediaLiveSince(String mediaLiveSince) {
		this.mediaLiveSince = mediaLiveSince;
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPrivateData#getUserMediaId()
	 */
	@Override
	@JsonProperty("user_media_id")
	public String getUserMediaId() {
		return userMediaId;
	}
	
	/**
	 * @param userMediaId
	 *           The user_media_id
	 */
	@JsonProperty("user_media_id")
	public void setUserMediaId(String userMediaId) {
		this.userMediaId = userMediaId;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#getUserDisplayName()
	 */
	@Override
	public String getUserDisplayName() {
		return userDisplayName;
	}
	
	/* (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserUpdateData#setUserDisplayName(java.lang.String)
	 */
	@Override
	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}
}
