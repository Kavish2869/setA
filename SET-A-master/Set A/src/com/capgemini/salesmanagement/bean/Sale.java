package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	
	private int saleId,quantity;
	int prodCode;
	private String productName,cateogery;
	private LocalDate saleDate;
	private String description;
	private int productPrice;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Sale \n saleId=" + saleId + "\n prodCode=" + prodCode + "\n quantity=" + quantity + "\n productName="
				+ productName + "\n cateogery=" + cateogery + "\n saleDate=" + saleDate + "\n description=" + description
				+ "\n productPrice=" + productPrice + "\n lineTotal=" + lineTotal;
	}
	private float lineTotal;
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
		
     public Sale(int productCode, int productQuantity, String productCategory, String productName,
			String productDescription, int productPrice, LocalDate date) {
		
		this.prodCode=productCode;
		this.cateogery=productCategory;
		this.quantity=productQuantity;
		this.productName=productName;
		this.description=productDescription;
		this.productPrice=productPrice;
		this.saleDate =date;
	}
	
	
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int  getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCateogery() {
		return cateogery;
	}
	public void setCateogery(String cateogery) {
		this.cateogery = cateogery;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
}
	

