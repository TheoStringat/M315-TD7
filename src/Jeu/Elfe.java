package Jeu;

public class Elfe extends Personnage {
    private String valeurAcuite;
    
    public Elfe(String nom, String valeur_acuite) {
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
