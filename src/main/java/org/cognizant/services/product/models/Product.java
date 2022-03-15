package org.cognizant.services.product.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@JoinColumn(name="product_id", referencedColumnName="PRODUCTID")
	private long productID;
	@Column(name="PRODUCTNAME")
	private String productName;
	@JoinColumn(name="supplier_id", referencedColumnName="SUPPLIERID")
	private int supplierID;
	@JoinColumn(name="category_id", referencedColumnName="CATEGORYID")
	private long categoryID;
	@Column(name="UNITPRICE")
	private Long unitPrice;
	
	
	public Product() {
//		super();
	}


	public Product(long productID, String productName, int supplierID, long categoryID, Long unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.supplierID = supplierID;
		this.categoryID = categoryID;
		this.unitPrice = unitPrice;
	}


	public long getProductID() {
		return productID;
	}


	public void setProductID(long productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getSupplierID() {
		return supplierID;
	}


	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}


	public long getCategoryID() {
		return categoryID;
	}


	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}


	public Long getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}


	@Override
	public String toString() {
		return "Category [productID=" + productID + ", productName=" + productName + ", supplierID=" + supplierID
				+ ", categoryID=" + categoryID + ", unitPrice=" + unitPrice + "]";
	}
	
	
}

