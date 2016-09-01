package plateau;
import gameplay.Joueur;

public class Terrain extends Case{
		protected int prix;
	    protected int loyer;
	    protected Joueur proprio;
	    private int nbMaisons =0;
	    private int prixMaison; 
	    
	    //Terrain Non-constructible (gare et compagnies)
	    public Terrain(String nom,int num,int p, int l, Joueur j){
	        super(nom,num);
	        prix=p;
	        loyer=l;
	        proprio=j;
	    }
	    
	    //Terrain Constructible (obsolète)
	    public Terrain(String nom,int num,int p, int l, int pm, Joueur j){
	        super(nom,num);
	        prix=p;
	        loyer=l;
	        proprio=j;
	        prixMaison=pm;
	    }
	    
	    //Terrain Constructible
	    public Terrain(String nom,int num,int p, int l, int l1, int l2, int l3, int l4, int lh, int pm, Joueur j){
	        super(nom,num);
	        prix=p;
	        loyer=l;
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
	        return (loyer);
	    }

		public int getNbMaisons(){
			return nbMaisons;
		}
	    
		public void ajoutMaison(int nbMaisons){
			proprio.paye(prixMaison*nbMaisons);
			this.nbMaisons += nbMaisons;
		}
}
