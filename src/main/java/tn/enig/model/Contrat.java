package tn.enig.model;

public class Contrat {
private int id;
private Client cl;
private Voiture vt;
private String dated;
private String datef;

public Contrat() {
	super();
}
public Contrat(int id, Client cl, Voiture vt, String dated, String datef) {
	super();
	this.id = id;
	this.cl = cl;
	this.vt = vt;
	this.dated = dated;
	this.datef = datef;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Client getCl() {
	return cl;
}
public void setCl(Client cl) {
	this.cl = cl;
}
public Voiture getVt() {
	return vt;
}
public void setVt(Voiture vt) {
	this.vt = vt;
}
public String getDated() {
	return dated;
}
public void setDated(String dated) {
	this.dated = dated;
}
public String getDatef() {
	return datef;
}
public void setDatef(String datef) {
	this.datef = datef;
}

}
