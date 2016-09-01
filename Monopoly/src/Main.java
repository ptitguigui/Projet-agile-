import java.util.Scanner;

import javax.swing.JOptionPane;

import gameplay.Dés;
import gameplay.Joueur;
import gameplay.ListeJoueurs;
import plateau.Plateau;

public class Main {
	public static void main(String[] args) {
		
		Plateau jeu = new Plateau();
		ListeJoueurs listeJoueurs = new ListeJoueurs();
		Dés D = new Dés();
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
			System.out.println("C'est à "+ listeJoueurs.getJoueurActuel() + " de jouer" );
			D.roll();
			listeJoueurs.getJoueur().seDeplace(D.getD1(), D.getD2());
			jeu.declancheAction(listeJoueurs.getJoueur());
			System.out.println(listeJoueurs.getJoueurActuel()+" se déplace de "+(D.getD1()+D.getD2())+" cases et arrive sur la case " +listeJoueurs.getJoueur().getPos());
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
