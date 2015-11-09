/**
 * 
 */
package pl.grmdev.hitboard.requests.util;

import java.util.*;
/**
 * PUT RESTful API methods
 * 
 * @author Levvy055
 */
public enum HbPut {
	MEDIA_LIVE_UPDATE("media/live/:channel", new Params().p("authToken")),
	MEDIA_VIDEO_UPDATE("media/video/:video_id", new Params().p("authToken")),
	CHANNEL_RESET_KEY("mediakey/:channel"),
	USER_UPDATE("user/:user"),
	TEAM_UPDATE("team/:team/:user");
	
	private String cmd;
	private String[] objs;
	private Params params;
	
	private HbPut(String cmd, Params params) {
		this(cmd);
		this.params = params;
	}
	
	private HbPut(String cmd) {
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
	
	public String getCmd(String... args) throws Exception {
		if (args == null || args.length == 0) {
			return cmd;
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
