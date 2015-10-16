/**
 * 
 */
package pl.grmdev.hitboard.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;

import pl.grmdev.hitboard.HitBoardCore;
/**
 * @author Levvy055
 */
public class ConfigTest {
	
	private static Config config;
	
	@BeforeClass
	public static void configCreation() {
		config = new Config(HitBoardCore.instance());
	}
	
	@Test
	public void configDefaultsTest() {
		for (ConfigId conf : ConfigId.values()) {
			Object str = config.get(conf);
			assertThat(str).isNotNull();
		}
	}
	
	@Test
	public void configWriteTest() {
		String fName = "file.name.1";
		int v = 66456;
		config.set(ConfigId.LAST_FILE_NAME, fName);
		config.set(ConfigId.LAST_SAVE_PATH, v);
		String o1 = config.get(ConfigId.LAST_FILE_NAME);
		int o2 = config.get(ConfigId.LAST_SAVE_PATH);
		assertThat(o1).isNotNull().isNotEmpty().isEqualTo(fName);
		assertThat(o2).isNotNull().isEqualTo(v);
	}
}
