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
@JsonPropertyOrder({"default", "dub", "original", "comment", "lyrics",
		"karaoke", "forced", "hearing_impaired", "visual_impaired",
		"clean_effects", "attached_pic"})
public class Disposition {
	
	@JsonProperty("default")
	private Integer _default;
	@JsonProperty("dub")
	private Integer dub;
	@JsonProperty("original")
	private Integer original;
	@JsonProperty("comment")
	private Integer comment;
	@JsonProperty("lyrics")
	private Integer lyrics;
	@JsonProperty("karaoke")
	private Integer karaoke;
	@JsonProperty("forced")
	private Integer forced;
	@JsonProperty("hearing_impaired")
	private Integer hearingImpaired;
	@JsonProperty("visual_impaired")
	private Integer visualImpaired;
	@JsonProperty("clean_effects")
	private Integer cleanEffects;
	@JsonProperty("attached_pic")
	private Integer attachedPic;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public Disposition() {}
	
	/**
	 * @param attachedPic
	 * @param karaoke
	 * @param _default
	 * @param original
	 * @param visualImpaired
	 * @param lyrics
	 * @param comment
	 * @param dub
	 * @param hearingImpaired
	 * @param cleanEffects
	 * @param forced
	 */
	public Disposition(Integer _default, Integer dub, Integer original,
			Integer comment, Integer lyrics, Integer karaoke, Integer forced,
			Integer hearingImpaired, Integer visualImpaired,
			Integer cleanEffects, Integer attachedPic) {
		this._default = _default;
		this.dub = dub;
		this.original = original;
		this.comment = comment;
		this.lyrics = lyrics;
		this.karaoke = karaoke;
		this.forced = forced;
		this.hearingImpaired = hearingImpaired;
		this.visualImpaired = visualImpaired;
		this.cleanEffects = cleanEffects;
		this.attachedPic = attachedPic;
	}
	
	/**
	 * @return The _default
	 */
	@JsonProperty("default")
	public Integer getDefault() {
		return _default;
	}
	
	/**
	 * @param _default
	 *            The default
	 */
	@JsonProperty("default")
	public void setDefault(Integer _default) {
		this._default = _default;
	}
	
	/**
	 * @return The dub
	 */
	@JsonProperty("dub")
	public Integer getDub() {
		return dub;
	}
	
	/**
	 * @param dub
	 *            The dub
	 */
	@JsonProperty("dub")
	public void setDub(Integer dub) {
		this.dub = dub;
	}
	
	/**
	 * @return The original
	 */
	@JsonProperty("original")
	public Integer getOriginal() {
		return original;
	}
	
	/**
	 * @param original
	 *            The original
	 */
	@JsonProperty("original")
	public void setOriginal(Integer original) {
		this.original = original;
	}
	
	/**
	 * @return The comment
	 */
	@JsonProperty("comment")
	public Integer getComment() {
		return comment;
	}
	
	/**
	 * @param comment
	 *            The comment
	 */
	@JsonProperty("comment")
	public void setComment(Integer comment) {
		this.comment = comment;
	}
	
	/**
	 * @return The lyrics
	 */
	@JsonProperty("lyrics")
	public Integer getLyrics() {
		return lyrics;
	}
	
	/**
	 * @param lyrics
	 *            The lyrics
	 */
	@JsonProperty("lyrics")
	public void setLyrics(Integer lyrics) {
		this.lyrics = lyrics;
	}
	
	/**
	 * @return The karaoke
	 */
	@JsonProperty("karaoke")
	public Integer getKaraoke() {
		return karaoke;
	}
	
	/**
	 * @param karaoke
	 *            The karaoke
	 */
	@JsonProperty("karaoke")
	public void setKaraoke(Integer karaoke) {
		this.karaoke = karaoke;
	}
	
	/**
	 * @return The forced
	 */
	@JsonProperty("forced")
	public Integer getForced() {
		return forced;
	}
	
	/**
	 * @param forced
	 *            The forced
	 */
	@JsonProperty("forced")
	public void setForced(Integer forced) {
		this.forced = forced;
	}
	
	/**
	 * @return The hearingImpaired
	 */
	@JsonProperty("hearing_impaired")
	public Integer getHearingImpaired() {
		return hearingImpaired;
	}
	
	/**
	 * @param hearingImpaired
	 *            The hearing_impaired
	 */
	@JsonProperty("hearing_impaired")
	public void setHearingImpaired(Integer hearingImpaired) {
		this.hearingImpaired = hearingImpaired;
	}
	
	/**
	 * @return The visualImpaired
	 */
	@JsonProperty("visual_impaired")
	public Integer getVisualImpaired() {
		return visualImpaired;
	}
	
	/**
	 * @param visualImpaired
	 *            The visual_impaired
	 */
	@JsonProperty("visual_impaired")
	public void setVisualImpaired(Integer visualImpaired) {
		this.visualImpaired = visualImpaired;
	}
	
	/**
	 * @return The cleanEffects
	 */
	@JsonProperty("clean_effects")
	public Integer getCleanEffects() {
		return cleanEffects;
	}
	
	/**
	 * @param cleanEffects
	 *            The clean_effects
	 */
	@JsonProperty("clean_effects")
	public void setCleanEffects(Integer cleanEffects) {
		this.cleanEffects = cleanEffects;
	}
	
	/**
	 * @return The attachedPic
	 */
	@JsonProperty("attached_pic")
	public Integer getAttachedPic() {
		return attachedPic;
	}
	
	/**
	 * @param attachedPic
	 *            The attached_pic
	 */
	@JsonProperty("attached_pic")
	public void setAttachedPic(Integer attachedPic) {
		this.attachedPic = attachedPic;
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