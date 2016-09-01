package plateau;

import gameplay.Joueur;

public class CaseDépart extends Case {

	public CaseDépart() {
		super("Départ", 0);
		
	}

//Méthode à appeller dans Evenement
public void EvenementCaseDepart(Joueur j) {

	j.recoit(10);
	
	}
}
