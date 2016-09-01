package plateau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Paquet {

	String nom;
	List<Carte> paquet;
	
	int carteCourante;

	public Paquet(String nom) {
		this.nom = nom;
		paquet = new ArrayList<>();
		carteCourante = 0;
	}


	public void add(Carte c) {
		paquet.add(c);
	}
	

	public Carte piocher() {
		Carte courante = this.get(0);
		paquet.remove(0);
		paquet.add(courante);
		return courante;
	}


	public void setCarteCourante(int carteCourante) {
		this.carteCourante = carteCourante;
	}


	public Carte get(int i) {

		return paquet.get(i);
	}

	public void trier() {

		Collections.shuffle(paquet);
	}

	public void affiche(){
		for (Carte c : paquet) {
			System.out.println(c);
		}
	}
	public int size() {
			return paquet.size();
	}

}
