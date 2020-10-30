package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.ILocation;
import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;

@Service
public class LocationServiceImp implements ILocationService {

	@Autowired
	ILocation dao;

	public ILocation getDao() {
		return dao;
	}

	public void setDao(ILocation dao) {
		this.dao = dao;
	}

	public void addClient(Client c) {
		dao.addClient(c);		
	}

	public void addVoiture(Voiture v) {
		dao.addVoiture(v);		
	}

	public void addContrat(Contrat ct) {
		dao.addContrat(ct);		
	}

	public Client getClientById(int id) {
		
return dao.getClientById(id);
	}

	public Voiture getVoitureById(int id) {
  
    return  dao.getVoitureById(id)	;
	}

	public List<Contrat> getallContrat() {

return dao.getallContrat();
	}

	public List<Voiture> getallVoiture() {
		// TODO Auto-generated method stub
		return dao.getallVoiture();
	}

	public List<Voiture> getAllVoitureNonLoue() {

return dao.getAllVoitureNonLoue();
	}

	public List<Client> getAllClient() {
	return dao.getAllClient();
	}
	
	
}
