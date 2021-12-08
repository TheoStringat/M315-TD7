package Jeu;



public class Orc extends Personnage {
    private int quotientFureur;

    public Orc(String nom, String valeur_acuite) {
    	super(nom);
    	this.quotientFureur = quotientFureur;
    }

    public int getQuotient_fureur() {
        return this.quotientFureur;
    }

    public void setQuotient_fureur(int quotientFureur) {
        this.quotientFureur = quotientFureur;
    }
    
    
}
