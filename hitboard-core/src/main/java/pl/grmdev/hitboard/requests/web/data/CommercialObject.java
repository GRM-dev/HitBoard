/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;


/**
 * @author Levvy055
 *
 */
public class CommercialObject implements LastCommercial, Commercial {
	
	private String seconds_ago;
	private String ad_count;
	private long timeout;
	private String method;
	private String channel;
	private String count;
	private String delay;
	private String token;
	private String url;
	private long timestamp;
	
	public CommercialObject(String method, String channel, String count,
			String delay, String token, String url, long timestamp) {
		super();
		this.method = method;
		this.channel = channel;
		this.count = count;
		this.delay = delay;
		this.token = token;
		this.url = url;
		this.timestamp = timestamp;
	}
	
	public CommercialObject() {}
	
	public CommercialObject(String seconds_ago, String ad_count, long timeout) {
		this.seconds_ago = seconds_ago;
		this.ad_count = ad_count;
		this.timeout = timeout;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.LastCommercial#getSeconds_ago()
	 */
	@Override
	public String getSeconds_ago() {
		return seconds_ago;
	}
	
	public void setSeconds_ago(String seconds_ago) {
		this.seconds_ago = seconds_ago;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.LastCommercial#getAd_count()
	 */
	@Override
	public String getAdCount() {
		return ad_count;
	}
	
	public void setAdCount(String ad_count) {
		this.ad_count = ad_count;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.LastCommercial#getTimeout()
	 */
	@Override
	public long getTimeout() {
		return timeout;
	}
	
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getMethod()
	 */
	@Override
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getChannel()
	 */
	@Override
	public String getChannel() {
		return channel;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getCount()
	 */
	@Override
	public String getCount() {
		return count;
	}
	
	public void setCount(String count) {
		this.count = count;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getDelay()
	 */
	@Override
	public String getDelay() {
		return delay;
	}
	
	public void setDelay(String delay) {
		this.delay = delay;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getToken()
	 */
	@Override
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getUrl()
	 */
	@Override
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.Commercial#getTimestampt()
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
