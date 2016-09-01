package plateau;

import java.util.ArrayList;

import gameplay.Joueur;

public class Plateau {
	
	ArrayList<Case> plateau;
	
	public Plateau() {
		
		this.plateau = new ArrayList<>(40);
		for (int i = 0; i <plateau.size(); i++){
			plateau.add(new Case(Integer.toString(i),i));
			}
		}
	public void parcourirPlateau(){
		for (int i = 0; i <plateau.size(); i++) {
			System.out.println(plateau.get(i).toString());
		}
	}
	public Case getCase(int i) {
		return plateau.get(i);
	}
	
	public void declancheAction(Joueur j){
		this.getCase(j.getPos()).action(j);
	}

}
