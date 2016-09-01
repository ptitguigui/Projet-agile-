package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import monopoly.gameplay.Joueur;
import monopoly.plateau.Compagnie;
import monopoly.plateau.GroupeCase;

public class testCompagnie {
	Joueur j1;
	Joueur j2;
	GroupeCase	groupe = new GroupeCase("compagnie");
	@Test
	public void test(){
		j1 = new Joueur("j1");
		j2 = new Joueur("j2");
	}
	
	@Test
	public void test1(){
		Compagnie c= new Compagnie("g1",1,200,25,j1,groupe);
		assertEquals(j1,c.getProprietaire());
		assertEquals(200,c.getPrix());
		assertEquals("g1",c.getNom());
		assertEquals(1,c.getNumero());
		assertEquals(36,c.calculerLoyer(j1,4,5));
	}
	
	
	

}
