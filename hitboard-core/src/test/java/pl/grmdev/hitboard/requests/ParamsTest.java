/**
 * 
 */
package pl.grmdev.hitboard.requests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.grmdev.hitboard.requests.util.Params;
/**
 * @author Levvy055
 */
public class ParamsTest {
	
	@Test
	public void paramsCreationTest() {
		Params params = new Params();
		assertThat(params).isNotNull();
		assertThat(params.iterator()).isNotNull();
		assertThat(params.p("jj", "").get("jj")).isNotNull();
	}
	
	@Test
	public void paramsEmptyEqualTest() {
		Params p1 = new Params();
		Params p2 = new Params();
		assertThat(p1.equals(p2)).isTrue();
	}
	
	@Test
	public void paramsNotEqualTest() {
		Params p1 = new Params().p("1", "");
		Params p2 = new Params();
		assertThat(p1.equals(p2)).isFalse();
		p2 = p2.p("2", "a");
		assertThat(p1.equals(p2)).isFalse();
	}
	
	@Test
	public void paramsDiffEqualTest() {
		Params p1 = new Params().p("gg", "ffa").p("faa", "aa");
		Params p2 = new Params().p("gg", "fa").p("faa", "jkf");
		assertThat(p1.equals(p2)).isTrue();
	}
}
