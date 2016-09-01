package plateau;

import java.util.Scanner;

import gameplay.Joueur;

public class Gare extends Terrain {

	GroupeCase g;	
	public Gare(String nom,int num,int p, int l, Joueur j,GroupeCase g) {
		super(nom,num,p,l,j);
		this.g = g;
	}

	public void action(Joueur j) {
		if(this.aVendre()){

			boolean done = false;
			while(!done){
				System.out.println("Voulez-vous acheter cette gare pour le prix de "+this.getPrix()+ "?\n 1.Oui\t2.Non");
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
