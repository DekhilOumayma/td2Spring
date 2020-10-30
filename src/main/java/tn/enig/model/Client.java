package tn.enig.model;

public class Client {
private int nump;
private String nom;
private String adr;

public Client() {
	super();
}

public Client(int nump, String nom, String adr) {
	super();
	this.nump = nump;
	this.nom = nom;
	this.adr = adr;
}

public int getNump() {
	return nump;
}

public void setNump(int nump) {
	this.nump = nump;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getAdr() {
	return adr;
}

public void setAdr(String adr) {
	this.adr = adr;
}

}
