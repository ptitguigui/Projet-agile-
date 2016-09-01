package plateau;

import gameplay.Joueur;

public class Gare extends Terrain {

	public Gare(String nom,int num,int p, int l, Joueur j) {
		super(nom,num,p,l,j);
	}

	public void action(Joueur j) {
		if(this.aVendre()){
			//menu action
		}else{
			if(j != this.getProprietaire()){
				int tmpLoyer = this.loyer; //implémenter calcul de plusieurs gares
				j.paye(tmpLoyer); 				
				this.getProprietaire().recoit(tmpLoyer);
			}
		}
	}
	
	
	/*public int nombreGare(Joueur j){
		int cpt;
		Joueur index = this.getProprietaire();
		
		for(int i=5; i<36; i+=10){
			if()
		}
	}*/
	
	
	
	

}
