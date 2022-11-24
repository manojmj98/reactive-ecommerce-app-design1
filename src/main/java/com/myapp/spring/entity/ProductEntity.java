package com.myapp.spring.entity;

import java.util.Map;
import java.util.Set;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("ecomproducts")
public class ProductEntity {
	
	@PrimaryKey("product_id")
	@CassandraType(type = Name.TEXT)
	private String productId;
	
	@CassandraType(type = Name.SET,typeArguments = Name.TEXT)
	private Set<String> images;
	
	@CassandraType(type = Name.TEXT)
	private String name;
	
	@CassandraType(type = Name.MAP,typeArguments = {Name.TEXT,Name.TEXT})
	private Map<String, String> specifications;
	
	@CassandraType(type = Name.TEXT)
	private String description;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Set<String> getImages() {
		return images;
	}

	public void setImages(Set<String> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Map<String, String> specifications) {
		this.specifications = specifications;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
