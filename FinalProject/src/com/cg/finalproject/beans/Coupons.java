package com.cg.finalproject.beans;

import java.util.Date;

@Entity
public class Coupons {
	private Date couponStartDate;
	private Date couponEndDate;
	private int productId;//one to one
	@Id
	private int couponId;
	private String couponName;//??
	private double couponDiscountValue;
	private Merchant merchant;// ??
}
