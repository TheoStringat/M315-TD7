package Jeu;

public class Main {
	public static void main(String[] args) {
		Tauren Diablon = new Tauren("Diablon", 15);
		Orc Azag = new Orc("Azag", "5");
		System.out.println("Points de vie de Diablon initialisation : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag initialisation : " + Azag.getVitalite());
		Diablon.attaquer(Azag);
		System.out.println("Points de vie de Diablon attaque de Diablon : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag attaque de Diablon : " + Azag.getVitalite());
		Azag.attaquer(Diablon);
		System.out.println("Points de vie de Diablon attaque d'Azag : " + Diablon.getVitalite());
		System.out.println("Points de vie d'Azag attaque d'Azag : " + Azag.getVitalite());
	}
}
