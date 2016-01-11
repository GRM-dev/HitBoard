package pl.grmdev.hitboard.requests.web.data;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"category_id", "category_name", "category_name_short", "category_seo_key", "category_viewers", "category_media_count", "category_channels", "category_logo_small", "category_logo_large",
	"category_updated"})
public class Category {

	@JsonProperty("category_id")
	private String						categoryId;
	@JsonProperty("category_name")
	private String						categoryName;
	@JsonProperty("category_name_short")
	private Object						categoryNameShort;
	@JsonProperty("category_seo_key")
	private String						categorySeoKey;
	@JsonProperty("category_viewers")
	private String						categoryViewers;
	@JsonProperty("category_media_count")
	private String						categoryMediaCount;
	@JsonProperty("category_channels")
	private Object						categoryChannels;
	@JsonProperty("category_logo_small")
	private Object						categoryLogoSmall;
	@JsonProperty("category_logo_large")
	private String						categoryLogoLarge;
	@JsonProperty("category_updated")
	private String						categoryUpdated;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
																		
	/**
	 * @return
	 * 			The categoryId
	 */
	@JsonProperty("category_id")
	public String getCategoryId() {
		return categoryId;
	}
	
	/**
	 * @param categoryId
	 *           The category_id
	 */
	@JsonProperty("category_id")
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * @return
	 * 			The categoryName
	 */
	@JsonProperty("category_name")
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * @param categoryName
	 *           The category_name
	 */
	@JsonProperty("category_name")
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * @return
	 * 			The categoryNameShort
	 */
	@JsonProperty("category_name_short")
	public Object getCategoryNameShort() {
		return categoryNameShort;
	}
	
	/**
	 * @param categoryNameShort
	 *           The category_name_short
	 */
	@JsonProperty("category_name_short")
	public void setCategoryNameShort(Object categoryNameShort) {
		this.categoryNameShort = categoryNameShort;
	}
	
	/**
	 * @return
	 * 			The categorySeoKey
	 */
	@JsonProperty("category_seo_key")
	public String getCategorySeoKey() {
		return categorySeoKey;
	}
	
	/**
	 * @param categorySeoKey
	 *           The category_seo_key
	 */
	@JsonProperty("category_seo_key")
	public void setCategorySeoKey(String categorySeoKey) {
		this.categorySeoKey = categorySeoKey;
	}
	
	/**
	 * @return
	 * 			The categoryViewers
	 */
	@JsonProperty("category_viewers")
	public String getCategoryViewers() {
		return categoryViewers;
	}
	
	/**
	 * @param categoryViewers
	 *           The category_viewers
	 */
	@JsonProperty("category_viewers")
	public void setCategoryViewers(String categoryViewers) {
		this.categoryViewers = categoryViewers;
	}
	
	/**
	 * @return
	 * 			The categoryMediaCount
	 */
	@JsonProperty("category_media_count")
	public String getCategoryMediaCount() {
		return categoryMediaCount;
	}
	
	/**
	 * @param categoryMediaCount
	 *           The category_media_count
	 */
	@JsonProperty("category_media_count")
	public void setCategoryMediaCount(String categoryMediaCount) {
		this.categoryMediaCount = categoryMediaCount;
	}
	
	/**
	 * @return
	 * 			The categoryChannels
	 */
	@JsonProperty("category_channels")
	public Object getCategoryChannels() {
		return categoryChannels;
	}
	
	/**
	 * @param categoryChannels
	 *           The category_channels
	 */
	@JsonProperty("category_channels")
	public void setCategoryChannels(Object categoryChannels) {
		this.categoryChannels = categoryChannels;
	}
	
	/**
	 * @return
	 * 			The categoryLogoSmall
	 */
	@JsonProperty("category_logo_small")
	public Object getCategoryLogoSmall() {
		return categoryLogoSmall;
	}
	
	/**
	 * @param categoryLogoSmall
	 *           The category_logo_small
	 */
	@JsonProperty("category_logo_small")
	public void setCategoryLogoSmall(Object categoryLogoSmall) {
		this.categoryLogoSmall = categoryLogoSmall;
	}
	
	/**
	 * @return
	 * 			The categoryLogoLarge
	 */
	@JsonProperty("category_logo_large")
	public String getCategoryLogoLarge() {
		return categoryLogoLarge;
	}
	
	/**
	 * @param categoryLogoLarge
	 *           The category_logo_large
	 */
	@JsonProperty("category_logo_large")
	public void setCategoryLogoLarge(String categoryLogoLarge) {
		this.categoryLogoLarge = categoryLogoLarge;
	}
	
	/**
	 * @return
	 * 			The categoryUpdated
	 */
	@JsonProperty("category_updated")
	public String getCategoryUpdated() {
		return categoryUpdated;
	}
	
	/**
	 * @param categoryUpdated
	 *           The category_updated
	 */
	@JsonProperty("category_updated")
	public void setCategoryUpdated(String categoryUpdated) {
		this.categoryUpdated = categoryUpdated;
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
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(categoryId).append(categoryName).append(categoryNameShort).append(categorySeoKey).append(categoryViewers).append(categoryMediaCount).append(categoryChannels)
			.append(categoryLogoSmall).append(categoryLogoLarge).append(categoryUpdated).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Category) == false) { return false; }
		Category rhs = ((Category) other);
		return new EqualsBuilder().append(categoryId, rhs.categoryId).append(categoryName, rhs.categoryName).append(categoryNameShort, rhs.categoryNameShort).append(categorySeoKey, rhs.categorySeoKey)
			.append(categoryViewers, rhs.categoryViewers).append(categoryMediaCount, rhs.categoryMediaCount).append(categoryChannels, rhs.categoryChannels)
			.append(categoryLogoSmall, rhs.categoryLogoSmall).append(categoryLogoLarge, rhs.categoryLogoLarge).append(categoryUpdated, rhs.categoryUpdated)
			.append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}