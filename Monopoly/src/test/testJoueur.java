package test;

import static org.junit.Assert.*;

import org.junit.Test;

import monopoly.gameplay.Joueur;
import monopoly.plateau.Compagnie;
import monopoly.plateau.Terrain;

public class testJoueur {
	
	@Test
	public void test() {
		Joueur j1 =new Joueur("pierre");
		assertEquals(j1.getNom(),"pierre");
		assertEquals(j1.getPos(),0);
	}
	@Test
	public void test1() {
		Joueur j1= new Joueur("jean");
		j1.setPos(5);
		assertEquals(5, j1.getPos());
		assertEquals(1500, j1.getCredit());
		
	}
	//@Test
	/*public void test2() {
		Joueur j1=new Joueur("paul");
		Terrain rue1=new Terrain("boulevart", 2, 200, 20, null);
		j1.acheter(rue1);
		assertEquals(rue1.getProprietaire(),j1);
		assertEquals(j1.getCredit(), 20000);
				
	}*/
	@Test
	public void test3(){
		Joueur j=new Joueur("barry");
		j.paye(20);
		assertEquals(1480, j.getCredit());
		j.recoit(20);
		assertEquals(1500, j.getCredit());
		j.seDeplace(4, 6);
		assertEquals(10, j.getPos());
		
		
	}
	
	@Test
	public void test_arrivee_prison(){
		Joueur test = new Joueur("toto");
		test.setPos(29);
		test.seDeplace(0, 1);
		assertEquals(10, test.getPos());
	}

}
