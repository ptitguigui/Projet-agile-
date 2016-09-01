package plateau;
import gameplay.Joueur;

public class Terrain extends Case{
		protected int prix;
	    protected int loyer;
	    protected Joueur proprio;
	    
	    public Terrain(String nom,int num,int p, int l, Joueur j){
	        super(nom,num);
	        prix=p;
	        loyer=l;
	        proprio=j;
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

		
<<<<<<< HEAD
=======
	    
	  
>>>>>>> 5560dca7c52bb735c6cbf033e5b601b08a73b18d
}
