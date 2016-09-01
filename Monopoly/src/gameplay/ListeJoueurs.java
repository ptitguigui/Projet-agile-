package gameplay;

import java.util.ArrayList;

public class ListeJoueurs {
	
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	private int JoueurActuel; 
	
	public ListeJoueurs() {
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
	
	public void ajouterJoueur(Joueur j) {
		listeJoueurs.add(j);
	}
}
