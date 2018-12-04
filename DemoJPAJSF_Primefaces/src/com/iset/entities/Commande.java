package com.iset.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande {
	 @Id 
	 @GeneratedValue (strategy=GenerationType.IDENTITY)  
	  private long numCom;
	  private Double montantCom;
	  
	  @Temporal( TemporalType.DATE )
	  private Date dateCom;
	  
	  @ManyToOne
	  private Client client;

	public long getNumCom() {
		return numCom;
	}

	public void setNumCom(long numCom) {
		this.numCom = numCom;
	}

	public Double getMontantCom() {
		return montantCom;
	}

	public void setMontantCom(Double montantCom) {
		this.montantCom = montantCom;
	}

	public Date getDateCom() {
		return dateCom;
	}

	public void setDateCom(Date dateCom) {
		this.dateCom = dateCom;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	  
	  
	  
}
