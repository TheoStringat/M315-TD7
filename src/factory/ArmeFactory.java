package factory;

import java.util.ArrayList;

import jeu.Arme;
import jeu.Bouclier;
import jeu.Dague;
import jeu.Epee;

public class ArmeFactory {
	private ArrayList<Arme> listeArme;
	
	public ArmeFactory() {
		listeArme = new ArrayList<>();
	}

	public Arme createArme(String nom, String type) {
		Arme arme = null;
		if(type.equalsIgnoreCase("bouclier")) {
			arme = new Bouclier(nom);
		}
		else if(type.equalsIgnoreCase("dague")) {
			arme = new Dague(nom);
		}
		else if(type.equalsIgnoreCase("epee")) {
			arme = new Epee(nom);
		}
		listeArme.add(arme);
		return arme;
	}
	
	public Arme getArme(String nomArme) {
		for(Arme a : this.listeArme) {
			if(a.getNom().equals(nomArme)) {
				return a;
			}
		}
		return null;
	}
}