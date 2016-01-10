package pl.grmdev.hitboard.requests.web.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Daily {
	@JsonProperty("earnings")
	private double earnings;

	public double getEarnings() {
		return earnings;
	}
	
	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
}
