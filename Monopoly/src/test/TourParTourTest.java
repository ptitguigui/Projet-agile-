package test;

import static org.junit.Assert.*;

import org.junit.Test;

import gameplay.ListeJoueurs;
import gameplay.Joueur;

public class TourParTourTest {
	
	@Test
	public void ajouterUnJoueur() {
		Joueur j = new Joueur("Samson");
		ListeJoueurs j2 = new ListeJoueurs(j);
		assertEquals("Samson", j2.getJoueurActuel());
		
	}
	
	@Test
	public void jeuAPlusieurs() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs(j, j2);
		assertEquals(2, p.getNbJoueurs());
	}
	
	@Test
	public void passerTour() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs(j, j2);
		p.passerTour();
		assertEquals("Vianney", p.getJoueurActuel());
		p.passerTour();
		assertEquals("Samson", p.getJoueurActuel());
	}
	
	@Test 
	public void rotationJoueurs() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs(j, j2);
		p.passerTour();
		p.passerTour();
		assertEquals("Samson", p.getJoueurActuel());
	}
}
