/**
 * 
 */
package pl.grmdev.hitboard.requests.util;

import java.util.Iterator;
import java.util.Map;
/**
 * GET RESTful API methods
 * 
 * @author Levvy055
 */
public enum HbGet {
	MEDIA_LIVE_OBJECT("media/live/:channel",new Params().p("authToken").p("showHidden")) ,
	MEDIA_LIVE_LIST("media/live/list",new Params().p(true, "authToken", "publicOnly", "showHidden", "hiddenOnly", "liveonly", "filter", "game", "limit", "start", "follow_id", "search")) ,
	MEDIA_VIDEO_OBJECT("media/video/:media_id"),
	MEDIA_VIDEO_LIST("media/video/:channel/list",new Params().p(true, "authToken", "publicOnly", "showHidden", "hiddenOnly", "filter", "limit", "search", "yt")) ,
	MEDIA_RECORDING_OBJECT("recordings/:channel", new Params().p("limit")),
	MEDIA_STATUS("media/status/:channel"),
	MEDIA_VIEWS("media/views/:channel"),
	MEDIA_INFO("mediainfo/live/:media_id"),
	CHANNEL_KEY("mediakey/:channel", new Params().p("authToken")),
	CHANNEL_COMMERCIAL_OBJECT("ws/combreak/:channel"),
	CHANNEL_HOSTERS("hosters/:channel", new Params().p("authToken")),
	CHANNEL_EDITORS("editors/:channel", new Params().p("authToken")),
	CHANNEL_EDITOR_OBJECT("editor/:user", new Params().p("authToken")),
	STATS_VIEWER("streamstats/:channel/:startDate/:endDate", new Params().p("authToken")),
	STATS_CHANNEL_ALL("streamoverallstats/:channel/:startDate/:endDate", new Params().p("authToken")),
	STATS_REVENUE("revenues/channel/:channel",new Params().p(true, "authToken", "startDate", "endDate")) ,
	STATS_FOLLOWER("followerstats/:channel",new Params().p("authToken")) ,
	USER_OBJECT("user/:user"),
	USER_ACCESS_LEVELS("user/access/:channel/:auth"),
	USER_DEFAULT_TEAM("user/:user/team/default"),
	SUBSCRIPTION_LIST("subscriptionlist/:channel"),
	SUBSCRIBER_LIST("subscriberlist/:channel"),
	SUBSCRIPTION_BADGE("mediabadges/:channel"),
	SUBSCRIPTION_RELATIONSHIP("user/subscription/:channel/:auth"),
	FOLLOWERS_OBJECT("followers/user/:channel"),
	FOLLOWERS_OBJECTS("following/user"),
	FOLLOWERS_RELATIONSHIP("following/user/:channel"),
	GAMES_LIST("games", new Params().p(true, "q", "limit", "liveonly")),
	GAMES_GAME("game/:game"),
	TEAMS_ACTIVE_LIST("teams"),
	TEAMS_OBJECTS("teams/:user"),
	TEAMS_OBJECT("team/:team"),
	CHAT_SERVERS("chat/servers"),
	CHAT_MODERATORS("chat/moderators/:channel"),
	CHAT_MODERATIONS("chat/moderations/:user"),
	CHAT_EMOTES("chat/emotes/:user"),
	CHAT_ICONS("chat/icons/:user"),
	CHAT_ICON_PROPERTIES("chat/icon/:icon_name"),
	CHAT_SETTINGS("chat/settings/:channel"),
	CHAT_BLACKLIST("chat/blacklist/:channel"),
	TOKEN_VALID("auth/valid/:appID",new Params().p("token")) ,
	TOKEN_USER_FROM_TOKEN("userfromtoken/:authToken") ,
	INGEST_LIST("ingests/default_list");
	
	private String cmd;
	private String[] objs;
	private Params params;
	
	private HbGet(String cmd, Params params) {
		this(cmd);
		this.params = params;
	}
	
	private HbGet(String cmd) {
		this.cmd = cmd;
		if (cmd.contains(":")) {
			int objCount = cmd.length() - cmd.replaceAll(":", "").length();
			objs = new String[objCount];
			int bI = 0, eI = 0;
			for (int i = 0; i < objCount; i++) {
				bI = cmd.indexOf(":", eI);
				eI = (i < cmd.length() && cmd.indexOf("/", bI + 1) != -1)
						? cmd.indexOf("/", bI + 1)
						: cmd.length();
				objs[i] = cmd.substring(bI, eI);
			}
		}
	}
	
	private String getCmd() {
		return cmd;
	}
	
	public String getCmd(String... args) throws Exception {
		if (args == null || args.length == 0) { return getCmd(); }
		if (args.length != getObjects().length) { throw new Exception("Wrong amount of input parameters!\nShould be " + getObjects().length + " but was " + args.length); }
		String result = getCmd();
		for (int i = 0; i < objs.length; i++) {
			result = result.replace(objs[i], args[i]);
		}
		return result;
		}
	
	public boolean hasObjs() {
		return objs != null && objs.length > 0;
		}
	
	public String[] getObjects() {
		return objs;
		}
	
	public boolean hasParams() {
		return (params == null || params.isEmpty()) ? false : true;
	}
	
	public Iterator<String> paramIterator() {
		return params.iterator();
	}
	
	public Object getParamObject(String key) {
		return params.get(key);
	}
	
	public Map<String, Object> getParams() {
		return params.getAll();
	}
}
