package plateau;

import java.util.ArrayList;

import gameplay.Joueur;

public class Plateau {
	
	ArrayList<Case> plateau=null;
	
	public Plateau() {	
		this.plateau = new ArrayList<>();
		this.plateau.add(new Terrain("Case départ", 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard de Belleville", 1, 200, 0, null));
		this.plateau.add(new Gare("Gare Montparnasse", 2, 300, 0, null, null));
		for(int i = 3; i<40;i++){
			this.plateau.add(new Terrain(Integer.toString(i), 1, 200, 0, null));
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
		if(j.getPos()!=0){
			this.getCase(j.getPos()).action(j);
		}
	}
	public ArrayList<Case> getPlateau() {
		return plateau;
	}

}
