package tn.esprit.spring.controller;

import java.util.List;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.services.ProduitService;
import tn.esprit.spring.services.CategoryService;

@Scope(value ="session")
@Controller(value ="produitController")
@ELBeanName(value ="produitController")

public class IControllerProduitImpl {
	@Autowired	
	ProduitService iproduitservice;

	@Autowired
	CategoryService icategoryservice;
	private String label;
	private String description;
	private Produit produit;
private List<Produit> produits;
	
	private Integer produitToBeUpdated;
	public void displayProduit(Produit produit)
	{
		this.setLabel(produit.getLabel());
		this.setDescription(produit.getDescription());
		this.setCategory(produit.getCategory());
		

	}

	private void setCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduit()
	{ 
		iproduitservice.addOrUpdateProduit(new Produit(produitToBeUpdated, label, description, null)); 
		}
	public void removeProduit(int produitId)
	{
		iproduitservice.removeProduit(produitId);
	}
		
	public List<Produit> getProduits() {
		produits = iproduitservice.getAllProduits();
		return produits;
		}

	public void addProduit() {
		iproduitservice.addOrUpdateProduit(new Produit( label, description, null));
		}

	public ProduitService getIproduitservice() {
		return iproduitservice;
	}

	public void setIproduitservice(ProduitService iproduitservice) {
		this.iproduitservice = iproduitservice;
	}

	public CategoryService getIcategoryservice() {
		return icategoryservice;
	}

	public void setIcategoryservice(CategoryService icategoryservice) {
		this.icategoryservice = icategoryservice;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Integer getProduitToBeUpdated() {
		return produitToBeUpdated;
	}

	public void setProduitToBeUpdated(Integer produitToBeUpdated) {
		this.produitToBeUpdated = produitToBeUpdated;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
