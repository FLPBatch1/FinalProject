package com.cg.finalproject.beans;

public class Wishlist {

	private Customer customer;// one to one
	private Product product;// one to many
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
