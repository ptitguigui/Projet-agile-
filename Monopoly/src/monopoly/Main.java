package monopoly;

import java.util.Scanner;

import javax.swing.JOptionPane;

import monopoly.gameplay.Des;
import monopoly.gameplay.Joueur;
import monopoly.gameplay.ListeJoueurs;
import monopoly.plateau.Carte;
import monopoly.plateau.Paquet;
import monopoly.plateau.Plateau;
import monopoly.plateau.Terrain;

public class Main {

	public static void main(String[] args) {

		Plateau jeu = new Plateau();

		// Initialisation Paquets

		/**
		 * Carte[] ch = { new Carte("Amende pour exces de vitesse payez 1000"
		 * ,1000), new Carte("La banque vous verse 5000",5000), //new Carte(
		 * "Impose pour les reparations de voirie, payez 4000/maison et 11500/hotel"
		 * ,(4000*nbMaisonJoueur)+(11500*nbHotelJoueur)), new Carte(
		 * "Avancez jusqu'a la case depart",20000), new Carte(
		 * "Avancez jusqu'a Rue de la Paix",0), new Carte(
		 * "Carte sortie de Prison",0), new Carte(
		 * "Avancez jusqu'a l'avenue Henri Martin",0), //new Carte(
		 * "Faites des reparations dans vos habitations, payez 2500/maison et 10000/hotel"
		 * ,(-2500*nbMaison)+(10000*nbHotel)), new Carte(
		 * "Avancez au Boulevard de la Villette",0), new Carte(
		 * "Allez a la Gare de Lyon",0), new Carte(
		 * "Votre immeuble et votre pret rapporte, recevez 15000",15000), new
		 * Carte("Allez en prison, ne passez pas par la case Depart",0), new
		 * Carte("Reculez de 3 cases",0), new Carte(
		 * "Amende pour ivresse, payez 2000",-2000), new Carte(
		 * "Vous avez gagne le prix de mots croises, recevez 10000",10000)};
		 * 
		 * 
		 * Carte[] com = {new Carte(
		 * "Vous n'avez pas regler la police d'assurance, payez 5000",-5000)
		 * ,new Carte("Vous heritez de 10000",10000), new Carte(
		 * "Vous etes libere de prison",0), new Carte(
		 * "Frais medicaux, payez 5000",-5000), new Carte(
		 * "Vous gagnez le second prix de beaute, recevez 1000",1000), new
		 * Carte("Les contributions vous remboursent, recevez 2000",2000), new
		 * Carte("Retournez a Belleville",0), new Carte("Allez en prison",0),
		 * new Carte("Avancez jusqu'a la case Depart",0), //new Carte(
		 * "C'est votre anniversaire ! Vous recevez 2000/joueurs"
		 * ,2000*nbJoueurs), new Carte("Recevez 10000",10000), new Carte(
		 * "Payez 1000 ou tirez une carte Chance",0), new Carte(
		 * "Erreur de la Banque en votre faveur, recevez 20000 ",20000), new
		 * Carte("Vous vendez votre stock, recevez 5000",5000), new Carte(
		 * "Frais d'hopitaux, payez 10000",-10000)};
		 * 
		 * Paquet chance = new Paquet("Chance"); Paquet communaute = new
		 * Paquet("Communauté");
		 * 
		 * for (int i = 0; i < ch.length; i++) { chance.add(ch[i]);
		 * communaute.add(com[i]); }
		 **/

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
			listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2());
			System.out.println(listeJoueurs.getJoueur().getNom() + " se déplace de " + (D.getD1() + D.getD2())
					+ " cases et arrive sur la case " + listeJoueurs.getJoueur().getPos());
			jeu.declancheAction(listeJoueurs.getJoueur());

			if (D.estDouble() && !D.tripleDouble()) {
				D.roll();
				listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2());
				System.out.println("C'est un Double !" + j.getNom() + " se déplace de " + (D.getD1() + D.getD2())
						+ " cases et arrive sur la case " + j.getPos());
				jeu.declancheAction(listeJoueurs.getJoueur());

			} else if (D.estDouble()) {
				D.roll();
				System.out.println("Trois doubles d'affilée ! Vous finissez en prison !");
			}

			// Case Départ
			if (pos1Joueur > j.getPos()) {// !listeJoueurs.getJoueur().enPrison()
				System.out.println("Vous êtes passé par la case départ !");
				j.caseDepart();
			}

			int choix = 0;
			System.out.println("afficher plateau normalement");
			jeu.afficherPlateau(j);
			while (choix != 4) {

				// Choix des actions
				System.out.println("Que voulez-vous faire?");
				System.out.println("1.Piocher une carte");
				System.out.println("2. Construire une maison");
				System.out.println("3. Hypothéquer");
				System.out.println("4. Echanger");
				System.out.println("5. Passez votre tour");
				Scanner in2 = new Scanner(System.in);
				choix = in2.nextInt();

				// Réalisation des actions

				if (choix == 2) { // Construction Maison
					System.out.println("Voici la liste des Terrains que vous possédez");
					jeu.afficherTerrainPossedes(j);
					System.out.println("Indiquez le numéro de la case sur lequel vous voulez construire");
					Scanner in3 = new Scanner(System.in);
					int choix2 = in3.nextInt();
					Terrain t = (Terrain) jeu.getCase(choix2);
					t.ajoutMaison(1);
					System.out.println("Le nouveau loyer est de :" + t.calculerLoyer());

				} else if (choix == 1) {

					// System.out.println(j.getNom() + "a pioché
					// :"+chance.piocher());
					// System.out.println(j.getNom()+"a
					// pioché"+communaute.piocher());

				} else {
				
				System.out.println("Vous ne pouvez pas faire ça");
				}
			}

			listeJoueurs.passerTour();

		}
	}

}