package tn.website.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import sun.font.CreatedFontTracker;
import tn.website.dao.ClientDao;
import tn.website.model.Client;
import tn.website.model.Commande;
import tn.website.model.Personne;
import tn.website.model.Produit;
import tn.website.model.Vendeur;




public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("site_marchant3");
		EntityManager em = emf.createEntityManager();
		
		
		
		
		//ajout d'un client
		Client c = new Client();
		c.setNom("krichen");
		c.setPrenom("mehdi");
		c.setAddress("ariana");
		c.setTelephone(24600487);
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		//
		
		
		
		//supprimer Utilisateur
		//Personne personne =new Personne();
		
		
		
		
		
		//ajout d'un produit
//		Produit produit =new Produit();
//		produit.setMarque("samsung");
//		produit.setNom("televiseur");
//		produit.setPrix(2000);
//		em.getTransaction().begin();
//		em.merge(produit);
//		em.getTransaction().commit();
		
		/////////////
		
		
		
		//ajout de Vendeur
//		Vendeur v = new Vendeur();
//		v.setNom("mehdi");
//		v.setAddress("tunis");
//		v.setPrenom("krichen");
//		v.setTelephone(55600487);
//		em.getTransaction().begin();
//		em.merge(v);
//		em.getTransaction().commit();
		/////
		

		///ajouter un produit au panier du client
//		Commande commande =new Commande();
//		commande.ajouterProduit(produit);
//		em.getTransaction().begin();
//		em.merge(commande);
//		em.getTransaction().commit();
		///
		
		
		em.close();
		emf.close();

	}

}
