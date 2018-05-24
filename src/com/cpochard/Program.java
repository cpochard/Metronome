package com.cpochard;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		//Lancer le tempo avec cette fonction
		launchTempo();
		
		// Tant que valeur false de canStop est différent (donc true)..
		while (!Console.canStop) {
			//Demander le choix de l'utilisateur avec clavier
			System.out.println("Entrez un nouveau tempo ou RETURN pour quitter :");
			String userChoice = keyBoard.nextLine();
			//Si le choix est RETURN
			if (userChoice.equals("RETURN")) {
				//La valeur canStop de la Console qui était false devient true
				//Donc quand on revient à la boucle while la condition n'est plus respectée
				//On sort de la boucle et donc on quitte l'appli
				Console.canStop = true;
				//Sinon la valeur du rythme est remplacée par le choix de l'utilisateur
			} else {
				Console.bpm = Integer.parseInt(userChoice);
			}
		}
		keyBoard.close();
		}

	private static void launchTempo() {
		//Initialiser et lancer le tempo
		TempoThread tempo = new TempoThread();
		tempo.start();
	}
	}

