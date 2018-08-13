package com.cg.finalproject.beans;

import java.util.Date;

public class Product {

	private int productId;
	private String productName;
	private String productDesc;
	private String productImageURL;
	private String productBannerURL;
	private double productPrice;
	private int productQuantityAvailable;
	private Review review;//one to many
	private Discount discount;//one to one
	private long productViews;
	private long productTimesBought;
	private boolean productStatus;
	private Date deliveryDate;
	private Date productAddedDate;
	private String brand;
	private Date productRemovedDate;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductImageURL() {
		return productImageURL;
	}
	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}
	public String getProductBannerURL() {
		return productBannerURL;
	}
	public void setProductBannerURL(String productBannerURL) {
		this.productBannerURL = productBannerURL;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantityAvailable() {
		return productQuantityAvailable;
	}
	public void setProductQuantityAvailable(int productQuantityAvailable) {
		this.productQuantityAvailable = productQuantityAvailable;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public long getProductViews() {
		return productViews;
	}
	public void setProductViews(long productViews) {
		this.productViews = productViews;
	}
	public long getProductTimesBought() {
		return productTimesBought;
	}
	public void setProductTimesBought(long productTimesBought) {
		this.productTimesBought = productTimesBought;
	}
	public boolean isProductStatus() {
		return productStatus;
	}
	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getProductAddedDate() {
		return productAddedDate;
	}
	public void setProductAddedDate(Date productAddedDate) {
		this.productAddedDate = productAddedDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Date getProductRemovedDate() {
		return productRemovedDate;
	}
	public void setProductRemovedDate(Date productRemovedDate) {
		this.productRemovedDate = productRemovedDate;
	}
	
		
}
