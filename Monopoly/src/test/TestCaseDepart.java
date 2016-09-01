package test;

import org.junit.Test;
import static org.junit.Assert.*;
import gameplay.Joueur;
import plateau.Plateau;

public class TestCaseDepart {

	@Test
	public void testAjout() {
		
		Joueur j = new Joueur("Kevin");
		j.caseDepart();
		
		assertEquals(20010,j.getCredit());
		
	}

}
