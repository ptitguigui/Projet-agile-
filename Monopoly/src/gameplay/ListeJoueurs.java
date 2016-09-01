package gameplay;

import java.util.ArrayList;

public class ListeJoueurs {
	
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	private int JoueurActuel; 
	
	public ListeJoueurs (Joueur j) {
		listeJoueurs.add(j);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3, Joueur j4) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6, Joueur j7) {
		listeJoueurs.add(j);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
		listeJoueurs.add(j7);
	}
	
	public ListeJoueurs (Joueur j, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6, Joueur j7, Joueur j8) {
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
	
	public Joueur getJoueur() {
		return listeJoueurs.get(JoueurActuel);
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
