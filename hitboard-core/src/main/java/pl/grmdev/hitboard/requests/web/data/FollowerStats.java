package pl.grmdev.hitboard.requests.web.data;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FollowerStats {
	@JsonProperty("date")
	private Date	date;
	@JsonProperty("followers")
	private int		followers;

	@JsonProperty("date")
	public Date getDate() {
		return date;
	}
	
	@JsonProperty("date")
	public void setDate(Date date) {
		this.date = date;
	}
	
	@JsonProperty("followers")
	public int getFollowers() {
		return followers;
	}
	
	@JsonProperty("followers")
	public void setFollowers(int followers) {
		this.followers = followers;
	}
}
