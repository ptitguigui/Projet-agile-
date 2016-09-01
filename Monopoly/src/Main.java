import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import gameplay.Joueur;

public class Main {
	public static void main(String[] args) {
		ArrayList<Joueur> joueurs = new ArrayList<>();
		System.out.println("Bienvenue dans Monopoly !\nCombien de joueur y a-t-il ?");
		Scanner in = new Scanner(System.in);
		int nbJR = in.nextInt();
		String name;
		for(int i = 0; i<nbJR; i++){
			name = JOptionPane.showInputDialog(null, "Entrez votre pseudo");
			joueurs.add(new Joueur(name));
		}
		while(true){
			
		}
	}
}
