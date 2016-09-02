package monopoly.plateau;

import monopoly.gameplay.Joueur;

public class Carte {
	
	String effet;
	int valeur;

	public Carte(String effet,int val) {
		this.effet = effet;
		this.valeur = val;
		
	}
	
	public String getEffet() {
		return effet;
	}
	
	public String toString() {
		return effet;
	}
	

}
