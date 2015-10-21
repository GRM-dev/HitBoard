/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.*;
/**
 * @author Levvy055
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"log_id", "media_id", "width", "height", "vbitrate",
		"abitrate", "vcodec", "acodec", "profile", "level", "fps", "gop",
		"hostname", "useragent", "log_date"})
public class MediaInfo {
	
	@JsonProperty("log_id")
	private String logId;
	@JsonProperty("media_id")
	private String mediaId;
	@JsonProperty("width")
	private String width;
	@JsonProperty("height")
	private String height;
	@JsonProperty("vbitrate")
	private String vbitrate;
	@JsonProperty("abitrate")
	private String abitrate;
	@JsonProperty("vcodec")
	private String vcodec;
	@JsonProperty("acodec")
	private String acodec;
	@JsonProperty("profile")
	private String profile;
	@JsonProperty("level")
	private String level;
	@JsonProperty("fps")
	private String fps;
	@JsonProperty("gop")
	private String gop;
	@JsonProperty("hostname")
	private String hostname;
	@JsonProperty("useragent")
	private String useragent;
	@JsonProperty("log_date")
	private String logDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public MediaInfo() {}
	
	/**
	 * @param mediaId
	 * @param useragent
	 * @param logId
	 * @param width
	 * @param fps
	 * @param hostname
	 * @param logDate
	 * @param vcodec
	 * @param acodec
	 * @param height
	 * @param abitrate
	 * @param level
	 * @param gop
	 * @param vbitrate
	 * @param profile
	 */
	public MediaInfo(String logId, String mediaId, String width, String height,
			String vbitrate, String abitrate, String vcodec, String acodec,
			String profile, String level, String fps, String gop,
			String hostname, String useragent, String logDate) {
		this.logId = logId;
		this.mediaId = mediaId;
		this.width = width;
		this.height = height;
		this.vbitrate = vbitrate;
		this.abitrate = abitrate;
		this.vcodec = vcodec;
		this.acodec = acodec;
		this.profile = profile;
		this.level = level;
		this.fps = fps;
		this.gop = gop;
		this.hostname = hostname;
		this.useragent = useragent;
		this.logDate = logDate;
	}
	
	/**
	 * @return The logId
	 */
	@JsonProperty("log_id")
	public String getLogId() {
		return logId;
	}
	
	/**
	 * @param logId
	 *            The log_id
	 */
	@JsonProperty("log_id")
	public void setLogId(String logId) {
		this.logId = logId;
	}
	
	/**
	 * @return The mediaId
	 */
	@JsonProperty("media_id")
	public String getMediaId() {
		return mediaId;
	}
	
	/**
	 * @param mediaId
	 *            The media_id
	 */
	@JsonProperty("media_id")
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	/**
	 * @return The width
	 */
	@JsonProperty("width")
	public String getWidth() {
		return width;
	}
	
	/**
	 * @param width
	 *            The width
	 */
	@JsonProperty("width")
	public void setWidth(String width) {
		this.width = width;
	}
	
	/**
	 * @return The height
	 */
	@JsonProperty("height")
	public String getHeight() {
		return height;
	}
	
	/**
	 * @param height
	 *            The height
	 */
	@JsonProperty("height")
	public void setHeight(String height) {
		this.height = height;
	}
	
	/**
	 * @return The vbitrate
	 */
	@JsonProperty("vbitrate")
	public String getVbitrate() {
		return vbitrate;
	}
	
	/**
	 * @param vbitrate
	 *            The vbitrate
	 */
	@JsonProperty("vbitrate")
	public void setVbitrate(String vbitrate) {
		this.vbitrate = vbitrate;
	}
	
	/**
	 * @return The abitrate
	 */
	@JsonProperty("abitrate")
	public String getAbitrate() {
		return abitrate;
	}
	
	/**
	 * @param abitrate
	 *            The abitrate
	 */
	@JsonProperty("abitrate")
	public void setAbitrate(String abitrate) {
		this.abitrate = abitrate;
	}
	
	/**
	 * @return The vcodec
	 */
	@JsonProperty("vcodec")
	public String getVcodec() {
		return vcodec;
	}
	
	/**
	 * @param vcodec
	 *            The vcodec
	 */
	@JsonProperty("vcodec")
	public void setVcodec(String vcodec) {
		this.vcodec = vcodec;
	}
	
	/**
	 * @return The acodec
	 */
	@JsonProperty("acodec")
	public String getAcodec() {
		return acodec;
	}
	
	/**
	 * @param acodec
	 *            The acodec
	 */
	@JsonProperty("acodec")
	public void setAcodec(String acodec) {
		this.acodec = acodec;
	}
	
	/**
	 * @return The profile
	 */
	@JsonProperty("profile")
	public String getProfile() {
		return profile;
	}
	
	/**
	 * @param profile
	 *            The profile
	 */
	@JsonProperty("profile")
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	/**
	 * @return The level
	 */
	@JsonProperty("level")
	public String getLevel() {
		return level;
	}
	
	/**
	 * @param level
	 *            The level
	 */
	@JsonProperty("level")
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * @return The fps
	 */
	@JsonProperty("fps")
	public String getFps() {
		return fps;
	}
	
	/**
	 * @param fps
	 *            The fps
	 */
	@JsonProperty("fps")
	public void setFps(String fps) {
		this.fps = fps;
	}
	
	/**
	 * @return The gop
	 */
	@JsonProperty("gop")
	public Object getGop() {
		return gop;
	}
	
	/**
	 * @param gop
	 *            The gop
	 */
	@JsonProperty("gop")
	public void setGop(String gop) {
		this.gop = gop;
	}
	
	/**
	 * @return The hostname
	 */
	@JsonProperty("hostname")
	public String getHostname() {
		return hostname;
	}
	
	/**
	 * @param hostname
	 *            The hostname
	 */
	@JsonProperty("hostname")
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	/**
	 * @return The useragent
	 */
	@JsonProperty("useragent")
	public Object getUseragent() {
		return useragent;
	}
	
	/**
	 * @param useragent
	 *            The useragent
	 */
	@JsonProperty("useragent")
	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}
	
	/**
	 * @return The logDate
	 */
	@JsonProperty("log_date")
	public String getLogDate() {
		return logDate;
	}
	
	/**
	 * @param logDate
	 *            The log_date
	 */
	@JsonProperty("log_date")
	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}