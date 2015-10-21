/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import pl.grmdev.hitboard.requests.web.data.UserData;
/**
 * @author Levvy055
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	
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
	private Object userPartner;
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
	@JsonProperty("data")
	private UserData userData;
	@JsonProperty("access")
	private String access;
	@JsonProperty("app")
	private String app;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public User() {}
	
	/**
	 * @param app
	 * @param superadmin
	 * @param userBanned
	 * @param livestreamCount
	 * @param authToken
	 * @param userData
	 * @param access
	 * @param userBannedChannel
	 * @param followers
	 * @param userLogo
	 * @param userId
	 * @param userName
	 * @param login
	 * @param userLogoSmall
	 */
	public User(String userId, String userName, String userLogo,
			String userLogoSmall, String userBanned, String userBannedChannel,
			String superadmin, String livestreamCount, String followers,
			String authToken, String login, UserData userData, String access,
			String app) {
		this.userId = userId;
		this.userName = userName;
		this.userLogo = userLogo;
		this.userLogoSmall = userLogoSmall;
		this.userBanned = userBanned;
		this.userBannedChannel = userBannedChannel;
		this.superadmin = superadmin;
		this.livestreamCount = livestreamCount;
		this.followers = followers;
		this.authToken = authToken;
		this.login = login;
		this.userData = userData;
		this.access = access;
		this.app = app;
	}
	
	/**
	 * @return The userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId
	 *            The user_id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return The userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName
	 *            The user_name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return The userLogo
	 */
	public String getUserLogo() {
		return userLogo;
	}
	
	/**
	 * @param userLogo
	 *            The user_logo
	 */
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	
	/**
	 * @return The userLogoSmall
	 */
	public String getUserLogoSmall() {
		return userLogoSmall;
	}
	
	/**
	 * @param userLogoSmall
	 *            The user_logo_small
	 */
	public void setUserLogoSmall(String userLogoSmall) {
		this.userLogoSmall = userLogoSmall;
	}
	
	/**
	 * @return The userBanned
	 */
	public String getUserBanned() {
		return userBanned;
	}
	
	/**
	 * @param userBanned
	 *            The user_banned
	 */
	public void setUserBanned(String userBanned) {
		this.userBanned = userBanned;
	}
	
	/**
	 * @return The userBannedChannel
	 */
	public String getUserBannedChannel() {
		return userBannedChannel;
	}
	
	/**
	 * @param userBannedChannel
	 *            The user_banned_channel
	 */
	public void setUserBannedChannel(String userBannedChannel) {
		this.userBannedChannel = userBannedChannel;
	}
	
	/**
	 * @return The superadmin
	 */
	public String getSuperadmin() {
		return superadmin;
	}
	
	/**
	 * @param superadmin
	 *            The superadmin
	 */
	public void setSuperadmin(String superadmin) {
		this.superadmin = superadmin;
	}
	
	/**
	 * @return The livestreamCount
	 */
	public String getLivestreamCount() {
		return livestreamCount;
	}
	
	/**
	 * @param livestreamCount
	 *            The livestream_count
	 */
	public void setLivestreamCount(String livestreamCount) {
		this.livestreamCount = livestreamCount;
	}
	
	/**
	 * @return The followers
	 */
	public String getFollowers() {
		return followers;
	}
	
	/**
	 * @param followers
	 *            The followers
	 */
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
	/**
	 * @return The authToken
	 */
	public String getAuthToken() {
		return authToken;
	}
	
	/**
	 * @param authToken
	 *            The authToken
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	/**
	 * @return The login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * @param login
	 *            The login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return The data
	 */
	public UserData getUserData() {
		return userData;
	}
	
	/**
	 * @param userData
	 *            The data
	 */
	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	
	/**
	 * @return The access
	 */
	public String getAccess() {
		return access;
	}
	
	/**
	 * @param access
	 *            The access
	 */
	public void setAccess(String access) {
		this.access = access;
	}
	
	/**
	 * @return The app
	 */
	public String getApp() {
		return app;
	}
	
	/**
	 * @param app
	 *            The app
	 */
	public void setApp(String app) {
		this.app = app;
	}
}
