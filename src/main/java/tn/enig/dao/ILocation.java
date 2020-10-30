package tn.enig.dao;

import java.util.List;

import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;

public interface ILocation {

	public void addClient(Client c);		
	public void addVoiture(Voiture v);		
	public void addContrat(Contrat ct);		
	public Client getClientById (int id);
	public Voiture getVoitureById(int id);
	public List<Contrat>getallContrat();
	public List<Voiture>getallVoiture();
	public List<Client> getAllClient();
	public List<Voiture> getAllVoitureNonLoue();
}


