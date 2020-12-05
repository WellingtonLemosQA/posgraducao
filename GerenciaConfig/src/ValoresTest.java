import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;

public class ValoresTest {
	
	private Valores v;
	@Before
	public void setup() {
		v = new Valores();
		v.ins(1);
		v.ins(2);
		v.ins(3);
		v.ins(4);
		v.ins(5);
		v.ins(6);
		v.ins(7);
	}

	@Test
	public void testIns() {
		assertEquals(false, v.ins(-3));
		v.ins(8);
		assertEquals(8, v.size());
		v.ins(7);
		v.ins(6);
		assertEquals(10, v.size());
		assertEquals(false, v.ins(5));
	}

	@Test
	public void testDel() {
		assertEquals(7, v.del(6));
		assertEquals(-1, v.del(6));
	}

	@Test
	public void testSize() {
		v.ins(7);
		assertEquals(8, v.size());
		v.del(7);
		assertEquals(7, v.size());
	}

}
