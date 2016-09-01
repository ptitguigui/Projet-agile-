package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeplacementTest {

	@Test
	public void testEnAvant() {
		Joueur test = new Joueur("test");
		int D1 = 1;
		int D2 = 3; 
		test.seDeplace(int D1, int D2);
		assertEquals(4, test.getPos());
	}

}
