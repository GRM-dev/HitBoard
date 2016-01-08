package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
	@JsonProperty("uniques")
	private int	uniques;
	@JsonProperty("views")
	private int	views;
	@JsonProperty("viewtime")
	private int	viewTime;
				
	public int getUniques() {
		return uniques;
	}
	
	public void setUniques(int uniques) {
		this.uniques = uniques;
	}

	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getViewTime() {
		return viewTime;
	}
	
	public void setViewTime(int viewtime) {
		this.viewTime = viewtime;
	}
}
