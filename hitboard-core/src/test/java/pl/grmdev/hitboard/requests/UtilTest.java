/**
 * 
 */
package pl.grmdev.hitboard.requests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.grmdev.hitboard.requests.util.*;
/**
 * @author Levvy055
 */
public class UtilTest {
	
	@Test
	public void HbGetTest() {
		assertThat(HbGet.values()).isNotNull().isNotEmpty();
		for (HbGet getE : HbGet.values()) {
			assertThat(getE).isNotNull();
			String getS;
			try {
				getS = getE.getCmd();
				assertThat(getS).isNotNull().isNotEmpty();
				if (getE.getObjects() != null) {
					String[] objects = getE.getObjects();
					assertThat(objects).isNotEmpty();
					assertThat(getS).contains(":");
					int colNmb = getS.length()
							- getS.replaceAll(":", "").length();
					assertThat(colNmb).isEqualTo(objects.length);
					for (String obj : objects) {
						assertThat(obj).isNotNull().isNotEmpty();
						assertThat(obj).contains(":");
						assertThat(getS).contains(obj);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void HbPostTest() {
		assertThat(HbPost.values()).isNotNull().isNotEmpty();
		for (HbPost getE : HbPost.values()) {
			assertThat(getE).isNotNull();
			String getS = getE.getCmd();
			assertThat(getS).isNotNull().isNotEmpty();
			if (getE.getObjects() != null) {
				String[] objects = getE.getObjects();
				assertThat(objects).isNotEmpty();
				assertThat(getS).contains(":");
				int colNmb = getS.length() - getS.replaceAll(":", "").length();
				assertThat(colNmb).isEqualTo(objects.length);
				for (String obj : objects) {
					assertThat(obj).isNotNull().isNotEmpty();
					assertThat(obj).contains(":");
					assertThat(getS).contains(obj);
				}
			}
		}
	}
	
	@Test
	public void HbPutTest() {
		assertThat(HbPut.values()).isNotNull().isNotEmpty();
		for (HbPut getE : HbPut.values()) {
			assertThat(getE).isNotNull();
			String getS = getE.getCmd();
			assertThat(getS).isNotNull().isNotEmpty();
			if (getE.getObjects() != null) {
				String[] objects = getE.getObjects();
				assertThat(objects).isNotEmpty();
				assertThat(getS).contains(":");
				int colNmb = getS.length() - getS.replaceAll(":", "").length();
				assertThat(colNmb).isEqualTo(objects.length);
				for (String obj : objects) {
					assertThat(obj).isNotNull().isNotEmpty();
					assertThat(obj).contains(":");
					assertThat(getS).contains(obj);
				}
			}
		}
	}
	
	@Test
	public void HbDeleteTest() {
		assertThat(HbDelete.values()).isNotNull().isNotEmpty();
		for (HbDelete getE : HbDelete.values()) {
			assertThat(getE).isNotNull();
			String getS = getE.getCmd();
			assertThat(getS).isNotNull().isNotEmpty();
			if (getE.getObjects() != null) {
				String[] objects = getE.getObjects();
				assertThat(objects).isNotEmpty();
				assertThat(getS).contains(":");
				int colNmb = getS.length() - getS.replaceAll(":", "").length();
				assertThat(colNmb).isEqualTo(objects.length);
				for (String obj : objects) {
					assertThat(obj).isNotNull().isNotEmpty();
					assertThat(obj).contains(":");
					assertThat(getS).contains(obj);
				}
			}
		}
	}
}
