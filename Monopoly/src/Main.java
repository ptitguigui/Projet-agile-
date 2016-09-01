import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import gameplay.Dés;
import gameplay.Jouer;
import gameplay.Joueur;

public class Main {
	public static void main(String[] args) {
		ArrayList<Joueur> joueurs = new ArrayList<>();
		Dés D = new Dés();
		Jouer TpT = null;
		System.out.println("Bienvenue dans Monopoly !\nCombien de joueur y a-t-il ?");
		Scanner in = new Scanner(System.in);
		int nbJR = in.nextInt();
		String name;
		for(int i = 0; i<nbJR; i++){
			name = JOptionPane.showInputDialog(null, "Entrez votre pseudo");
			joueurs.add(new Joueur(name));
		}
		for(Joueur j : joueurs){
			TpT = new Jouer(j);
			System.out.println("Le joueur "+j.getNom()+" possède "+j.getCredit()+"€ en banque.");
		}
		while(true){
			System.out.println("C'est à "+TpT.getJoueurActuel()+" de jouer.");
			D.roll();
			TpT.getJoueur().seDeplace(D.getD1(), D.getD2());
			System.out.println(TpT.getJoueurActuel()+" se déplace de "+(D.getD1()+D.getD2())+" cases et arrive sur la case " +TpT.getJoueur().getPos());
			TpT.passerTour();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
