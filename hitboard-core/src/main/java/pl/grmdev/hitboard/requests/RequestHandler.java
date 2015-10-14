/**
 * 
 */
package pl.grmdev.hitboard.requests;

import java.util.List;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.*;
import com.mashape.unirest.request.body.MultipartBody;

import pl.grmdev.hitboard.requests.util.*;
import pl.grmdev.hitboard.requests.web.*;
/**
 * Class holding HitBox Rest API.
 * 
 * @author Levvy055
 */
public class RequestHandler {
	
	private String apiLink;
	private Channel channel;
	private Chat chat;
	private Followers followers;
	private Games games;
	private Media media;
	private Statistics statistics;
	private Subscription subscription;
	private Teams teams;
	private Token token;
	private User user;
	private static RequestHandler instance;
	
	/**
	 * Creates object of handler type which creates and handles all hitbox web
	 * API requests.
	 * 
	 * @param apiLink
	 *            link to hitbox api
	 */
	public RequestHandler(String apiLink) {
		this.apiLink = apiLink;
		instance = this;
		channel = new Channel();
		chat = new Chat();
		followers = new Followers();
		games = new Games();
		media = new Media();
		statistics = new Statistics();
		subscription = new Subscription();
		teams = new Teams();
		token = new Token();
	}
	
	/**
	 * When you create at least one {@link RequestHandler} object than this
	 * method returns the last created {@link RequestHandler}
	 * 
	 * @return last created {@link RequestHandler}
	 */
	public static RequestHandler instance() {
		return instance;
	}
	
	/**
	 * Checks if you have correct connection and API is working correctly.
	 * 
	 * @return true if connection to hitbox API is available and correct
	 */
	public boolean hasConnection() {
		try {
			HttpResponse<String> obj = get(HbGet.CHAT_SERVERS).asString();
			String result = obj.getBody();
			if (result.contains("[{")) {
				return true;
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * @param post
	 *            REST post type
	 * @param params
	 *            to fill request with
	 * @return Request with prepared parameters values
	 */
	public BaseRequest post(HbPost post, Params params) {
		if (!post.hasParams()) {
			return post(post);
		}
		HttpRequestWithBody postRequest = (HttpRequestWithBody) post(post);
		MultipartBody multipartBody = postRequest.fields(params.getAll());
		return multipartBody;
	}
	
	/**
	 * Makes POST RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbPost}
	 * @return {@link HttpRequestWithBody}
	 */
	public BaseRequest post(HbPost cmd) {
		return post(apiLink + cmd.getCmd());
	}
	
	/**
	 * Makes POST RESful API method to specifed url in parameter
	 * 
	 * @param cmd
	 *            {@link String} containing url to restful api
	 * @return {@link HttpRequestWithBody}
	 */
	private BaseRequest post(String cmd) {
		return Unirest.post(cmd);
	}
	
	/**
	 * Makes GET RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbGet}
	 * @return {@link GetRequest}
	 */
	public GetRequest get(HbGet cmd) {
		return get(apiLink + cmd.getCmd());
	}
	
	/**
	 * Makes GET RESful API method to specifed url in parameter
	 * 
	 * @param cmd
	 *            {@link String} containing url to restful api
	 * @return {@link GetRequest}
	 */
	private GetRequest get(String cmd) {
		return Unirest.get(cmd);
	}
	
	/**
	 * Makes PUT RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbPut}
	 * @return {@link HttpRequestWithBody}
	 */
	public HttpRequestWithBody put(HbPut cmd) {
		return put(apiLink + cmd.getCmd());
	}
	
	/**
	 * Makes PUT RESful API method to specifed url in parameter
	 * 
	 * @param cmd
	 *            {@link String} containing url to restful api
	 * @return {@link HttpRequestWithBody}
	 */
	private HttpRequestWithBody put(String cmd) {
		return Unirest.put(cmd);
	}
	
	/**
	 * Makes DELETE RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            of type {@link HbDelete}
	 * @return {@link HttpRequestWithBody}
	 */
	public HttpRequestWithBody delete(HbDelete cmd) {
		return delete(apiLink + cmd.getCmd());
	}
	
	/**
	 * Makes DELETE RESful API method to specifed url in parameter
	 * 
	 * @param cmd
	 *            {@link String} containing url to restful api
	 * @return {@link HttpRequestWithBody}
	 */
	private HttpRequestWithBody delete(String cmd) {
		return Unirest.delete(cmd);
	}
	
	public Channel getChannel() {
		return channel;
	}
	
	public Chat getChat() {
		return chat;
	}
	
	public Followers getFollowers() {
		return followers;
	}
	
	public Games getGames() {
		return games;
	}
	
	public Media getMedia() {
		return media;
	}
	
	public Statistics getStatistics() {
		return statistics;
	}
	
	public Subscription getSubscription() {
		return subscription;
	}
	
	public Teams getTeams() {
		return teams;
	}
	
	public Token getToken() {
		return token;
	}
	
	public List<String> getIngest() {
		return null; // TODO: Ingest list return
	}
	
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets user created by Token object from RESTful API
	 * 
	 * @param user
	 *            user added by {@link Token}
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
