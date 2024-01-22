package Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name ="products",
//		schema="ek2of",
//		uniqueConstraints = {
//				@UniqueConstraint(
//						name ="sku_unique",
//						columnNames = "sku"
//						)
//		}
//		)
public class Product {
	
	
	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
//	@Column(name="stock_keeping_units",nullable=false)
	private String Sku;
//	@Column(nullable=false)
	private String name;
//	@Column(name ="Description")
	private String description;
//	@Column(name ="Price")
	private BigDecimal price;
//	@Column(name ="Active")
	private boolean active;
//	@Column(name ="ImageUrl")
	private String imageUrl;
//	@Column(name ="DateCreated")
	private LocalDateTime dateCreated;
//	@Column(name ="DateUpdated")
	private LocalDateTime lastUpdate;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return Sku;
	}
	public void setSku(String sku) {
		Sku = sku;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
