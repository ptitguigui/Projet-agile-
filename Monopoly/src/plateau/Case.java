package plateau;

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

}
