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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Case [nom=" + nom + ", numero=" + numero + "]";
	}
<<<<<<< HEAD
	
	//Actions en fonction du numéro de la case ou du type de case
	//public void actions(Joueur j) {
		//if (this.numero == 0) {
			//j.recoit(1);
		//}
	//}
	
=======

>>>>>>> 9734e9bc3f94171101749755f515f1493a1b54b5
}
