package entities;

import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
 
@Entity
@Table(name = "CATEGORY")
public class Category {
 
    private long id;
    private String name;
 
    private Set<Product> products;
 
    public Category() {
    }
 
    public Category(long id, String name, Set<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public Category(String name) {
        this.name = name;
    }
 
    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getId() {
        return id;
    }
 
 
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    public Set<Product> getProducts() {
        return products;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
 
    
}
