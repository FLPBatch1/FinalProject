package com.cg.finalproject.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
@Id
private int categoryId;
private Product product;
private String categoryName;//Clothes, books, gadgets
private String type;		// shirts, pants, dresses in clothing

public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
