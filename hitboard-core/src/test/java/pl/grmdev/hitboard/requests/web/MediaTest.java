/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.*;
import java.util.*;

import org.junit.*;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.*;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * @author Levvy055
 */
public class MediaTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
		File file = new File(System.getProperty("user.home")
				+ "/keystore/hb.gradle.properties");
		Token token = reqH.getToken();
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			if (!token.genAuthToken(u, p)) {
				fail("Token not generated");
			}
			String tokenS = token.getToken();
			assertThat(tokenS).isNotNull().isNotEmpty();
			assertThat(token.applyUser()).isTrue();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void getLiveObjectTest() {
		try {
			MediaObject mediaLive = reqH.getMedia()
					.getLiveObject(reqH.getUser().getUserName());
			assertThat(mediaLive).isNotNull();
			ChannelData channel = mediaLive.getChannel();
			assertThat(channel).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getLiveObjectListTest() {
		try {
			List<MediaObject> mediaLives = reqH.getMedia()
					.getLiveObjectsList(false, false, false, true);
			assertThat(mediaLives).isNotNull().isNotEmpty();
			for (MediaObject mediaLive : mediaLives) {
				assertThat(mediaLive.getMediaId()).isNotNull().isGreaterThan(0);
				if (mediaLive.getMediaCountries() != null) {
					for (Object country : mediaLive.getMediaCountries()) {
						assertThat((String) country).isNotNull().isNotEmpty();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getStatusTest() {
		try {
			MediaStatus mediaStatus = reqH.getMedia()
					.getMediaStatus(reqH.getUser().getUserName());
			assertThat(mediaStatus).isNotNull();
			assertThat(mediaStatus.getVievs()).isNotNull().isGreaterThan(0);
			assertThat(mediaStatus.isLive()).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getVideoObjectList() {
		List<MediaObject> list = null;
		try {
			list = reqH.getMedia().getMediaVideoObjectList(false, false, false,
					false, false, 20, reqH.getUser().getUserName());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
		assertThat(list).isNotNull().isNotEmpty();
		for (MediaObject mediaLive : list) {
			assertThat(mediaLive).isNotNull();
			assertThat(mediaLive.getMediaName()).isNotNull().isNotEmpty();
		}
	}
	
	@Test
	public void getVideoObjectTest() {
		try {
			MediaObject mediaLive = reqH.getMedia().getVideoObject("730797");
			assertThat(mediaLive).isNotNull();
			ChannelData channel = mediaLive.getChannel();
			assertThat(channel).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getViewsTest() {
		try {
			int views = reqH.getMedia()
					.getMediaVievs(reqH.getUser().getUserName());
			assertThat(views).isNotNull().isNotNegative();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getStreamInfo() {
		try {
			MediaInfo streamInfo = reqH.getMedia().getStreamInfo("730797");
			assertThat(streamInfo).isNotNull();
			assertThat(streamInfo.getProfile()).isNotNull().isNotEmpty();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage()); // There will be exception if
												// channel is not streaming
		}
	}
	
	@Test
	public void getRecordingObjectTest() {
		try {
			List<Recording> list = reqH.getMedia().getRecordingObjects(30,
					reqH.getUser().getUserName());
			assertThat(list).isNotNull().isNotEmpty();
			for (Recording recording : list) {
				assertThat(recording).isNotNull();
				assertThat(recording.getRecId()).isNotNull().isNotEmpty();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void updateLiveChannelTest() {
		String testTitle1 = "testInProgess";
		try {
			MediaObject mObj = reqH.getMedia().getLiveObject("hitboard");
			mObj.setMediaStatus(testTitle1);
			MediaObject mObj2 = reqH.getMedia().updateLiveChannel("hitboard",
					mObj);
			assertThat(mObj2).isNotNull();
			String mediaStatus = mObj2.getMediaStatus();
			assertThat(mediaStatus).isNotNull().isNotEmpty()
					.isEqualTo(testTitle1);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void updateVideoTest() {
		String testTitle1 = "testInProgessOfUpdatVideo";
		try {
			MediaObject mObj = reqH.getMedia().getVideoObject("730797");
			mObj.setMediaStatus(testTitle1);
			MediaObject mObj2 = reqH.getMedia().updateVideo("hitboard", mObj);
			assertThat(mObj2).isNotNull();
			String mediaStatus = mObj2.getMediaStatus();
			assertThat(mediaStatus).isNotNull().isNotEmpty()
					.isEqualTo(testTitle1);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
		
	}
}
