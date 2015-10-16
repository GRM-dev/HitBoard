/**
 * 
 */
package pl.grmdev.hitboard.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;
/**
 * @author Levvy055
 */
public class HashTest {
	
	private static String TEST_STRING_TO_ENCODE = "Test555ggaf64w";
	private static byte[] STRING_ENCRYPTED;
	private static byte[] IV;
	
	@Test
	@Before
	public void hashEncodeTest() {
		try {
			Hash hash = new Hash();
			byte[] encrypted = hash
					.encrypt(TEST_STRING_TO_ENCODE.getBytes("Cp1252"));
			assertThat(encrypted).isNotNull().isNotEmpty();
			byte[] iv = hash.getIV();
			assertThat(iv).isNotNull().isNotEmpty();
			String ivS = new String(iv, "Cp1252");
			assertThat(ivS).isNotNull().isNotEmpty();
			STRING_ENCRYPTED = encrypted;
			IV = iv;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void hashDecodeTest() {
		try {
			Hash hash = new Hash(IV);
			byte[] decrypted = hash.decrypt(STRING_ENCRYPTED);
			assertThat(decrypted).isNotNull().isNotEmpty();
			assertThat(decrypted).isEqualTo(TEST_STRING_TO_ENCODE.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void hashAllTest() {
		try {
			Hash hash = new Hash();
			String str = "n3764 5y74aw g";
			byte[] encrypt = hash.encrypt(str.getBytes("Cp1252"));
			byte[] decrypt = hash.decrypt(encrypt);
			assertThat(decrypt).isNotNull().isNotEmpty();
			assertThat(str.getBytes()).isEqualTo(decrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
