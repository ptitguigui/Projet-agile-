
public class Joueur{
    String nom;
    int credit;
    int pos;

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

    public void acheter(CaseTerrain ct){
        if ( ct.aVendre() && credit>=ct.getPrix() ){
            credit-=ct.getPrix();
            ct.setProprietaire(this);
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
    
    public void seDeplace(int D1, int D2){
    	this.setPos(D1+D2);
    }
}