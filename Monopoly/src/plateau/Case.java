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
	
	public int getNum(){
		return numero;
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

	
	//Actions en fonction du numéro de la case ou du type de case
	//public void actions(Joueur j) {
		//if (this.numero == 0) {
			//j.recoit(1);
		//}
	//}
	

}
