package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;
@Repository
public class LocationImp implements ILocation{
	
	@Autowired
	@Qualifier(value="datasource")
	private DataSource data;
	public void addClient(Client c) {
		try
		{
		String sql="insert into client values(?,?,?)";
		Connection con=data.getConnection();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, c.getNump());
		ps.setString(2, c.getNom());
		ps.setString(3,c.getAdr());
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		
	}

	public void addVoiture(Voiture v) {
		try
		{
			String sql="insert into voiture values(?,?,?,?)";
			Connection con=data.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, v.getId());
			ps.setString(2,v.getMarque());
			ps.setString(3,v.getCategorie());
			ps.setString(4, v.getDispo());
			ps.executeUpdate();
			}
			catch(Exception e)
			{
				
			}
		
	}

	public void addContrat(Contrat ct) {
		try
		{
				Connection con=data.getConnection();
				String sql="insert into contrat values(?,?,?,?,?)";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, ct.getId());
				ps.setInt(2,ct.getCl().getNump());
				ps.setInt(3,ct.getVt().getId());
				ps.setString(4, ct.getDated());
				ps.setString(5, ct.getDatef());
				ps.executeUpdate();
	
		}
		catch(Exception e)
		{
			
		}
		
	}

	public Client getClientById(int id) {
		Client cl = null;
		try
		{
				Connection con=data.getConnection();
				String sql="select * from client where id=? ";
			
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(0,id);
				ResultSet rs= ps.executeQuery();

				while(rs.next()) {
					cl = new Client(rs.getInt("nump"),rs.getString("nom"),rs.getString("adr"));
				}
	
		}
		catch(Exception e)
		{
			
		}
		return cl;
		
	}

	public Voiture getVoitureById(int id) {
		Voiture vt = null;
		try
		{
				Connection con=data.getConnection();
				String sql="select * from voiture where id=? ";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,id);
				ResultSet rs= ps.executeQuery();

				while(rs.next()) {
					vt = new Voiture(rs.getInt("id"),rs.getString("categorie"),rs.getString("marque"),rs.getString("dispo"));
				}
	
		}
		catch(Exception e)
		{
			
		}
		return vt;
	}

	public List<Contrat>getallContrat() {
		List<Contrat> lct= new ArrayList<Contrat>();
		try
		{
				Connection con=data.getConnection();
				String sql="select * from contrat ";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Client c = getClientById(rs.getInt("nump"));
					Voiture v = getVoitureById(rs.getInt("id"));

					Contrat ct = new Contrat (rs.getInt("id"),c,v,rs.getString("dated"),rs.getString("datef"));
					lct.add(ct);
				}
	
		}
		catch(Exception e)
		{
			
		}
		return lct;
	}

	public List<Voiture> getallVoiture() {
		List<Voiture> lvt= new ArrayList<Voiture>();
		try
		{
				Connection con=data.getConnection();
				String sql="select * from Voiture where dispo=0";
		
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,"True");
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Voiture vt = new Voiture(rs.getInt("id"),rs.getString("categorie"),rs.getString("marque"),rs.getString("dispo"));
					lvt.add(vt);
				}
		}
		catch(Exception e)
		{
			
		}
		return lvt;
	}

	public List<Voiture> getAllVoitureNonLoue() {
		List<Voiture> liste=null;
		try {
			liste= new ArrayList<Voiture>();
			Connection con = data.getConnection();
			PreparedStatement pre =con.prepareStatement("select * from voiture where dispo=?"); 
			pre.setString(1, "true");
			ResultSet rs= pre.executeQuery();
			while(rs.next()) {
				Voiture lv = new Voiture(rs.getInt("id"),rs.getString("categorie"),rs.getString("marque"),rs.getString("dispo"));
				liste.add(lv);
			}
		}catch (Exception e) {
		// TODO: handle exception
		}
		
		return liste;
	}

	public List<Client> getAllClient(){
		List<Client> liste=null;
		try {
			liste= new ArrayList<Client>();
			Connection con = data.getConnection();
			PreparedStatement pre =con.prepareStatement("select * from client"); 
	
			ResultSet rs= pre.executeQuery();
			while(rs.next()) {
				
				Client lc = new Client(rs.getInt("numPermis"),rs.getString("nom"),rs.getString("adress"));
				liste.add(lc);
			}
		}catch (Exception e) {
		// TODO: handle exception
		}
		return liste;
	}
	

}


