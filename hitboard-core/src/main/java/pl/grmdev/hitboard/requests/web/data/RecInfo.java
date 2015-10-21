/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"index", "codec_name", "codec_long_name", "profile",
		"codec_type", "codec_time_base", "codec_tag_string", "codec_tag",
		"width", "height", "has_b_frames", "sample_aspect_ratio",
		"display_aspect_ratio", "pix_fmt", "level", "r_frame_rate",
		"avg_frame_rate", "time_base", "start_pts", "start_time",
		"disposition"})
public class RecInfo {
	
	@JsonProperty("index")
	private Integer index;
	@JsonProperty("codec_name")
	private String codecName;
	@JsonProperty("codec_long_name")
	private String codecLongName;
	@JsonProperty("profile")
	private String profile;
	@JsonProperty("codec_type")
	private String codecType;
	@JsonProperty("codec_time_base")
	private String codecTimeBase;
	@JsonProperty("codec_tag_string")
	private String codecTagString;
	@JsonProperty("codec_tag")
	private String codecTag;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("has_b_frames")
	private Integer hasBFrames;
	@JsonProperty("sample_aspect_ratio")
	private String sampleAspectRatio;
	@JsonProperty("display_aspect_ratio")
	private String displayAspectRatio;
	@JsonProperty("pix_fmt")
	private String pixFmt;
	@JsonProperty("level")
	private Integer level;
	@JsonProperty("r_frame_rate")
	private String rFrameRate;
	@JsonProperty("avg_frame_rate")
	private String avgFrameRate;
	@JsonProperty("time_base")
	private String timeBase;
	@JsonProperty("start_pts")
	private Integer startPts;
	@JsonProperty("start_time")
	private String startTime;
	@JsonProperty("disposition")
	private Disposition disposition;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public RecInfo() {}
	
	/**
	 * @param codecTag
	 * @param startPts
	 * @param index
	 * @param sampleAspectRatio
	 * @param hasBFrames
	 * @param width
	 * @param avgFrameRate
	 * @param pixFmt
	 * @param startTime
	 * @param codecType
	 * @param rFrameRate
	 * @param level
	 * @param codecLongName
	 * @param codecTagString
	 * @param height
	 * @param codecTimeBase
	 * @param displayAspectRatio
	 * @param codecName
	 * @param timeBase
	 * @param disposition
	 * @param profile
	 */
	public RecInfo(Integer index, String codecName, String codecLongName,
			String profile, String codecType, String codecTimeBase,
			String codecTagString, String codecTag, Integer width,
			Integer height, Integer hasBFrames, String sampleAspectRatio,
			String displayAspectRatio, String pixFmt, Integer level,
			String rFrameRate, String avgFrameRate, String timeBase,
			Integer startPts, String startTime, Disposition disposition) {
		this.index = index;
		this.codecName = codecName;
		this.codecLongName = codecLongName;
		this.profile = profile;
		this.codecType = codecType;
		this.codecTimeBase = codecTimeBase;
		this.codecTagString = codecTagString;
		this.codecTag = codecTag;
		this.width = width;
		this.height = height;
		this.hasBFrames = hasBFrames;
		this.sampleAspectRatio = sampleAspectRatio;
		this.displayAspectRatio = displayAspectRatio;
		this.pixFmt = pixFmt;
		this.level = level;
		this.rFrameRate = rFrameRate;
		this.avgFrameRate = avgFrameRate;
		this.timeBase = timeBase;
		this.startPts = startPts;
		this.startTime = startTime;
		this.disposition = disposition;
	}
	
	/**
	 * @return The index
	 */
	@JsonProperty("index")
	public Integer getIndex() {
		return index;
	}
	
	/**
	 * @param index
	 *            The index
	 */
	@JsonProperty("index")
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	/**
	 * @return The codecName
	 */
	@JsonProperty("codec_name")
	public String getCodecName() {
		return codecName;
	}
	
	/**
	 * @param codecName
	 *            The codec_name
	 */
	@JsonProperty("codec_name")
	public void setCodecName(String codecName) {
		this.codecName = codecName;
	}
	
	/**
	 * @return The codecLongName
	 */
	@JsonProperty("codec_long_name")
	public String getCodecLongName() {
		return codecLongName;
	}
	
	/**
	 * @param codecLongName
	 *            The codec_long_name
	 */
	@JsonProperty("codec_long_name")
	public void setCodecLongName(String codecLongName) {
		this.codecLongName = codecLongName;
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
	 * @return The codecType
	 */
	@JsonProperty("codec_type")
	public String getCodecType() {
		return codecType;
	}
	
	/**
	 * @param codecType
	 *            The codec_type
	 */
	@JsonProperty("codec_type")
	public void setCodecType(String codecType) {
		this.codecType = codecType;
	}
	
	/**
	 * @return The codecTimeBase
	 */
	@JsonProperty("codec_time_base")
	public String getCodecTimeBase() {
		return codecTimeBase;
	}
	
	/**
	 * @param codecTimeBase
	 *            The codec_time_base
	 */
	@JsonProperty("codec_time_base")
	public void setCodecTimeBase(String codecTimeBase) {
		this.codecTimeBase = codecTimeBase;
	}
	
	/**
	 * @return The codecTagString
	 */
	@JsonProperty("codec_tag_string")
	public String getCodecTagString() {
		return codecTagString;
	}
	
	/**
	 * @param codecTagString
	 *            The codec_tag_string
	 */
	@JsonProperty("codec_tag_string")
	public void setCodecTagString(String codecTagString) {
		this.codecTagString = codecTagString;
	}
	
	/**
	 * @return The codecTag
	 */
	@JsonProperty("codec_tag")
	public String getCodecTag() {
		return codecTag;
	}
	
	/**
	 * @param codecTag
	 *            The codec_tag
	 */
	@JsonProperty("codec_tag")
	public void setCodecTag(String codecTag) {
		this.codecTag = codecTag;
	}
	
	/**
	 * @return The width
	 */
	@JsonProperty("width")
	public Integer getWidth() {
		return width;
	}
	
	/**
	 * @param width
	 *            The width
	 */
	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	/**
	 * @return The height
	 */
	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}
	
	/**
	 * @param height
	 *            The height
	 */
	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	/**
	 * @return The hasBFrames
	 */
	@JsonProperty("has_b_frames")
	public Integer getHasBFrames() {
		return hasBFrames;
	}
	
	/**
	 * @param hasBFrames
	 *            The has_b_frames
	 */
	@JsonProperty("has_b_frames")
	public void setHasBFrames(Integer hasBFrames) {
		this.hasBFrames = hasBFrames;
	}
	
	/**
	 * @return The sampleAspectRatio
	 */
	@JsonProperty("sample_aspect_ratio")
	public String getSampleAspectRatio() {
		return sampleAspectRatio;
	}
	
	/**
	 * @param sampleAspectRatio
	 *            The sample_aspect_ratio
	 */
	@JsonProperty("sample_aspect_ratio")
	public void setSampleAspectRatio(String sampleAspectRatio) {
		this.sampleAspectRatio = sampleAspectRatio;
	}
	
	/**
	 * @return The displayAspectRatio
	 */
	@JsonProperty("display_aspect_ratio")
	public String getDisplayAspectRatio() {
		return displayAspectRatio;
	}
	
	/**
	 * @param displayAspectRatio
	 *            The display_aspect_ratio
	 */
	@JsonProperty("display_aspect_ratio")
	public void setDisplayAspectRatio(String displayAspectRatio) {
		this.displayAspectRatio = displayAspectRatio;
	}
	
	/**
	 * @return The pixFmt
	 */
	@JsonProperty("pix_fmt")
	public String getPixFmt() {
		return pixFmt;
	}
	
	/**
	 * @param pixFmt
	 *            The pix_fmt
	 */
	@JsonProperty("pix_fmt")
	public void setPixFmt(String pixFmt) {
		this.pixFmt = pixFmt;
	}
	
	/**
	 * @return The level
	 */
	@JsonProperty("level")
	public Integer getLevel() {
		return level;
	}
	
	/**
	 * @param level
	 *            The level
	 */
	@JsonProperty("level")
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	/**
	 * @return The rFrameRate
	 */
	@JsonProperty("r_frame_rate")
	public String getRFrameRate() {
		return rFrameRate;
	}
	
	/**
	 * @param rFrameRate
	 *            The r_frame_rate
	 */
	@JsonProperty("r_frame_rate")
	public void setRFrameRate(String rFrameRate) {
		this.rFrameRate = rFrameRate;
	}
	
	/**
	 * @return The avgFrameRate
	 */
	@JsonProperty("avg_frame_rate")
	public String getAvgFrameRate() {
		return avgFrameRate;
	}
	
	/**
	 * @param avgFrameRate
	 *            The avg_frame_rate
	 */
	@JsonProperty("avg_frame_rate")
	public void setAvgFrameRate(String avgFrameRate) {
		this.avgFrameRate = avgFrameRate;
	}
	
	/**
	 * @return The timeBase
	 */
	@JsonProperty("time_base")
	public String getTimeBase() {
		return timeBase;
	}
	
	/**
	 * @param timeBase
	 *            The time_base
	 */
	@JsonProperty("time_base")
	public void setTimeBase(String timeBase) {
		this.timeBase = timeBase;
	}
	
	/**
	 * @return The startPts
	 */
	@JsonProperty("start_pts")
	public Integer getStartPts() {
		return startPts;
	}
	
	/**
	 * @param startPts
	 *            The start_pts
	 */
	@JsonProperty("start_pts")
	public void setStartPts(Integer startPts) {
		this.startPts = startPts;
	}
	
	/**
	 * @return The startTime
	 */
	@JsonProperty("start_time")
	public String getStartTime() {
		return startTime;
	}
	
	/**
	 * @param startTime
	 *            The start_time
	 */
	@JsonProperty("start_time")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * @return The disposition
	 */
	@JsonProperty("disposition")
	public Disposition getDisposition() {
		return disposition;
	}
	
	/**
	 * @param disposition
	 *            The disposition
	 */
	@JsonProperty("disposition")
	public void setDisposition(Disposition disposition) {
		this.disposition = disposition;
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