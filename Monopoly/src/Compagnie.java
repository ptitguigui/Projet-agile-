import gameplay.Joueur;
import plateau.GroupeCase;
import plateau.Terrain;

public class Compagnie extends Terrain{
	GroupeCase g;
	public Compagnie(String nom, int num, int p, int l, Joueur j,GroupeCase g) {
		super(nom, num, p, l, j);	
		this.g=g;
		
	}
	public int calculloyer (int d1, int d2){
		int loyer=0;
		if(g.seulproprio(proprio)){
			loyer=(d1+d2)*10;			
		}else{
			loyer=(d1+d2)*4;
		}
		return loyer;
		
	}
	
}
	