package jeu;

public class Orc extends Personnage {
    private int quotientFureur;

    public Orc(String nom, int quotientFureur, Arme arme) {
    	super(nom);
    	this.quotientFureur = quotientFureur;
    	this.setArmeActive(arme);
    }
    
    public Orc(String nom, int quotientFureur) {
    	super(nom);
    	this.quotientFureur = quotientFureur;
    	this.setArmeActive(new Epee());
    }

    public int getQuotient_fureur() {
        return this.quotientFureur;
    }

    public void setQuotient_fureur(int quotientFureur) {
        this.quotientFureur = quotientFureur;
    }
    
    
}
