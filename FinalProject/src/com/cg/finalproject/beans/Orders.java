package com.cg.finalproject.beans;

import java.util.Date;

@Entity
public class Orders {
	@Id
	private int orderId;
	private Product product;// get product name and price
	private int userId;
	private double totalAmount;
	private String deliveryStatus;// placed, shipped, out for delivery 
	private String statusOfTransaction; //Success or fail
	private String modeOfPurchase;// can be COD, Online Purchase
	private Merchant merchant;// get merchant name
	private Date elligibleReturnDate;
	private Date orderPlacedOn;
	private boolean refundRequest;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getStatusOfTransaction() {
		return statusOfTransaction;
	}
	public void setStatusOfTransaction(String statusOfTransaction) {
		this.statusOfTransaction = statusOfTransaction;
	}
	public String getModeOfPurchase() {
		return modeOfPurchase;
	}
	public void setModeOfPurchase(String modeOfPurchase) {
		this.modeOfPurchase = modeOfPurchase;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public Date getElligibleReturnDate() {
		return elligibleReturnDate;
	}
	public void setElligibleReturnDate(Date elligibleReturnDate) {
		this.elligibleReturnDate = elligibleReturnDate;
	}
	public Date getOrderPlacedOn() {
		return orderPlacedOn;
	}
	public void setOrderPlacedOn(Date orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}
	public boolean isRefundRequest() {
		return refundRequest;
	}
	public void setRefundRequest(boolean refundRequest) {
		this.refundRequest = refundRequest;
	}
	
	
	
}
