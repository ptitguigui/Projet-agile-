package gameplay;

import java.util.ArrayList;

public class Jouer {
	
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	private int JoueurActuel; 
	
	public Jouer (Joueur j) {
		listeJoueurs.add(j);
	}
	
	public Jouer (Joueur j, Joueur j2) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3, Joueur j4) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6, Joueur j7) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
		listeJoueurs.add(j7);
	}
	
	public Jouer (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6, Joueur j7, Joueur j8) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
		listeJoueurs.add(j7);
		listeJoueurs.add(j8);
	}
	
	
	public String getJoueurActuel() {
		return listeJoueurs.get(JoueurActuel).getNom();
	}
	
	public int getNbJoueurs() {
		return listeJoueurs.size();
	}

	public void passerTour() {
		this.JoueurActuel++;
		if (this.JoueurActuel>(listeJoueurs.size()-1)) {
			this.JoueurActuel=0;
		}
	}
}
