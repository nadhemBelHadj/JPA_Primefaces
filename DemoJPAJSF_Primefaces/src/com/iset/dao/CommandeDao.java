package com.iset.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.iset.entities.Client;
import com.iset.entities.Commande;
import com.iset.util.JPAutil;


//classe contenant les m�thodes g�n�riques ajouter,  supprimer, consulter par cl� primaire (Id)
public  class CommandeDao {
private EntityManager entityManager=JPAutil.getEntityManager("MonProjetJPA");
 
//m�thode ajouter d'une entit� �  la bd
	 public   void ajouter(Commande c)
	{
	 	EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(c);
	 	tx.commit();
	 	  
	}
	 
	 //m�thode modifier d'une entit� �  partir de la bd
	 public   void modifier(Commande c)
		{
		 	EntityTransaction tx = entityManager.getTransaction();
		 	tx.begin();
		 	entityManager.merge(c);
		 	tx.commit();
		 	  
		}
	 
	 //m�thode Supprimer d'une entit� �  partir de la bd
	 public  void supprimer(Commande c)
	{ 
		EntityTransaction tx = entityManager.getTransaction();
	    tx.begin();
	    c=entityManager.merge(c); // important
	    entityManager.remove(c);
	    tx.commit();  
	}
	 
	 //m�thode Consulter d'une entit� �  partir de la bd
	 public  Client Consulter(Client c,Object id)
	{
	 	return entityManager.find(c.getClass(), id);
		}
	 
	 
	 public List<Commande> listerTous() {
			
			List<Commande> coms =entityManager.createQuery( "select c from Commande c").getResultList();
			 return coms;
			 }
}
