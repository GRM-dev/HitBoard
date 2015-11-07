/**
 * 
 */
package pl.grmdev.hitboard.requests.web.data;

public class MediaStatus {
	
	private boolean isLive;
	private int vievs;
	
	public MediaStatus(boolean isLive, int vievs) {
		this.isLive = isLive;
		this.vievs = vievs;
	}
	
	public boolean isLive() {
		return isLive;
	}
	
	public int getVievs() {
		return vievs;
	}
}