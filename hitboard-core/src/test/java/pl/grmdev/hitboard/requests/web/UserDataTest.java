/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author Levvy055
 */
public class UserDataTest {
	
	private static String jsonString = "{\r\n   \"user_id\":\"1\",\r\n   \"user_name\":\"masta\",\r\n   \"user_logo\":\"/static/img/channel/masta_53aa862ac9adf_large.png\",\r\n   \"user_logo_small\":\"/static/img/channel/masta_53aa862ac9adf_small.png\",\r\n   \"user_banned\":\"0\",\r\n   \"user_banned_channel\":\"0\",\r\n   \"superadmin\":\"0\",\r\n   \"livestream_count\":\"1\",\r\n   \"followers\":\"0\",\r\n   \"authToken\":\"SuperSecret\",\r\n   \"login\":\"true\",\r\n   \"data\":{\r\n      \"app\":\"desktop\",\r\n      \"user_id\":\"1\",\r\n      \"user_name\":\"masta\",\r\n      \"user_logo\":\"/static/img/channel/masta_53aa862ac9adf_large.png\",\r\n      \"user_logo_small\":\"/static/img/channel/masta_53aa862ac9adf_small.png\",\r\n      \"user_banned\":\"0\",\r\n      \"superadmin\":\"0\",\r\n      \"livestream_count\":\"1\",\r\n      \"followers\":\"0\",\r\n      \"authToken\":\"SuperSecret\",\r\n      \"login\":\"true\"\r\n   },\r\n   \"access\":\"all\",\r\n   \"app\":\"desktop\"\r\n}";
	
	@Test
	public void jsonUserConvertTest() {
		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		try {
			User user = objectMapper.readValue(jsonString, User.class);
			assertThat(user).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void jsonUserDataTest() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			User user = objectMapper.readValue(jsonString, User.class);
			UserData userData = user.getUserData();
			assertThat(userData).isNotNull();
			Method[] declaredMethods = userData.getClass().getDeclaredMethods();
			assertThat(declaredMethods).isNotNull().isNotEmpty();
			for (Method method : declaredMethods) {
				if (method.getName().startsWith("get")) {
					Object result = method.invoke(userData);
					assertThat(result).isNotNull();
					if (result.getClass() == String.class) {
						String resS = (String) result;
						assertThat(resS).isNotNull().isNotEmpty();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
