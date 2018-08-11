package com.cg.finalproject.beans;
@Entity
public class Customer {
	@Id
int customerId;
Address address;
String phoneNumber;
String email;
String password;
String cardNumber;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}



}
