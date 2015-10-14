/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
/**
 * @author Levvy055
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {
	
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
	@JsonProperty("app")
	private String app;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public UserData() {}
	
	/**
	 * @param app
	 * @param followers
	 * @param userLogo
	 * @param superadmin
	 * @param userId
	 * @param authToken
	 * @param livestreamCount
	 * @param userBanned
	 * @param userName
	 * @param login
	 * @param userLogoSmall
	 */
	public UserData(String app, String userId, String userName, String userLogo,
			String userLogoSmall, String userBanned, String superadmin,
			String livestreamCount, String followers, String authToken,
			String login) {
		this.app = app;
		this.userId = userId;
		this.userName = userName;
		this.userLogo = userLogo;
		this.userLogoSmall = userLogoSmall;
		this.userBanned = userBanned;
		this.superadmin = superadmin;
		this.livestreamCount = livestreamCount;
		this.followers = followers;
		this.authToken = authToken;
		this.login = login;
	}
	
	/**
	 * @return The app
	 */
	@JsonProperty("app")
	public String getApp() {
		return app;
	}
	
	/**
	 * @param app
	 *            The app
	 */
	@JsonProperty("app")
	public void setApp(String app) {
		this.app = app;
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
	 * @return The userName
	 */
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
	
	/**
	 * @return The userLogo
	 */
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
	 * @return The userLogoSmall
	 */
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
	 * @return The userBanned
	 */
	@JsonProperty("user_banned")
	public String getUserBanned() {
		return userBanned;
	}
	
	/**
	 * @param userBanned
	 *            The user_banned
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
	 *            The superadmin
	 */
	@JsonProperty("superadmin")
	public void setSuperadmin(String superadmin) {
		this.superadmin = superadmin;
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
	 * @return The authToken
	 */
	@JsonProperty("authToken")
	public String getAuthToken() {
		return authToken;
	}
	
	/**
	 * @param authToken
	 *            The authToken
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
	 *            The login
	 */
	@JsonProperty("login")
	public void setLogin(String login) {
		this.login = login;
	}
}
