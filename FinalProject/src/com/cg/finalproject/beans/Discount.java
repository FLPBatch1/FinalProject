package com.cg.finalproject.beans;

import java.util.Date;
@Entity
public class Discount {
private Date startDateOfDiscount;
private Date endDateOfDiscount;
private int productId;//one to one
@Id
private int discountId;
private double percentDiscount;
private Merchant merchant;// ??
public Date getStartDateOfDiscount() {
	return startDateOfDiscount;
}
public void setStartDateOfDiscount(Date startDateOfDiscount) {
	this.startDateOfDiscount = startDateOfDiscount;
}
public Date getEndDateOfDiscount() {
	return endDateOfDiscount;
}
public void setEndDateOfDiscount(Date endDateOfDiscount) {
	this.endDateOfDiscount = endDateOfDiscount;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getDiscountId() {
	return discountId;
}
public void setDiscountId(int discountId) {
	this.discountId = discountId;
}
public double getPercentDiscount() {
	return percentDiscount;
}
public void setPercentDiscount(double percentDiscount) {
	this.percentDiscount = percentDiscount;
}
public Merchant getMerchant() {
	return merchant;
}
public void setMerchant(Merchant merchant) {
	this.merchant = merchant;
}



}
