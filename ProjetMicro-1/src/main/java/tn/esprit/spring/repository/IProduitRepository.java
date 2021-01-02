package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Produit;
@Repository
public interface IProduitRepository extends  CrudRepository<Produit, Integer>{
	
	
	@Query("Select count(*) From Produit")
	long getNombreProduitJPQL();
	
	
	
	@Query("Select label From Produit ")
	List<String> getAllProduitNamesJPQL();
	

}
