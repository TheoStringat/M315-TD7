package jeu;

import java.util.ArrayList;

public class Bataillon {
	private ArrayList<Personnage> personnagesBataillon;
	
	public Bataillon(ArrayList<Personnage> personnagesBataillon) {
		this.personnagesBataillon = personnagesBataillon;
	}
	
	public Bataillon() {
		this.personnagesBataillon = new ArrayList<>();
	}
}
