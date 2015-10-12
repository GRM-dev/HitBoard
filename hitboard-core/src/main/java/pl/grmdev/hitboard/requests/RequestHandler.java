/**
 * 
 */
package pl.grmdev.hitboard.requests;

import java.util.List;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.*;

import pl.grmdev.hitboard.requests.util.*;
import pl.grmdev.hitboard.requests.web.*;

/**
 * @author Levvy055
 *
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
		user = new User();
	}

	public static RequestHandler instance() {
		return instance;
	}

	/**
	 * 
	 * @return
	 */
	public boolean hasConnection() {
		try {
			HttpResponse<String> obj = get(HbGet.CHAT_SERVERS).asString();
			String result = obj.getBody();
			System.out.println(result);
			if (result.contains("[{")) {
				return true;
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param chatServers
	 * @return
	 */
	public BaseRequest post(HbPost cmd) {
		return post(apiLink + cmd.getCmd());
	}

	/**
	 * @param string
	 * @return
	 */
	public BaseRequest post(String cmd) {
		return Unirest.post(cmd);
	}
	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public GetRequest get(HbGet cmd) {
		return get(apiLink + cmd.getCmd());
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public GetRequest get(String cmd) {
		return Unirest.get(cmd);
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public HttpRequestWithBody put(HbPut cmd) {
		return put(apiLink + cmd.getCmd());
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public HttpRequestWithBody put(String cmd) {
		return Unirest.put(cmd);
	}

	public HttpRequestWithBody delete(HbDelete cmd) {
		return delete(apiLink + cmd.getCmd());
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public HttpRequestWithBody delete(String cmd) {
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
}
