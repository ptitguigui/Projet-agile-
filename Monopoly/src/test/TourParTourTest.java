package test;

import static org.junit.Assert.*;

import org.junit.Test;

import gameplay.ListeJoueurs;
import gameplay.Joueur;

public class TourParTourTest {
	
	@Test
	public void ajouterUnJoueur() {
		Joueur j = new Joueur("Samson");
		ListeJoueurs p = new ListeJoueurs();
		assertEquals("Samson", p.getJoueurActuel());
		
	}
	
	@Test
	public void jeuAPlusieurs() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs();
		assertEquals(2, p.getNbJoueurs());
	}
	
	@Test
	public void passerTour() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs();
		p.passerTour();
		assertEquals("Vianney", p.getJoueurActuel());
	}
	
	@Test 
	public void rotationJoueurs() {
		Joueur j = new Joueur("Samson");
		Joueur j2 = new Joueur("Vianney");
		ListeJoueurs p = new ListeJoueurs();
		p.passerTour();
		p.passerTour();
		assertEquals("Samson", p.getJoueurActuel());
	}
}
