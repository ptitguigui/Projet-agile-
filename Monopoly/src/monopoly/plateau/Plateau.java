package monopoly.plateau;

import java.util.ArrayList;

import monopoly.gameplay.Joueur;

public class Plateau {
	
	ArrayList<Case> plateau=null;
	
	public Plateau() {	
		this.plateau = new ArrayList<>();
		this.plateau.add(new Terrain("Case départ", 0, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard de Belleville", 1, 200, 0, 0, 0, 100, 200, 300, 400, new Joueur("S")));
		this.plateau.add(new Terrain("Caisse Comunauté", 2, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Rue Lecourbe", 3, 60, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Impôt sur le revenu", 4, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Gare("Gare Montparnasse", 5, 200, 0, null, null));
		this.plateau.add(new Terrain("Rue Vaugirard", 6, 100, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Chance", 7, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Rue de Courcelles", 8, 100, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue de la République", 9, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Prison / Simple visite",  10, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard de la Villette",  11, 140, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Compagnie d'Electricite",  12, 150, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue de Neuilly",  13, 140, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Rue du Paradis",  14, 160, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Gare("Gare de Lyon",  15, 200, 0,null,null));
		this.plateau.add(new Terrain("Avenue Mozart",  16, 180, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Caisse de Communaute",  17, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard Saint Michel",  18, 180, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Place Pigalle",  19, 200, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Parc Gratuit",  20, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue Matignon",  21, 220, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Chance",22, 220, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard Malesherbes",23, 220, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue Henri Martin",  24, 240, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Gare("Gare du Nord",25, 200, 0,null,null));
		this.plateau.add(new Terrain("Faubourg Saint Honore",26, 260, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Place de la Bourse",27, 260, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Compagnie des Eaux",28, 150, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Rue la Fayette",29, 280, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Allez en prison",30, 0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue de Breteuil",31, 300, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue Foch",32, 300, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Caisse de Communaute",33,0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Boulevard des Capucines",34,320, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Gare("Gare Saint Lazare",35, 200, 0,null,null));
		this.plateau.add(new Terrain("Chance",36,0, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Avenue des Champs-Elysees",37,350, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Taxe de Luxe",38, 100, 0, 0, 0, 0, 0, 0, 0, null));
		this.plateau.add(new Terrain("Rue de la Paix",39,400, 0, 0, 0, 0, 0, 0, 0, null));
		
	}
	public void parcourirPlateau(){
		
		for (int i = 0; i <plateau.size(); i++) {
			System.out.println(plateau.get(i).toString());
		}
	}
	
	public Case getCase(int i) {
		return plateau.get(i);
	}
	
	public void afficherPlateau(Joueur courant) {
		
		int posJoueur = courant.getPos();
		System.out.println("pos Joueur est"+posJoueur);
		System.out.println(posJoueur+12);
		System.out.println(posJoueur-6);
		
		 
		
		for (int i=posJoueur-6; i<posJoueur+12; i++) {
			if(plateau.get(i).numero == posJoueur) {
				System.out.print("-X-");
			}
			if (plateau.get(i) instanceof Gare) {
				System.out.print("-G-");
			}
			else if (plateau.get(i) instanceof Terrain) {
				System.out.print("-T-");
			}
			else if (plateau.get(i) instanceof Compagnie) {
				System.out.println("-C-");
			}
			
		}
		System.out.println();
		
		for (int i=posJoueur-6; i<posJoueur+12; i++) {
			if (plateau.get(i) instanceof Gare) {
				
				Gare tmp = (Gare) plateau.get(i);
				if (tmp.proprio == courant) {
					System.out.print("v");
				} else if (plateau.contains(tmp.proprio)) {
					System.out.print("x");
				}
				
			}
			else if (plateau.get(i) instanceof Terrain) {
				
				Terrain tmp = (Terrain) plateau.get(i);
				if (tmp.proprio == courant) {
					System.out.print("v");
				} else if (plateau.contains(tmp.proprio)) {
					System.out.print("x");
				}
				
			}
			else if (plateau.get(i) instanceof Compagnie) {
				Compagnie tmp = (Compagnie) plateau.get(i);
				if (tmp.proprio == courant) {
					System.out.print("v");
				} else if (plateau.contains(tmp.proprio)) {
					System.out.print("x");
				}
			}
			
		}
		
	}
	
	public void declancheAction(Joueur j){
		if(j.getPos()!=0){
			this.getCase(j.getPos()).action(j);
		}
	}
	public ArrayList<Case> getPlateau() {
		return plateau;
	}
	
	public void parcourirTerrain() {
		for (int i = 0; i < plateau.size(); i++) {
			if (plateau.get(i) instanceof Terrain) {
				System.out.println(i+" "+plateau.get(i).toString());
			}
		}
	}

}
