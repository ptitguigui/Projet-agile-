package monopoly.gameplay;
import java.util.ArrayList;

import monopoly.plateau.Case;
import monopoly.plateau.Terrain;
import monopoly.plateau.Gare;

public class Joueur{
    String nom;
    int credit;
    int pos;
    ArrayList<Case> achats;

    public Joueur(String nom){
        this.nom=nom;
        credit=20000;
        pos=0;
    }

    public String getNom(){
        return(nom);
    }

    public int getPos(){
        return(pos);
    }

    public void setPos(int pos){
        this.pos=pos;
    }

    public int getCredit(){
        return (credit);
    }

    public void acheter(Terrain ct){
        if ( ct.aVendre() && credit>=ct.getPrix() ){
            credit-=ct.getPrix();
            ct.setProprietaire(this);
            achats.add(ct);
        }
    }
    
    public void acheter(Gare gare) {
		if ( gare.aVendre() && credit>=gare.getPrix() ){
            credit-=gare.getPrix();
            gare.setProprietaire(this);
            achats.add(gare);
        }
	}

    public boolean equals(Joueur j){
        return (nom.equals(j.nom) && credit==j.credit);
    }

    public void paye(int loyer){
        credit-=loyer;
    }

    public void recoit(int loyer){
        credit+=loyer;
    }
    public void caseDepart() {
    	credit += 10;
    }
    public void seDeplace(int D1, int D2){
    	//Condition sur la prison à ajouter.
    	if(this.getPos()+D1+D2 <=39){
    		this.setPos(this.getPos()+D1+D2);    		
    	}else{
    		int nb = this.getPos()+D1+D2;
    		this.setPos(nb-40);
      	}
    	
    }

    
}