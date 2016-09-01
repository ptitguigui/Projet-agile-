package test;

import static org.junit.Assert.*;

import org.junit.Test;

import plateau.Carte;
import plateau.Paquet;

public class TestCartes {
	
	@Test
	public void testNonTrie() {
		Carte c1 = new Carte("Go");
		Carte c2 = new Carte("Do");
		Carte c3 = new Carte("Vo");
		Carte c4 = new Carte("Zo");
		
		Paquet paq = new Paquet("Chance");
		paq.add(c1);
		paq.add(c2);
		paq.add(c3);
		paq.add(c4);
		
		assertEquals(c1,paq.get(0));
		
	}
	
	@Test
	public void testTrie() {
		Carte c1 = new Carte("Go");
		Carte c2 = new Carte("Do");
		Carte c3 = new Carte("Vo");
		Carte c4 = new Carte("Zo");
		
		Paquet paq = new Paquet("Chance");
		paq.add(c1);
		paq.add(c2);
		paq.add(c3);
		paq.add(c4);
		
		paq.trier();
		assertNotEquals(c1,paq.get(0));
	}
	
	@Test
	public void testPiochePremiereCarte(){
		Carte c1 = new Carte("Go");
		Carte c2 = new Carte("Do");
		Carte c3 = new Carte("Vo");
		Carte c4 = new Carte("Zo");
		
		Paquet paq = new Paquet("Chance");
		paq.add(c1);
		paq.add(c2);
		paq.add(c3);
		paq.add(c4);
		assertEquals(c1, paq.piocher());
		
	}
	@Test
	public void testPiocheDerniereCarte(){
		Carte c1 = new Carte("Go");
		Carte c2 = new Carte("Do");
		Carte c3 = new Carte("Vo");
		Carte c4 = new Carte("Zo");
		
		Paquet paq = new Paquet("Chance");
		paq.add(c1);
		paq.add(c2);
		paq.add(c3);
		paq.add(c4);
		
		paq.piocher();
		assertEquals(c1,paq.get(paq.size()-1));
		
	}

}
