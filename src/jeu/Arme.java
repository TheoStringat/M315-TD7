package jeu;


public class Arme {
	protected int force;
    protected int protection;
    protected String nom;

    public Arme(int force, int protection, String nom){
        this.force = force;
        this.protection = protection;
        this.nom = nom;
    }
    
    public Arme(int force, int protection){
        this.force = force;
        this.protection = protection;
        this.setNom("");
    }

    public int getForce() {
        return this.force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getProtection() {
    	return this.protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
    
}
