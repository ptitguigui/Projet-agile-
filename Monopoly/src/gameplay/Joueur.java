package gameplay;
import java.util.ArrayList;

import plateau.Carte;
import plateau.Paquet;
import plateau.Terrain;

public class Joueur{
    String nom;
    int credit;
    int pos;
    ArrayList<Terrain> achats;

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
    public Carte Piocher(Paquet p) {
    	return p.piocher();
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