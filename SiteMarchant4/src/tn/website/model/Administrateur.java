package tn.website.model;

import java.util.List;

import javax.persistence.Entity;


@Entity
public class Administrateur extends Personne{
	
	
	private   List<Personne> listeVendeur;
	public List<Personne> getListeVendeur() {
		return listeVendeur;
	}


	public void setListeVendeur(List<Personne> listeVendeur) {
		this.listeVendeur = listeVendeur;
	}


	public List<Personne> getListeClient() {
		return listeClient;
	}


	public void setListeClient(List<Personne> listeClient) {
		this.listeClient = listeClient;
	}


	private   List<Personne> listeClient;
	
	
	
	public void supprimmerUtilisateur(){
		
	}

	
	public void consulterListutilisateur(){
		
	}
	
		
	
	
}

