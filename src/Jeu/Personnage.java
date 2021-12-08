package Jeu;

import java.util.ArrayList;

public class Personnage {
    private String nom;
    private Integer vitalite;
    private Arme armeActive;
    private ArrayList<Arme> sacArmes;
    
    public Personnage(String nom){
        this.nom = nom;
        this.vitalite = 100;
    }

    private String getNom() {
        return this.nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    private Integer getVitalite() {
        return this.vitalite;
    }

    private void setVitalite(Integer vitalite) {
        this.vitalite = vitalite;
    }

    public ArrayList<Arme> getSacArmes() {
        return this.sacArmes;
    }

    public void setSacArmes(ArrayList<Arme> sacArmes) {
        this.sacArmes = sacArmes;
    }

    public Arme getArmeActive() {
        return this.armeActive;
    }

    public void setArmeActive(Arme armeActive) {
        this.armeActive = armeActive;
    }
    

    //                          Operations
    public void changeArme(Arme a) {
    	sacArmes.add(getArmeActive());
    	this.setArmeActive(a);
    }

    public void ramasserArme(Arme a){
    	sacArmes.add(getArmeActive());
    	this.setArmeActive(a);
    }

    public int getForce() {
        return this.armeActive.getForce();
    }

    public int getProtection() {
        return this.armeActive.getProtection();
    }
    
    public void attaquer(Personnage p) {
        if(p.getArmeActive().getProtection() < this.getArmeActive().getForce()){
        	int pvPerdu = this.getArmeActive().getForce() - p.getArmeActive().getProtection();
            p.setVitalite(p.getVitalite() - pvPerdu);
            System.out.println(p.getNom() + " a perdu " + pvPerdu + " de vitalite.");
        } else{
        	System.out.println(p.getNom() + " n' pas perdu de vie, le coup est inefficace.");
        }
    }
    
}
