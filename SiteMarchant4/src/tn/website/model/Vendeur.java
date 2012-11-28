package tn.website.model;

import javax.persistence.Entity;



@Entity
public class Vendeur extends Personne{
	

	
	private Stock stock;

	
	public Stock getStock() {
		return stock;
	}


	public void setStock(Stock stock) {
		this.stock = stock;
	}


	public void supprimerProduit(){
		
	}
	
	
	public void modifierProduit(){
		
		
	}
}
