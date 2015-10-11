/**
 * 
 */
package pl.grmdev.hitboard.requests;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.*;

/**
 * @author Levvy055
 *
 */
public class RequestHandler {

	private String apiLink;

	public RequestHandler(String apiLink) {
		this.apiLink = apiLink;
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
	private BaseRequest post(HbPost cmd) {
		return post(apiLink + cmd.get());
	}

	/**
	 * @param string
	 * @return
	 */
	private BaseRequest post(String cmd) {
		return Unirest.post(cmd);
	}
	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public GetRequest get(HbGet cmd) {
		return get(apiLink + cmd.get());
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	public GetRequest get(String cmd) {
		return Unirest.get(cmd);
	}
}
