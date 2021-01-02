package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ICategoryRepository;
import tn.esprit.spring.repository.IProduitRepository;
import org.springframework.stereotype.Service;
@Service

public class ProduitService {
	@Autowired
	IProduitRepository prorep;
	@Autowired
	ICategoryRepository catrep;
	
	public int addOrUpdateProduit(Produit produit) {
		prorep.save(produit);
	return produit.getId();
	}
	public int ajouterProduit(Produit produit) {
		prorep.save(produit);
		return produit.getId();
	}

	public List<Produit> getAllProduits() {
	return (List<Produit>) prorep.findAll();
	}
	public int ajouterCategory(Category category) {
		catrep.save(category);
		return category.getId();
	}
	public void affecterCategoryAProduit(int categoryId, int produitId) {
		Category cat =catrep.findById(categoryId).orElse(null);
		Produit pro =prorep.findById(produitId).orElse(null);
		pro.setCategory(cat);
		prorep.save(pro);
	
	}
	public String getProduitLabelById(int produitId) {
		Produit pro =prorep.findById(produitId).orElse(null);
	    return pro.getLabel();
		
	}

	public void removeProduit(int id) {
		prorep.deleteById(id);
		
	}
public long getNombreProduitJPQL() {
		
		return prorep.getNombreProduitJPQL();
	}
public List<String> getAllProduitNamesJPQL() {
	return prorep.getAllProduitNamesJPQL();
	
}
public List<Produit> listproduit() {

	List<Produit> pros= new ArrayList<>();
	
	return pros;
	
}

public Produit getProduit(String label) {
	Produit pro = null;
	List<Produit> l =(List<Produit>) prorep.findAll();
	for (Produit e:l){
		if((e.getLabel()==label)){
			pro=e;
			
			
		}
	}
	return pro;
}


	
	
}
