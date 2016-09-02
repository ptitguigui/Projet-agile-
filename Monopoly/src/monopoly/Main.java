package monopoly;

import java.util.Scanner;

import javax.swing.JOptionPane;

import monopoly.gameplay.Des;
import monopoly.gameplay.Joueur;
import monopoly.gameplay.ListeJoueurs;
import monopoly.plateau.Paquet;
import monopoly.plateau.Plateau;
import monopoly.plateau.Terrain;

public class Main {

	public static void main(String[] args) {

		Plateau jeu = new Plateau();

		
		//initialisation des paquets
		
			
		

		ListeJoueurs listeJoueurs = new ListeJoueurs();
		Des D = new Des();
		System.out.println("Bienvenue dans Monopoly !\nCombien de joueur y a-t-il ?");
		Scanner in = new Scanner(System.in);
		int nbJR = in.nextInt();
		String name;

		for (int i = 0; i < nbJR; i++) {
			name = JOptionPane.showInputDialog(null, "Entrez votre pseudo");
			listeJoueurs.ajouterJoueur(new Joueur(name));
		}
		for (Joueur j : listeJoueurs.getListe()) {
			System.out.println("Le joueur " + j.getNom() + " possède " + j.getCredit() + "€ en banque.");
		}
		while (true) {
			// Début de Tour
			Joueur j = listeJoueurs.getJoueur();
			System.out.println("C'est à " + j.getNom() + " de jouer");
			System.out.println("Vous avez " + j.getCredit());

			// Déplacement
			int pos1Joueur = j.getPos();
			D.roll();
		


			if (D.estDouble()) {
				listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2(),D);
				jeu.declancheAction(listeJoueurs.getJoueur());
				System.out.println("C'est un Double !" + j.getNom() + " se déplace de " + (D.getD1() + D.getD2())
						+ " cases et arrive sur la case " + j.getPos());

			} else {
				listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2(),D);
			jeu.declancheAction(listeJoueurs.getJoueur());
			System.out.println(listeJoueurs.getJoueur().getNom() + " se déplace de " + (D.getD1() + D.getD2())
					+ " cases et arrive sur la case " + listeJoueurs.getJoueur().getPos());
			}

			// Case Départ
			if (pos1Joueur <= j.getPos()) {// !listeJoueurs.getJoueur().enPrison()
				System.out.println("Vous êtes passé par la case départ !");
				j.caseDepart();
			}

			int choix = 0;
			jeu.afficherPlateau(j);
			while (choix != 3) {	
			
			//Choix des actions
			System.out.println("Que voulez-vous faire?");
			System.out.println("1.Piocher une carte");
			System.out.println("2. Construire une maison");
			System.out.println("3. Passez votre tour");
			Scanner in2= new Scanner(System.in);
		 choix = in2.nextInt();
			
			//Réalisation des actions
			if (choix==2) {
				System.out.println("Voici la liste des Terrains que vous possédez");
				jeu.afficherTerrainPossedes(j);
				System.out.println("Indiquez le numéro de la case sur lequel vous voulez construire");
				Scanner in3 = new Scanner(System.in);
				int choix2 = in3.nextInt();
				Terrain t = (Terrain) jeu.getCase(choix2);
				t.ajoutMaison(1);
				System.out.println("Le nouveau loyer est de :" + t.calculerLoyer());
			} else if (choix == 1) {
				
				System.out.println(j.getNom() + "a pioché :"+chance.piocher());
				System.out.println(j.getNom()+"a pioché"+communaute.piocher());
				
			}else if(choix !=3){
				System.out.println("Vous ne pouvez pas faire ça");
			}
		

			listeJoueurs.passerTour();

		}
	}

	}
}