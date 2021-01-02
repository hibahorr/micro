package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "T_CATEGORY")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id; 
	private String label;
    private String reference;
	
	private String typeCategory;
	@OneToOne(mappedBy="category")
	private Produit produit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTypeCategory() {
		return typeCategory;
	}
	public void setTypeCategory(String typeCategory) {
		this.typeCategory = typeCategory;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", label=" + label + ", reference=" + reference + ", typeCategory=" + typeCategory
				+ ", produit=" + produit + "]";
	}
	public Category() {
		super();
	}
	public Category(String label, String reference, String typeCategory, Produit produit) {
		super();
		this.label = label;
		this.reference = reference;
		this.typeCategory = typeCategory;
		this.produit = produit;
	}
	public Category(int id, String label, String reference, String typeCategory, Produit produit) {
		super();
		this.id = id;
		this.label = label;
		this.reference = reference;
		this.typeCategory = typeCategory;
		this.produit = produit;
	}
	
}
