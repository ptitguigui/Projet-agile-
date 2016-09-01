import java.util.Scanner;

import javax.swing.JOptionPane;

import gameplay.Joueur;
import gameplay.ListeJoueurs;

public class Main {
	public static void main(String[] args) {
		ListeJoueurs listeJoueurs = new ListeJoueurs();
		System.out.println("Bienvenue dans Monopoly !\nCombien de joueur y a-t-il ?");
		Scanner in = new Scanner(System.in);
		int nbJR = in.nextInt();
		String name;
		
		for(int i = 0; i<nbJR; i++){
			name = JOptionPane.showInputDialog(null, "Entrez votre pseudo");
			listeJoueurs.ajouterJoueur(new Joueur(name));
		}
		while(true){
			System.out.println("C'est à "+ listeJoueurs.getJoueurActuel() + " de jouer" );
			System.out.println("Que voulez-vous faire?");
			System.out.println("4. Passez votre tour");
			Scanner in2= new Scanner(System.in);
			int choix = in2.nextInt();
			if (choix==4) {
				listeJoueurs.passerTour(); 
			} else {
				System.out.println("Vous ne pouvez pas faire ça");
			}
		}
	}
}
