package Jeu;


public class Arme {
    private int force;
    private int protection;

    public Arme(int force, int protection){
        this.force = force;
        this.protection = protection;
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
    
    
}
