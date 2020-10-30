package tn.enig.model;

public class Voiture {
	private int id;
	private String categorie;
	private String marque;
	private String dispo;
	
	public Voiture() {
		super();
	}

	public Voiture(int id, String categorie, String marque, String dispo) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.marque = marque;
		this.dispo = dispo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getDispo() {
		return dispo;
	}

	public void setDispo(String dispo) {
		this.dispo = dispo;
	}
	

}
