package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.entity.Produit;

public interface IProduitService {
	public int ajouterProduit(Produit produit);//done
	public int ajouterCategory(Category contrat);//done
	public void affecterCategoryAProduit(int categoryId, int produitId);//done
	public String getProduitLabelById(int produitId);//done
	public long getNombreProduitJPQL();//done
	public List<String> getAllProduitNamesJPQL();//done
	public List<Produit> listproduit();//done
	public int addOrUpdateProduit(Produit produit);
	public void removeProduit(int produitId);




}
