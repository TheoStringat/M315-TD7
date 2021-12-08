package Jeu;


public class Tauren extends Personnage {
    private int musculation;
    
    public Tauren(String nom, int musculation) {
    	super(nom);
    	this.musculation = musculation;
    }
    
    public int getMusculation() {
        return this.musculation;
    }

    public void setMusculation(int musculation) {
        this.musculation = musculation;
    }
}
