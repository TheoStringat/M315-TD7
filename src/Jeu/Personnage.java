package Jeu;

public class Personnage {
    private String nom;
    private Integer vitalite;
    private Arme armeActive;
    
    public Personnage(String nom){
        this.nom = nom;
        this.vitalite = 100;
    }

    private Set<Arme> sacArmes;

    private String getNom() {
        return this.nom;
    }

    private String setNom(String nom) {
        this.nom = nom;
    }

    private Integer getVitalite() {
        return this.vitalite;
    }

    private Integer setVitalite(Integer vitalite) {
        this.vitalite = vitalite;
    }

    public Arme getSacArmes() {
        return this.sacArmes;
    }

    public Arme setSacArmes(Arme sacArmes) {
        this.sacArmes = sacArmes;
    }

    public Arme getArmeActive() {
        return this.armeActive;
    }

    public Arme setArmeActive(Arme armeActive) {
        this.armeActive = armeActive;
    }
    

    //                          Operations
    public void changeArme(Arme a) {
        //TODO
    }

    public void ramasserArme(Arme a){

    }


    public getForce() {
        return this.armeActive.getForce();
    }

    public getProtection() {
        return this.armeActive.getProtection();
    }
    /**
    * @generated
    */
    public attaquer(Personnage p) {
        if(p.getArmeActive().getProtection() < this.getArmeActive().getForce()){
            p.setVitalite(p.getVitalite() - (this.getArmeActive().getForce() - p.getArmeActive().getProtection()));
            system.out.println("")
        } else{

        }

    }
    
}
