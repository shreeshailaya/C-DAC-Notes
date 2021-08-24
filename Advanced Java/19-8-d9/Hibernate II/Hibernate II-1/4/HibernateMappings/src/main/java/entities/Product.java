package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "PRODUCT")
public class Product {
    private long id;
    private String name;
    private String description;
    private float price;
 
    private Category category;
 
    public Product() {
    }
 
    public Product(String name, String description, float price,
            Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
 
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
 
    

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	@ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    public Category getCategory() {
        return category;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
 
   
}
