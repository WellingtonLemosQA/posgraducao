import org.junit.Test;

import java.util.Random;

import org.junit.Assert;

public class ValoresTest {
	
	

	@Test
	public void testIns() {
		Valores v1 = new Valores();
		Random gerador = new Random();
		for(int i =0; i<15; i++) {
			v1.ins(gerador.nextInt());
		};
		Assert.assertEquals(10, v1.size());
	}

	@Test
	public void testDel() {
		Valores v2 = new Valores();
		Random gerador = new Random();
		for(int i =0; i<10; i++) {
			v2.ins(gerador.nextInt());
		};
		v2.del(4);
		v2.del(6);
		Assert.assertEquals(8, v2.size());
	}

	@Test
	public void testSize() {
		Valores v3 = new Valores();
		Random gerador = new Random();
		for(int i =0; i<7; i++) {
			v3.ins(gerador.nextInt());
		};
		Assert.assertEquals(7, v3.size());
	}

}
