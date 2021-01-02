package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_PRODUIT")
public class Produit implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id; 
	private String label;
	private String description;
	@OneToOne
	private Category category;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Produit(int id, String label, String description, Category category) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
		this.category = category;
	}
	public Produit(String label, String description, Category category) {
		super();
		this.label = label;
		this.description = description;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", label=" + label + ", description=" + description + ", category=" + category
				+ "]";
	}
	public Produit() {
		super();
	}
	
	
}
