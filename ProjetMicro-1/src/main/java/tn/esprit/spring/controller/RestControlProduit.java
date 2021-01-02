package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.services.CategoryService;
import tn.esprit.spring.services.ProduitService;
@RestController

public class RestControlProduit {
	@Autowired	
	ProduitService iproduitservice;

	@Autowired
	CategoryService icategoryservice;
	//http://localhost:8081/SpringMVC/servlet/ajouterProduit
		@PostMapping("/ajouterProduit")
		@ResponseBody
		public int ajouterEmploye(@RequestBody Produit produit) {
			iproduitservice.ajouterProduit(produit);
			return produit.getId();
		}

		//http://localhost:8082/SpringMVC/servlet/ajouterCategory
		@PostMapping("/ajouterCategory")
		@ResponseBody
		public int ajouterContrat(@RequestBody Category category) {
			iproduitservice.ajouterCategory(category);
			return category.getId();
		}
		@PutMapping("/affecterCatPro/{cat-id}/{pro-id}")
		@ResponseBody
		public void affecterCategoryProduit(@PathVariable("cat-id")Integer catId,@PathVariable("pro-id")Integer proId){
			iproduitservice.affecterCategoryAProduit(catId, proId);
		}
		
		//http://localhost:8081/SpringMVC/servlet/affecterProCat/11/10
	    @GetMapping(value="/getProLabById/{proid}")
	    @ResponseBody
		public String getProduitLabelById(@PathVariable("proid") int produitId) {
			return iproduitservice.getProduitLabelById(produitId);
			
		}


	    @GetMapping(value="/getNombreProduitJPQL")
	    @ResponseBody
		public long getNombreProduitJPQL() {
			return iproduitservice.getNombreProduitJPQL();

		}

	    @GetMapping(value="/getAllProduitNamesJPQL")
	    @ResponseBody
		public List<String> getAllProduitNamesJPQL() {
			return iproduitservice.getAllProduitNamesJPQL();
			
		}

	    
	    @GetMapping(value="/listproduit")
	    @ResponseBody
		public List<Produit> listproduit() {

			List<Produit> a = iproduitservice.listproduit();
			return a ;
			
		}



	    @GetMapping(value="/getPro/{label}")
	    @ResponseBody
		public Produit getProduit(@PathVariable("label") String label) {
	    	Produit e = iproduitservice.getProduit(label);
	    	return e;
		}


}
