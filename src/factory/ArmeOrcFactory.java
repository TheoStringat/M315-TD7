package factory;

import java.util.ArrayList;

import jeu.Arme;
import jeu.Bouclier;
import jeu.Epee;
import jeu.Orc;

public class ArmeOrcFactory {
	private ArrayList<Arme> listeArmeOrc;
	
	public ArmeOrcFactory() {
		listeArmeOrc = new ArrayList<>();
	}
	
	public Arme createArmeOrc(String nom, String type, Orc orc) {
		Arme arme = null;
		if(type.equalsIgnoreCase("bouclier")) {
			arme = new Bouclier(nom);
			arme.setProtection(arme.getProtection() * orc.getQuotient_fureur());
		}
		else if(type.equalsIgnoreCase("epee")) {
			arme = new Epee(nom);
			arme.setForce(arme.getForce() * orc.getQuotient_fureur());
		}
		listeArmeOrc.add(arme);
		return arme;
	}
	
	public ArrayList<Arme> getListeArmeOrc() {
		return this.listeArmeOrc;
	}
}
