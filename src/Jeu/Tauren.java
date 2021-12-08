package Jeu;


public class Tauren extends Personnage {
    private int musculation;
    
    public Tauren(String nom, int musculation) {
    	super(nom);
    	this.musculation = musculation;
    	this.setArmeActive(new Bouclier());
    }
    
    public int getMusculation() {
        return this.musculation;
    }

    public void setMusculation(int musculation) {
        this.musculation = musculation;
    }
}
