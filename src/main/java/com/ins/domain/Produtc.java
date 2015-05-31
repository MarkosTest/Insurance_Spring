package com.ins.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the PRODUTCS database table.
 * 
 */
@Entity
@Table(name="PRODUTCS")
@NamedQuery(name="Produtc.findAll", query="SELECT p FROM Produtc p")
public class Produtc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private String productId;

	@Column(name="\"CATALOG\"")
	private String catalog;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	@Column(name="PRDUCT_NAME")
	private String prductName;

	private double price;

	private String status;

	public Produtc() {
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCatalog() {
		return this.catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getPrductName() {
		return this.prductName;
	}

	public void setPrductName(String prductName) {
		this.prductName = prductName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}