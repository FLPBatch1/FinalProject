package com.cg.finalproject.beans;

import java.util.Date;

public class Merchant_Functionality {

	private int merchantId;
	private boolean isThirdPartyMerchant;
	private Product product;
	private Discount discount;
	private Coupon coupon;
	private Date addMerchantDate;
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public boolean isThirdPartyMerchant() {
		return isThirdPartyMerchant;
	}
	public void setThirdPartyMerchant(boolean isThirdPartyMerchant) {
		this.isThirdPartyMerchant = isThirdPartyMerchant;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Date getAddMerchantDate() {
		return addMerchantDate;
	}
	public void setAddMerchantDate(Date addMerchantDate) {
		this.addMerchantDate = addMerchantDate;
	}
	
	
	
}
