/**
 * 
 */
package pl.grmdev.hitboard.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import java.util.prefs.Preferences;

import org.junit.Test;
/**
 * @author Levvy055
 */
public class PreferencesTest {
	
	@Test
	public void writePrefTest() {
		Preferences root = Preferences
				.userNodeForPackage(PreferencesTest.class);
		root.put("test", "ggg");
		assertThat(root.get("test", null)).isNotNull().isEqualTo("ggg");
	}
	
	@Test
	public void overridePrefTest() {
		Preferences root = Preferences
				.userNodeForPackage(PreferencesTest.class);
		root.put("test2", "ggg");
		root.put("test2", "hh");
		assertThat(root.get("test2", null)).isNotNull().isEqualTo("hh");
	}
	
	@Test
	public void encodingConversion() {
		Random rnd = new Random();
		Preferences root = Preferences
				.userNodeForPackage(PreferencesTest.class);
		byte[] bytes = new byte[20];
		String key = "encTest";
		for (int i = 0; i < 100; i++) {
			rnd.nextBytes(bytes);
			root.putByteArray(key, bytes);
			byte[] res = root.getByteArray(key, null);
			assertThat(res).isNotNull().isNotEmpty().isEqualTo(bytes);
		}
	}
}
