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
"currency",
"total_earnings",
"max_earnings",
"viewed_hours",
"unique_user"
})
public class Summary {

@JsonProperty("currency")
private String currency;
@JsonProperty("total_earnings")
private Long totalEarnings;
@JsonProperty("max_earnings")
private Object maxEarnings;
@JsonProperty("viewed_hours")
private Long viewedHours;
@JsonProperty("unique_user")
private Long uniqueUser;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The currency
*/
@JsonProperty("currency")
public String getCurrency() {
return currency;
}

/**
* 
* @param currency
* The currency
*/
@JsonProperty("currency")
public void setCurrency(String currency) {
this.currency = currency;
}

/**
* 
* @return
* The totalEarnings
*/
@JsonProperty("total_earnings")
public Long getTotalEarnings() {
return totalEarnings;
}

/**
* 
* @param totalEarnings
* The total_earnings
*/
@JsonProperty("total_earnings")
public void setTotalEarnings(Long totalEarnings) {
this.totalEarnings = totalEarnings;
}

/**
* 
* @return
* The maxEarnings
*/
@JsonProperty("max_earnings")
public Object getMaxEarnings() {
return maxEarnings;
}

/**
* 
* @param maxEarnings
* The max_earnings
*/
@JsonProperty("max_earnings")
public void setMaxEarnings(Object maxEarnings) {
this.maxEarnings = maxEarnings;
}

/**
* 
* @return
* The viewedHours
*/
@JsonProperty("viewed_hours")
public Long getViewedHours() {
return viewedHours;
}

/**
* 
* @param viewedHours
* The viewed_hours
*/
@JsonProperty("viewed_hours")
public void setViewedHours(Long viewedHours) {
this.viewedHours = viewedHours;
}

/**
* 
* @return
* The uniqueUser
*/
@JsonProperty("unique_user")
public Long getUniqueUser() {
return uniqueUser;
}

/**
* 
* @param uniqueUser
* The unique_user
*/
@JsonProperty("unique_user")
public void setUniqueUser(Long uniqueUser) {
this.uniqueUser = uniqueUser;
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
return new HashCodeBuilder().append(currency).append(totalEarnings).append(maxEarnings).append(viewedHours).append(uniqueUser).append(additionalProperties).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Summary) == false) {
return false;
}
Summary rhs = ((Summary) other);
return new EqualsBuilder().append(currency, rhs.currency).append(totalEarnings, rhs.totalEarnings).append(maxEarnings, rhs.maxEarnings).append(viewedHours, rhs.viewedHours).append(uniqueUser, rhs.uniqueUser).append(additionalProperties, rhs.additionalProperties).isEquals();
}

}