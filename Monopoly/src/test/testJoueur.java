package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import monopoly.gameplay.Joueur;
import monopoly.plateau.Plateau;
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
		assertEquals(j1.getPos(), 5);
		assertEquals(j1.getCredit(), 20000);
		
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
		assertEquals(j.getCredit(), 20000-20);
		j.recoit(20);
		assertEquals(j.getCredit(), 20000);
		j.seDeplace(4, 6);
		assertEquals(j.getPos(), 10);
		
		
	}
	
	@Test
	public void estPossedee() {
		Joueur j = new Joueur("S");
		Terrain rue2=new Terrain("rerer", 100, 5, 100, 200, 300, 400, 500, 600, 100, j);
		assertEquals(true, rue2.estPossedee(j));
	}
	
	@Test
	public void listeTerrainsPossedes() {
		Plateau p = new Plateau(false);
		Joueur j = new Joueur("S");
		Terrain rue=new Terrain("rer", 100, 5, 100, 200, 300, 400, 500, 600, 100, j);
		Terrain rue2=new Terrain("rerer", 100, 5, 100, 200, 300, 400, 500, 600, 100, null);
		ArrayList<Terrain> terrain = new ArrayList<Terrain>();
		terrain.add(rue);
		assertEquals(terrain, p.terrainsPossedes(j));
	}
}
