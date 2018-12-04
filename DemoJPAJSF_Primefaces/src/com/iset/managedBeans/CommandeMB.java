package com.iset.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import com.iset.dao.ClientDao;
import com.iset.dao.CommandeDao;
import com.iset.entities.Client;
import com.iset.entities.Commande;

@ManagedBean
@ViewScoped
public class CommandeMB {
	private Commande commande=new Commande();
	private List<Client> listeClients = new ArrayList<Client>();
	private List<Commande> listeCommandes = new ArrayList<Commande>();
	CommandeDao comDao = new CommandeDao();
	ClientDao cltDao = new ClientDao();

	
public CommandeMB() {
	
}



public String  add() {
	comDao.ajouter(this.commande);
	return "ajouter_commande.xhtml?faces-redirect=true";
	
}

//Initialiser  la liste des clients
	public void initListeClients() {
		listeClients = cltDao.listerTous();
		listeCommandes = comDao.listerTous();
	
	}

public Commande getCommande() {
	return commande;
}

public void setCommande(Commande commande) {
	this.commande = commande;
}

public List<Client> getListeClients() {
	return listeClients;
}

public void setListeClients(List<Client> listeClients) {
	this.listeClients = listeClients;
}


public List<Commande> getListeCommandes() {
	return listeCommandes;
}

public void setListeCommandes(List<Commande> listeCommandes) {
	this.listeCommandes = listeCommandes;
}



}

