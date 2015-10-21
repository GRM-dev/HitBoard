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
@JsonPropertyOrder({"rec_id", "rec_media_id", "rec_session", "rec_title",
		"rec_category_id", "rec_path", "rec_name", "rec_addr", "rec_info",
		"rec_height", "rec_bitrate", "rec_duration", "rec_date_added",
		"rec_saved_media_id", "thumbnail", "thumbnail_large",
		"rec_duration_sec", "rec_download_link"})
public class Recording {
	
	@JsonProperty("rec_id")
	private String recId;
	@JsonProperty("rec_media_id")
	private String recMediaId;
	@JsonProperty("rec_session")
	private String recSession;
	@JsonProperty("rec_title")
	private String recTitle;
	@JsonProperty("rec_category_id")
	private String recCategoryId;
	@JsonProperty("rec_path")
	private String recPath;
	@JsonProperty("rec_name")
	private String recName;
	@JsonProperty("rec_addr")
	private String recAddr;
	@JsonProperty("rec_info")
	private RecInfo recInfo;
	@JsonProperty("rec_height")
	private String recHeight;
	@JsonProperty("rec_bitrate")
	private String recBitrate;
	@JsonProperty("rec_duration")
	private String recDuration;
	@JsonProperty("rec_date_added")
	private String recDateAdded;
	@JsonProperty("rec_saved_media_id")
	private String recSavedMediaId;
	@JsonProperty("thumbnail")
	private String thumbnail;
	@JsonProperty("thumbnail_large")
	private String thumbnailLarge;
	@JsonProperty("rec_duration_sec")
	private String recDurationSec;
	@JsonProperty("rec_download_link")
	private String recDownloadLink;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public Recording() {}
	
	/**
	 * @param recCategoryId
	 * @param recMediaId
	 * @param recId
	 * @param recTitle
	 * @param recHeight
	 * @param recDownloadLink
	 * @param recInfo
	 * @param thumbnail
	 * @param recSession
	 * @param recDuration
	 * @param recSavedMediaId
	 * @param thumbnailLarge
	 * @param recAddr
	 * @param recDateAdded
	 * @param recPath
	 * @param recName
	 * @param recDurationSec
	 * @param recBitrate
	 */
	public Recording(String recId, String recMediaId, String recSession,
			String recTitle, String recCategoryId, String recPath,
			String recName, String recAddr, RecInfo recInfo, String recHeight,
			String recBitrate, String recDuration, String recDateAdded,
			String recSavedMediaId, String thumbnail, String thumbnailLarge,
			String recDurationSec, String recDownloadLink) {
		this.recId = recId;
		this.recMediaId = recMediaId;
		this.recSession = recSession;
		this.recTitle = recTitle;
		this.recCategoryId = recCategoryId;
		this.recPath = recPath;
		this.recName = recName;
		this.recAddr = recAddr;
		this.recInfo = recInfo;
		this.recHeight = recHeight;
		this.recBitrate = recBitrate;
		this.recDuration = recDuration;
		this.recDateAdded = recDateAdded;
		this.recSavedMediaId = recSavedMediaId;
		this.thumbnail = thumbnail;
		this.thumbnailLarge = thumbnailLarge;
		this.recDurationSec = recDurationSec;
		this.recDownloadLink = recDownloadLink;
	}
	
	/**
	 * @return The recId
	 */
	@JsonProperty("rec_id")
	public String getRecId() {
		return recId;
	}
	
	/**
	 * @param recId
	 *            The rec_id
	 */
	@JsonProperty("rec_id")
	public void setRecId(String recId) {
		this.recId = recId;
	}
	
	/**
	 * @return The recMediaId
	 */
	@JsonProperty("rec_media_id")
	public String getRecMediaId() {
		return recMediaId;
	}
	
	/**
	 * @param recMediaId
	 *            The rec_media_id
	 */
	@JsonProperty("rec_media_id")
	public void setRecMediaId(String recMediaId) {
		this.recMediaId = recMediaId;
	}
	
	/**
	 * @return The recSession
	 */
	@JsonProperty("rec_session")
	public String getRecSession() {
		return recSession;
	}
	
	/**
	 * @param recSession
	 *            The rec_session
	 */
	@JsonProperty("rec_session")
	public void setRecSession(String recSession) {
		this.recSession = recSession;
	}
	
	/**
	 * @return The recTitle
	 */
	@JsonProperty("rec_title")
	public String getRecTitle() {
		return recTitle;
	}
	
	/**
	 * @param recTitle
	 *            The rec_title
	 */
	@JsonProperty("rec_title")
	public void setRecTitle(String recTitle) {
		this.recTitle = recTitle;
	}
	
	/**
	 * @return The recCategoryId
	 */
	@JsonProperty("rec_category_id")
	public String getRecCategoryId() {
		return recCategoryId;
	}
	
	/**
	 * @param recCategoryId
	 *            The rec_category_id
	 */
	@JsonProperty("rec_category_id")
	public void setRecCategoryId(String recCategoryId) {
		this.recCategoryId = recCategoryId;
	}
	
	/**
	 * @return The recPath
	 */
	@JsonProperty("rec_path")
	public String getRecPath() {
		return recPath;
	}
	
	/**
	 * @param recPath
	 *            The rec_path
	 */
	@JsonProperty("rec_path")
	public void setRecPath(String recPath) {
		this.recPath = recPath;
	}
	
	/**
	 * @return The recName
	 */
	@JsonProperty("rec_name")
	public String getRecName() {
		return recName;
	}
	
	/**
	 * @param recName
	 *            The rec_name
	 */
	@JsonProperty("rec_name")
	public void setRecName(String recName) {
		this.recName = recName;
	}
	
	/**
	 * @return The recAddr
	 */
	@JsonProperty("rec_addr")
	public String getRecAddr() {
		return recAddr;
	}
	
	/**
	 * @param recAddr
	 *            The rec_addr
	 */
	@JsonProperty("rec_addr")
	public void setRecAddr(String recAddr) {
		this.recAddr = recAddr;
	}
	
	/**
	 * @return The recInfo
	 */
	@JsonProperty("rec_info")
	public RecInfo getRecInfo() {
		return recInfo;
	}
	
	/**
	 * @param recInfo
	 *            The rec_info
	 */
	@JsonProperty("rec_info")
	public void setRecInfo(RecInfo recInfo) {
		this.recInfo = recInfo;
	}
	
	/**
	 * @return The recHeight
	 */
	@JsonProperty("rec_height")
	public String getRecHeight() {
		return recHeight;
	}
	
	/**
	 * @param recHeight
	 *            The rec_height
	 */
	@JsonProperty("rec_height")
	public void setRecHeight(String recHeight) {
		this.recHeight = recHeight;
	}
	
	/**
	 * @return The recBitrate
	 */
	@JsonProperty("rec_bitrate")
	public String getRecBitrate() {
		return recBitrate;
	}
	
	/**
	 * @param recBitrate
	 *            The rec_bitrate
	 */
	@JsonProperty("rec_bitrate")
	public void setRecBitrate(String recBitrate) {
		this.recBitrate = recBitrate;
	}
	
	/**
	 * @return The recDuration
	 */
	@JsonProperty("rec_duration")
	public String getRecDuration() {
		return recDuration;
	}
	
	/**
	 * @param recDuration
	 *            The rec_duration
	 */
	@JsonProperty("rec_duration")
	public void setRecDuration(String recDuration) {
		this.recDuration = recDuration;
	}
	
	/**
	 * @return The recDateAdded
	 */
	@JsonProperty("rec_date_added")
	public String getRecDateAdded() {
		return recDateAdded;
	}
	
	/**
	 * @param recDateAdded
	 *            The rec_date_added
	 */
	@JsonProperty("rec_date_added")
	public void setRecDateAdded(String recDateAdded) {
		this.recDateAdded = recDateAdded;
	}
	
	/**
	 * @return The recSavedMediaId
	 */
	@JsonProperty("rec_saved_media_id")
	public Object getRecSavedMediaId() {
		return recSavedMediaId;
	}
	
	/**
	 * @param recSavedMediaId
	 *            The rec_saved_media_id
	 */
	@JsonProperty("rec_saved_media_id")
	public void setRecSavedMediaId(String recSavedMediaId) {
		this.recSavedMediaId = recSavedMediaId;
	}
	
	/**
	 * @return The thumbnail
	 */
	@JsonProperty("thumbnail")
	public String getThumbnail() {
		return thumbnail;
	}
	
	/**
	 * @param thumbnail
	 *            The thumbnail
	 */
	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	/**
	 * @return The thumbnailLarge
	 */
	@JsonProperty("thumbnail_large")
	public String getThumbnailLarge() {
		return thumbnailLarge;
	}
	
	/**
	 * @param thumbnailLarge
	 *            The thumbnail_large
	 */
	@JsonProperty("thumbnail_large")
	public void setThumbnailLarge(String thumbnailLarge) {
		this.thumbnailLarge = thumbnailLarge;
	}
	
	/**
	 * @return The recDurationSec
	 */
	@JsonProperty("rec_duration_sec")
	public String getRecDurationSec() {
		return recDurationSec;
	}
	
	/**
	 * @param recDurationSec
	 *            The rec_duration_sec
	 */
	@JsonProperty("rec_duration_sec")
	public void setRecDurationSec(String recDurationSec) {
		this.recDurationSec = recDurationSec;
	}
	
	/**
	 * @return The recDownloadLink
	 */
	@JsonProperty("rec_download_link")
	public String getRecDownloadLink() {
		return recDownloadLink;
	}
	
	/**
	 * @param recDownloadLink
	 *            The rec_download_link
	 */
	@JsonProperty("rec_download_link")
	public void setRecDownloadLink(String recDownloadLink) {
		this.recDownloadLink = recDownloadLink;
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