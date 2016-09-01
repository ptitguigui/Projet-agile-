
package monopoly.plateau;
import java.util.Scanner;

import monopoly.gameplay.Joueur;


public class Compagnie extends Terrain{
	GroupeCase g;
	public Compagnie(String nom, int num, int p, int l, Joueur j,GroupeCase g) {
		super(nom, num, p, l, j);	
		this.g=g;
		
	}
	public void action(Joueur j) {
		if(this.aVendre()){

			boolean done = false;
			while(!done){
				System.out.println("Voulez-vous acheter cette compagnie pour le prix de "+this.getPrix()+ "?\n 1.Oui\t2.Non");
				Scanner in = new Scanner(System.in);
				int choix = in.nextInt();
				if(choix == 1){
					j.acheter(this);
					done = true;
				}else if(choix == 2){
					done = true;
				}else{
					System.out.println("Vous ne pouvez pas faire cela.");
				}
			}
		}else{
			if(j != this.getProprietaire()){
				int tmpLoyer = calculerLoyer(j,(int)(Math.random()*7),(int)(Math.random()*7));
				j.paye(tmpLoyer); 				
				this.getProprietaire().recoit(tmpLoyer);
			}
		}

	}
	
	public int calculerLoyer(Joueur j, int d1,int d2){
	int loyer=0;
		if(g.nbTerrainJoueur(j)==2){
		loyer=(d1+d2)*10;
	}else{
			loyer=(d1+d2)*4;
		}
		return loyer;
	}	
	
}
	