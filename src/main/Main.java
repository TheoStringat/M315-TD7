package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import factory.ArmeFactory;
import jeu.Arme;
import jeu.Epee;
import jeu.Orc;
import jeu.Personnage;
import jeu.Tauren;

public class Main {
	public static void main(String[] args) {
		// main partie 1.
		Tauren Diablon = new Tauren("Diablon", 15);
		Orc Azag = new Orc("Azag", 5);
		System.out.println("Points de vie de Diablon initialisation : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag initialisation : " + Azag.getVitalite());
		Diablon.attaquer(Azag);
		System.out.println("Points de vie de Diablon attaque de Diablon : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag attaque de Diablon : " + Azag.getVitalite());
		Azag.attaquer(Diablon);
		System.out.println("Points de vie de Diablon attaque d'Azag : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag attaque d'Azag : " + Azag.getVitalite());

		// main partie 2.1 ---> inclusion de factory
		ArmeFactory armeFactory = new ArmeFactory();
		Arme w = armeFactory.createArme("excalibur", "Epee");
		assertEquals(w, armeFactory.getArme("excalibur"));

		Personnage azag = new Orc("Azag", 5);
		assertTrue(azag.getArmeActive() instanceof Epee);
	}
}
