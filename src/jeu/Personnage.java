package jeu;

import java.util.ArrayList;

import factory.ArmeTaurenFactory;

public class Personnage {
	private String nom;
	private Integer vitalite;
	private Arme armeActive;
	private ArrayList<Arme> sacArmes;
	private Etat etat;

	public Personnage(String nom) {
		this.nom = nom;
		this.vitalite = 100;
		this.etat = Etat.VIVANT;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getVitalite() {
		return this.vitalite;
	}

	public void setVitalite(Integer vitalite) {
		this.vitalite = vitalite;
		if(vitalite < 0) {
			this.vitalite = 0;
		}
		if(vitalite <= 25) {
			this.etat = Etat.FAIBLE;
		}else if (vitalite == 0) {
			this.etat = Etat.MORT;
		}
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

	// Operations
	public void changeArme(Arme a) {
		sacArmes.add(getArmeActive());
		this.setArmeActive(a);
	}

	public void ramasserArme(Arme a) {
		sacArmes.add(getArmeActive());
		this.setArmeActive(a);
	}

	public int getForce() {
		return this.armeActive.getForce();
	}

	public int getProtection() {
		return this.armeActive.getProtection();
	}
	
	public Etat getEtat() {
		return this.etat;
	}
	
	//Méthode attaquer exo 1.
	public void attaquer(Personnage p) {
		if (p.getArmeActive().getProtection() < this.getArmeActive().getForce() && !p.getEtat().equals(Etat.INVINCIBLE)) {
			int pvPerdu;
			if(p.getEtat().equals(Etat.FAIBLE))
				pvPerdu = this.getArmeActive().getForce() - p.getArmeActive().getProtection();
			else
				pvPerdu = this.getArmeActive().getForce() - (this.getArmeActive().getProtection() * (1-1/this.getVitalite()));
			p.setVitalite(p.getVitalite() - pvPerdu);

			System.out.println(p.getNom() + " a perdu " + pvPerdu + " de vitalite.");
		} else {
			System.out.println(p.getNom() + " n'a pas perdu de vie, le coup est inefficace.");
		}
	}

	//Méthode attaquer avec verification que c'est une arme Tauren pour 2.2
	public void attaquer(Personnage p, ArmeTaurenFactory atf) {
		if (p.getArmeActive().getProtection() < this.getArmeActive().getForce()) {
			int pvPerdu = this.getArmeActive().getForce() - p.getArmeActive().getProtection();
			p.setVitalite(p.getVitalite() - pvPerdu);

			System.out.println(p.getNom() + " a perdu " + pvPerdu + " de vitalite.");
		} else {
			System.out.println(p.getNom() + " n'a pas perdu de vie, le coup est inefficace.");
		}

		// Gestion de la protection du bouclier du tauren
		if (p instanceof Tauren)
			if (p.getArmeActive() instanceof Bouclier)
				p.getArmeActive().setProtection(p.getArmeActive().getProtection() + 2);
		// Gestion de la force de l'epee du tauren
		for (Arme a : atf.getListeArmeTauren()) {
			if (this.armeActive.equals(a)) {
				if (this.getArmeActive() instanceof Epee)
					this.getArmeActive().setForce(this.getArmeActive().getForce() - 1);
			}
		}
	}

}
