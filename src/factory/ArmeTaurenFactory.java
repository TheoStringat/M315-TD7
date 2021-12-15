package factory;

import java.util.ArrayList;

import jeu.Arme;
import jeu.Bouclier;
import jeu.Epee;
import jeu.Tauren;

public class ArmeTaurenFactory {
private ArrayList<Arme> listeArmeTauren;
	
	public ArmeTaurenFactory() {
		listeArmeTauren = new ArrayList<>();
	}
	
	public Arme createArmeTauren(String nom, String type, Tauren tauren) {
		Arme arme = null;
		if(type.equalsIgnoreCase("bouclier")) {
			arme = new Bouclier(nom);
		}
		else if(type.equalsIgnoreCase("epee")) {
			arme = new Epee(nom);
		}
		listeArmeTauren.add(arme);
		return arme;
	}
	
	public ArrayList<Arme> getListeArmeTauren() {
		return this.listeArmeTauren;
	}
}
