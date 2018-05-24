package com.cpochard;

public class Console {

	// L'attribut bpm (battement par minute) de la classe Console permet uniquement de configurer le rythme du
	// métronome. On lui met la valeur de 0 mais on pourrait lui mettre n'importe laquelle
	// Il va juste servir à etre appelé dans le thread pour être modifié par l'utilisateur
	static int bpm=60;
	
	static boolean canStop = false;

}
