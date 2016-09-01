package test;

import static org.junit.Assert.*;

import org.junit.Test;

import gameplay.Joueur;
import plateau.Gare;
import plateau.GroupeCase;;

public class GareTest {

	Joueur j1 = new Joueur("j1");
	Joueur j2 = new Joueur("j2");

	GroupeCase groupe;
	
	@Test
	public void constructorTest(){
		Gare gare = new Gare("g1",1,200,25,j1);
		assertEquals(j1,gare.getProprietaire());
		assertEquals(200,gare.getPrix());
		assertEquals("g1",gare.getNom());
		assertEquals(1,gare.getNum());
		assertEquals(25,gare.calculerLoyer());
	}
	
	Gare g1 = new Gare("g1",1,200,25,j1,groupe);
	Gare g2 = new Gare("g2",2,200,25,j1,groupe);
	Gare g3 = new Gare("g3",3,200,25,j1,groupe);
	Gare g4 = new Gare("g4",4,200,25,j1,groupe);
	
	@Test
	public void quatre_gare(){
		assertEquals(4,g1.nombreGare(g1.getProprietaire()));
	}
	/*
	@Test
	public void action_gare_sans_proprio(){
		Gare gare = new Gare("g1",1,200,25,null);
	}*/
	
	
}
