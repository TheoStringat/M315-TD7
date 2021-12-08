package Jeu;


public class Arme {
    private Integer force;
    private Integer protection;

    public Arme(int force, int protection){
        this.force = force;
        this.protection = protection;
    }

    private Integer getForce() {
        return this.force;
    }

    private Integer setForce(Integer force) {
        this.force = force;
    }

    private Integer getProtection() {
        return this.protection;
    }

    private Integer setProtection(Integer protection) {
        this.protection = protection;
    }
    
    
}
