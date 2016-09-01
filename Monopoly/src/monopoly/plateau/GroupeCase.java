package monopoly.plateau;
import java.util.ArrayList;

import monopoly.gameplay.Joueur;

public class GroupeCase {
	private ArrayList<Case> lesCases;
	private String nom;
	
	public GroupeCase(String nom){
		this.nom=nom;
		lesCases = new ArrayList<>();
	}
	public int nbTerrainJoueur(Joueur j){
		int cpt=0;
		for(int i=0; i<lesCases.size(); i++){
			if(((Terrain)(lesCases.get(i))).getProprietaire()==j){
				cpt++;
			}		
		}
		return cpt;
		
	}
	public boolean seulproprio(Joueur j){
		
		return (nbTerrainJoueur(j)==lesCases.size());
	}
	public void ajouterCase(Terrain t){
		lesCases.add(t);
	}
	public String getNom(){
		return this.nom;
	}

}
