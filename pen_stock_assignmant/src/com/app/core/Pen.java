package com.app.core;

import java.time.LocalDate;

public class Pen {
private int penid;
private String brand;
private String color;
private String inkColor;
private Material material;
private int stock;
private LocalDate updatedate;//stock updatedate it changes when admin update stock or user order pen

private LocalDate listingdate;
private int price;
private int discount;

private int idGenerator;

public Pen(String brand, String color, String inkColor, Material material, int stock,LocalDate updatedate,
		LocalDate listingDate, int price, int discount ) {
	super();
	this.brand = brand;
	this.color = color;
	this.inkColor = inkColor;
	this.material = material;
	this.stock = stock;
	this.updatedate = updatedate;
	this.listingdate = listingDate;
	this.price = price;
	this.discount = discount;
	this.penid = ++idGenerator;
}
public Pen(String brand) {
	this.brand=brand;
}

public int getPenid() {
	return penid;
}

public void setPenid(int penid) {
	this.penid = penid;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getInkColor() {
	return inkColor;
}

public void setInkColor(String inkColor) {
	this.inkColor = inkColor;
}

public Material getMaterial() {
	return material;
}

public void setMaterial(Material material) {
	this.material = material;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public LocalDate getUpdatedate() {
	return updatedate;
}

public void setUpdatedate(LocalDate updatedate) {
	this.updatedate = updatedate;
}

public LocalDate getListingdate() {
	return listingdate;
}

public void setListingdate(LocalDate listingdate) {
	this.listingdate = listingdate;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

@Override
public String toString() {
	return "Pen [penid=" + penid + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
			+ material + ", stock=" + stock + ", updatedate=" + updatedate + ", listingdate=" + listingdate + ", price="
			+ price + ", discount=" + discount + ", idGenerator=" + idGenerator + "]";
}

public int getIdGenerator() {
	return idGenerator;
}

public void setIdGenerator(int idGenerator) {
	this.idGenerator = idGenerator;
}



//public Pen(String brand2, String color2, String inkColor2, Material pmaterial, int stock2, String udate,
//		String lisdate, int price2, int discount1) {
//	this.brand = brand2;
//	this.color = color2;
//	this.inkColor = inkColor2;
//	this.material = pmaterial;
//	this.stock = stock2;
//	this.updatedate = udate;
//	this.listingdate = lisdate;
//	this.price = price2;
//	this.discount = discount1;
//
//}












}
