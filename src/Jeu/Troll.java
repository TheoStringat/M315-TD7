package Jeu;


public class Troll extends Personnage {
    private String capaciteRegeneration;

    public Troll(String nom, String capaciteRegeneration) {
    	super(nom);
    	this.capaciteRegeneration = capaciteRegeneration;
    	this.setArmeActive(new Dague());
    }
    
    public String capaciteRegeneration() {
        return this.capaciteRegeneration;
    }

    public void capaciteRegeneration(String capaciteRegeneration) {
        this.capaciteRegeneration = capaciteRegeneration;
    }
    
    
}
