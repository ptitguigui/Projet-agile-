import java.util.Scanner;

import javax.swing.JOptionPane;

import gameplay.Des;
import gameplay.Joueur;
import gameplay.ListeJoueurs;
import plateau.Plateau;

public class Main {
	public static void main(String[] args) {
		
		//initialisation
		Plateau jeu = new Plateau();
		ListeJoueurs listeJoueurs = new ListeJoueurs();
		Des D = new Des();
		System.out.println("Bienvenue dans Monopoly !\nCombien de joueur y a-t-il ?");
		Scanner in = new Scanner(System.in);
		int nbJR = in.nextInt();
		String name;
		
		for(int i = 0; i<nbJR; i++){
			name = JOptionPane.showInputDialog(null, "Entrez votre pseudo");
			listeJoueurs.ajouterJoueur(new Joueur(name));
		}
		for(Joueur j : listeJoueurs.getListe()){
			System.out.println("Le joueur "+j.getNom()+" possède "+j.getCredit()+"€ en banque.");
		}
		while(true){
			//Début de Tour
			Joueur j = listeJoueurs.getJoueur();
			System.out.println("C'est à "+ j.getNom() + " de jouer" );
			System.out.println("Vous avez "+j.getCredit());
			
			// Déplacement
			int pos1Joueur = j.getPos();
			D.roll();
			listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2());
			jeu.declancheAction(listeJoueurs.getJoueur());
			System.out.println(listeJoueurs.getJoueur().getNom()+" se déplace de "+(D.getD1()+D.getD2())+" cases et arrive sur la case " +listeJoueurs.getJoueur().getPos());
			System.out.println(j.getNom()+" se déplace de "+(D.getD1()+D.getD2())+" cases et arrive sur la case " +j.getPos());
			
			if (D.estDouble() && !D.tripleDouble()) {
				D.roll();
				listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2());
				jeu.declancheAction(listeJoueurs.getJoueur());
				System.out.println("C'est un Double !"+j.getNom()+" se déplace de "+(D.getD1()+D.getD2())+" cases et arrive sur la case " +j.getPos());
				
			} else if (D.estDouble()) {
				D.roll();
				System.out.println("Trois doubles d'affilée ! Vous finissez en prison !");
			}
			
			//Case Départ
			if (pos1Joueur<=j.getPos()) {//!listeJoueurs.getJoueur().enPrison()
				System.out.println("Vous êtes passé par la case départ !");
				j.caseDepart();
			}
			
			
			//Choix des actions
			System.out.println("Que voulez-vous faire?");
			
			
			System.out.println("4. Passez votre tour");
			Scanner in2= new Scanner(System.in);
			int choix = in2.nextInt();
			
			//Réalisation des actions
			if (choix==4) {
				listeJoueurs.passerTour(); 
			} else {
				System.out.println("Vous ne pouvez pas faire ça");
			}
			
			
		}
	}
}
