package jeu;

public class Elfe extends Personnage {
    private String valeurAcuite;
    
    public Elfe(String nom, String valeurAcuite, Arme arme) {
    	super(nom);
    	this.valeurAcuite = valeurAcuite;
    	this.setArmeActive(arme);
    }
    
    public Elfe(String nom, String valeurAcuite) {
    	super(nom);
    	this.valeurAcuite = valeurAcuite;
    	this.setArmeActive(new Epee());
    }

    public String getValeurAcuite() {
        return this.valeurAcuite;
    }

    public void setValeurAcuite(String valeurAcuite) {
        this.valeurAcuite = valeurAcuite;
    }
    
    
}
