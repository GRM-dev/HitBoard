/**
 * 
 */
package pl.grmdev.hitboard.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
/**
 * @author Levvy055
 */
public class ArrayUtilTest {
	
	@Test
	public void disperseIntArrayTest() {
		int[] a = new int[]{5, 12, 5, 7, 3};
		Object o = a;
		List dO = ArrayUtil.disperseToList(o);
		int[] doa = new int[dO.size()];
		for (int i = 0; i < dO.size(); i++) {
			doa[i] = (int) dO.get(i);
		}
		assertThat(doa).isNotNull().isNotEmpty().isEqualTo(a);
	}
	
	@Test
	public void disperseStringArrayTest() {
		String[] a = new String[]{"gg", "lol", "omg"};
		Object o = a;
		List dO = ArrayUtil.disperseToList(o);
		String[] doa = new String[dO.size()];
		for (int i = 0; i < dO.size(); i++) {
			doa[i] = (String) dO.get(i);
		}
		assertThat(doa).isNotNull().isNotEmpty().isEqualTo(a);
	}
	
	@Test
	public void disperseByteArrayTest() {
		byte[] a = new byte[]{-120, 5, 121, -57, 68, 98, -41, 45, -41};
		Object o = a;
		List dO = ArrayUtil.disperseToList(o);
		byte[] doa = new byte[dO.size()];
		for (int i = 0; i < dO.size(); i++) {
			doa[i] = (byte) dO.get(i);
		}
		assertThat(doa).isNotNull().isNotEmpty().isEqualTo(a);
	}
	
	@Test
	public void disperseOtherClassArrayTest() {
		InnerClassTest o1 = new InnerClassTest(8);
		InnerClassTest o2 = new InnerClassTest(74);
		InnerClassTest[] a = new InnerClassTest[]{o1, o2};
		Object o = a;
		List dO = ArrayUtil.disperseToList(o);
		InnerClassTest[] doa = new InnerClassTest[dO.size()];
		for (int i = 0; i < dO.size(); i++) {
			doa[i] = (InnerClassTest) dO.get(i);
		}
		assertThat(doa).isNotNull().isNotEmpty().isEqualTo(a);
		for (InnerClassTest iO : doa) {
			assertThat(iO).isNotNull();
			assertThat(iO.getI()).isNotNull().isNotEqualTo(0);
			assertThat(iO.toString()).startsWith("InnerClassTest [i=")
					.endsWith("]");
		}
	}
	
	@Test
	public void disperseLongToArrayTest() {
		long[] a = new long[]{-120, 5, 121, -57, 68, 98, -41, 45, -41};
		Object o = a;
		Object[] doA = ArrayUtil.disperseToArray(o);
		assertThat(doA).isNotNull().isNotEmpty().isEqualTo(a);
	}
	
	class InnerClassTest {
		
		private int i;
		
		public InnerClassTest(int i) {
			this.i = i;
		}
		
		int getI() {
			return i;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("InnerClassTest [i=");
			builder.append(i);
			builder.append("]");
			return builder.toString();
		}
	}
}
