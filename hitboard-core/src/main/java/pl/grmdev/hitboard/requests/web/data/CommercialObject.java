/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;


/**
 * @author Levvy055
 *
 */
public class CommercialObject {
	
	private String seconds_ago;
	private String ad_count;
	private long timeout;
	
	public CommercialObject() {}
	
	public CommercialObject(String seconds_ago, String ad_count, long timeout) {
		this.seconds_ago = seconds_ago;
		this.ad_count = ad_count;
		this.timeout = timeout;
	}
	
	public String getSeconds_ago() {
		return seconds_ago;
	}
	
	public void setSeconds_ago(String seconds_ago) {
		this.seconds_ago = seconds_ago;
	}
	
	public String getAd_count() {
		return ad_count;
	}
	
	public void setAd_count(String ad_count) {
		this.ad_count = ad_count;
	}
	
	public long getTimeout() {
		return timeout;
	}
	
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
}
