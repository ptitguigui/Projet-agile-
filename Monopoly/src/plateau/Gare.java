package plateau;


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
				int tmpLoyer = calculerLoyer(j);
				j.paye(tmpLoyer); 				
				this.getProprietaire().recoit(tmpLoyer);
			}
		}

	}
	
	public int calculerLoyer(Joueur j){
		return (int) (this.loyer*(Math.pow(2, g.nbTerrainJoueur(j)))/2);
	}
		

}
