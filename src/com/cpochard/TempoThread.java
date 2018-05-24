package com.cpochard;

import java.util.Scanner;

public class TempoThread extends Thread {
	// Definition du constructeur..
	public TempoThread() {
		// ..Qui prend tous les attributs de Thread
		super("TempoThread");
	}

	public void run() {
		// Tant que le canStop de la Console a la valeur contraire de false
		// Peut aussi s'écrire while (Console.canStop == false) car false == false donc
		// égal à true
		// ou while (!Console.canStop == true) car contraire de false == true
		while (!Console.canStop) {
			//Attendre le temps nécessaire avant le prochain beep (60000/valeur de bpm contenue dans Console)
			int sleepTime_ms = 60000 / Console.bpm;
			try {
				Thread.sleep(sleepTime_ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Emettre le beep
			java.awt.Toolkit.getDefaultToolkit().beep();
		}
	}
}
