/**
 * 
 */
package pl.grmdev.hitboard.requests;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.BaseRequest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.mashape.unirest.request.body.MultipartBody;
import com.mashape.unirest.request.body.RequestBodyEntity;

import pl.grmdev.hitboard.requests.util.HbDelete;
import pl.grmdev.hitboard.requests.util.HbGet;
import pl.grmdev.hitboard.requests.util.HbPost;
import pl.grmdev.hitboard.requests.util.HbPut;
import pl.grmdev.hitboard.requests.util.Params;
import pl.grmdev.hitboard.requests.web.Channel;
import pl.grmdev.hitboard.requests.web.Chat;
import pl.grmdev.hitboard.requests.web.Followers;
import pl.grmdev.hitboard.requests.web.Games;
import pl.grmdev.hitboard.requests.web.Media;
import pl.grmdev.hitboard.requests.web.Statistics;
import pl.grmdev.hitboard.requests.web.Subscription;
import pl.grmdev.hitboard.requests.web.Teams;
import pl.grmdev.hitboard.requests.web.Token;
import pl.grmdev.hitboard.requests.web.User;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * @param cmd
	 *            REST post type
	 * @param body
	 *            REST Payload
	 * @param params
	 *            to fill request with
	 * @param objs
	 *            objects to replace in url
	 * @return Request with prepared parameters values
	 * @throws Exception
	 */
	public BaseRequest post(HbPost cmd, Object body, Params params,
			String... objs)
			throws Exception {
		if (body == null) {
			return post(cmd, params, objs);
		} else {
			HttpRequestWithBody postReq = post(apiLink + cmd.getCmd(objs));
			if (params != null) {
				postReq = postReq.queryString(params.getAll());
			}
			RequestBodyEntity entity;
			if (body instanceof JsonNode) {
				entity = postReq.body((JsonNode) body);
			}
			else if (body instanceof String) {
				entity = postReq.body((String) body);
			}
			else {
				entity = postReq.body(body);
			}
			return entity;
		}
	}
	
	/**
	 * Makes POST RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbPost}
	 * @param params
	 *            to fill request with
	 * @param objs
	 *            objects to replace in url
	 * @return {@link HttpRequestWithBody}
	 * @throws Exception
	 */
	public BaseRequest post(HbPost cmd, Params params, String... objs)
			throws Exception {
		HttpRequestWithBody postReq = post(apiLink + cmd.getCmd(objs));
		MultipartBody multipartBody = postReq.fields(params.getAll());
		return multipartBody;
	}
	
	/**
	 * Makes POST RESful API method to specifed url in parameter
	 * 
	 * @param cmd
	 *            {@link String} containing url to restful API
	 * @return {@link HttpRequestWithBody}
	 */
	private HttpRequestWithBody post(String cmd) {
		return Unirest.post(cmd);
	}
	
	/**
	 * @param get
	 *            REST get type
	 * @param params
	 *            to fill request with
	 * @param objs
	 *            objects to replace in url
	 * @return Request with prepared parameters values
	 * @throws Exception
	 */
	public GetRequest get(HbGet get, Params params, String... objs)
			throws Exception {
		if (!get.hasParams()) {
			return get(get, objs);
		}
		GetRequest getRequest = get(get, objs);
		Map<String, Object> ps = params.getAll();
		for (Iterator<String> it = ps.keySet().iterator(); it.hasNext();) {
			String key = it.next();
			Object o = ps.get(key);
			getRequest = (GetRequest) getRequest.queryString(key, o);
		}
		return getRequest;
	}
	
	/**
	 * Makes GET RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbGet}
	 * @param objs
	 *            objects to replace in url
	 * @return {@link GetRequest}
	 * @throws Exception
	 */
	public GetRequest get(HbGet cmd, String... objs) throws Exception {
		return get(apiLink + cmd.getCmd(objs));
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
	 * @param params
	 *            REST parameters
	 * @param objs
	 *            objects to replace in url
	 * @return {@link RequestBodyEntity}
	 * @throws Exception
	 */
	public BaseRequest put(HbPut cmd, Object body, Params params,
			String... objs)
			throws Exception {
		HttpRequestWithBody putReq = put(apiLink + cmd.getCmd(objs));
		putReq = putReq.queryString(params.getAll());
		if (body != null) {
			RequestBodyEntity entity;
			if (body instanceof JsonNode) {
				entity = putReq.body((JsonNode) body);
			} else {
				ObjectMapper om = new ObjectMapper();
				String bodyS = om.writeValueAsString(body);
				entity = putReq.body(bodyS);
			}
			return entity;
		}
		return put(cmd, params, objs);
	}
	
	/**
	 * Makes PUT RESful API method based on {@link HbPost}
	 * 
	 * @param cmd
	 *            API command of type {@link HbPut}
	 * @param params
	 *            REST parameters
	 * @return {@link HttpRequestWithBody}
	 * @throws Exception
	 */
	public BaseRequest put(HbPut cmd, Params params,
			String... objs)
			throws Exception {
		HttpRequestWithBody putReq = put(apiLink + cmd.getCmd(objs));
		MultipartBody multipartBody = putReq.fields(params.getAll());
		return multipartBody;
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
