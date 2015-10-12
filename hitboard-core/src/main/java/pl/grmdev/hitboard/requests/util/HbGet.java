/**
 * 
 */
package pl.grmdev.hitboard.requests.util;

/**
 * @author Levvy055
 */
public enum HbGet {
	MEDIA_LIVE_OBJECT("media/live/:channel"),
	MEDIA_LIVE_LIST("media/live/list"),
	MEDIA_VIDEO_OBJECT("media/video/:media_id"),
	MEDIA_VIDEO_LIST("media/video/:channel/list"),
	MEDIA_RECORDING_OBJECT("recordings/:channel"),
	MEDIA_STATUS("media/status/:channel"),
	MEDIA_VIEWS("media/views/:channel"),
	MEDIA_INFO("mediainfo/live/:media_id"),
	CHANNEL_KEY("mediakey/:channel"),
	CHANNEL_COMMERCIAL_OBJECT("ws/combreak/:channel"),
	CHANNEL_HOSTERS("hosters/:channel"),
	CHANNEL_EDITORS("editors/:channel"),
	CHANNEL_EDITOR_OBJECT("editor/:user"),
	STATS_CHANNEL_VIEW("streamstats/:channel/:startDate/:endDate"),
	STATS_CHANNEL_COUNTRY("streamoverallstats/:channel/:startDate/:endDate"),
	STATS_CHANNEL_REVENUE("revenues/:channel"),
	STATS_FOLLOWER("followerstats/:channel"),
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
	GAMES_LIST("games"),
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
	TOKEN_VALID("auth/valid/:appID"),
	INGEST_LIST("ingests/default_list");
	
	private String cmd;
	private String[] objs;
	
	private HbGet(String cmd) {
		this.cmd = cmd;
		if (cmd.contains(":")) {
			int objCount = cmd.length() - cmd.replaceAll(":", "").length();
			objs = new String[objCount];
			int bI = 0, eI = 0;
			for (int i = 0; i < objCount; i++) {
				bI = cmd.indexOf(":", eI);
				eI = i < cmd.length() && cmd.indexOf("/", bI + 1) != -1
						? cmd.indexOf("/", bI + 1)
						: cmd.length() - 1;
				objs[i] = cmd.substring(bI, eI);
			}
		}
	}
	
	public String getCmd() {
		return cmd;
	}
	
	public String get(String... args) throws Exception {
		if (args == null || args.length == 0) {
			return getCmd();
		}
		if (args.length != getObjects().length) {
			throw new Exception("Wrong amount of input parameters!\nShould be "
					+ getObjects().length + " but was " + args.length);
		}
		String result = getCmd();
		for (int i = 0; i < objs.length; i++) {
			result = result.replace(objs[i], args[i]);
		}
		return result;
	}
	
	public String[] getObjects() {
		return objs;
	}
}
