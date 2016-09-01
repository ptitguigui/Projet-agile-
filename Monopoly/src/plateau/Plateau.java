package plateau;

import java.util.ArrayList;

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

}
