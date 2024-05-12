package com.tnsif.ShoppingmallManagement.entity;

public class ShopOwner {
	private long id;
	private String name;
	private String shopName;
	private String contactNumber;
	private String email;


	public ShopOwner() {
		super();
	
}
public ShopOwner(String name, String shopName, String contactNumber, String email) {
	super();
	this.name = name;
	this.shopName = shopName;
	this.contactNumber = contactNumber;
	this.email = email;
}


	public long getId() {
		return id;
	}
	public void setId(Integer id2) {
		this.id = id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;

}
	}
