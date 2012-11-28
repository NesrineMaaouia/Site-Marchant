package tn.website.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Stock {
	
	
	@Id
	@GeneratedValue
	private long id_stock;
	List<Produit> list = new ArrayList<Produit>();

}
