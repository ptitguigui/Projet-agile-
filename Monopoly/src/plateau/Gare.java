package plateau;

import gameplay.Joueur;

public class Gare extends Terrain {

	GroupeCase g;	
	public Gare(String nom,int num,int p, int l, Joueur j,GroupeCase g) {
		super(nom,num,p,l,j);
		this.g = g;
	}

	public void action(Joueur j) {
		if(this.aVendre()){
			//menu action
		}else{
			if(j != this.getProprietaire()){
				int tmpLoyer = this.loyer; //implémenter calcul de plusieurs gares
				tmpLoyer = (int) (tmpLoyer*(Math.pow(2, g.nbTerrainJoueur(j)))/2);
				j.paye(tmpLoyer); 				
				this.getProprietaire().recoit(tmpLoyer);
			}
		}
	}
		

}
