package monopoly.plateau;
import java.util.ArrayList;

import monopoly.gameplay.Joueur;


public class Terrain extends Case{
		protected int prix;
		private ArrayList<Integer> loyers = new ArrayList<Integer>();
	    protected Joueur proprio;
	    private int nbMaisons =0;
	    private int prixMaison; 
	   
	    //Terrain Constructible
	    public Terrain(String nom,int num,int p, int l, int l1, int l2, int l3, int l4, int lh, int pm, Joueur j){
	        super(nom,num);
	        prix=p;
	        loyers.add(l);
	        loyers.add(l1);
	        loyers.add(l2);
	        loyers.add(l3);
	        loyers.add(l4);
	        loyers.add(lh);
	        proprio=j;
	        prixMaison=pm;
	    }

	    public int getPrix(){
	        return (prix);
	    }

	    public Joueur getProprietaire(){
	        return (proprio);
	    }

	    public void setProprietaire(Joueur j){
	        proprio=j;
	    }

	    public boolean aVendre(){
	        return (proprio==null);
	    }

	    public boolean aLouer(){
	        return(proprio!=null);
	    }

	    public int calculerLoyer(){
	    	return loyers.get(nbMaisons); 
	    }


		public int getNbMaisons(){
			return nbMaisons;
		}
	    
		public void ajoutMaison(int nbMaisons){
			proprio.paye(prixMaison*nbMaisons);
			this.nbMaisons += nbMaisons;
		}

		@Override
		public void action(Joueur j) {
			// TODO Auto-generated method stub
			
		}

}
