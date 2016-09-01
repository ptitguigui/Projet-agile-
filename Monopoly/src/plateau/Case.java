package plateau;
import gameplay.Joueur;

public class Case {
	 protected String nom;
     protected int numero;

     public Case(String nom, int num) {
		this.nom=nom;
		this.numero=num;
	}

	public String getNom(){
        return nom;
     }

	public String toString() {
		return "Case [nom=" + nom + ", numero=" + numero + "]";
	}

}
