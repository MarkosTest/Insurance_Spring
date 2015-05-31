package com.ins.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the PODETAILS database table.
 * 
 */
@Entity
@Table(name="PODETAILS")
@NamedQuery(name="Podetail.findAll", query="SELECT p FROM Podetail p")
public class Podetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	@Column(name="STATE")
	private String state;

	//bi-directional many-to-one association to Poheader
	@ManyToOne
	@JoinColumn(name="PONUMBER")
	@Id
	private Poheader poheader;

	public Podetail() {
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Poheader getPoheader() {
		return this.poheader;
	}

	public void setPoheader(Poheader poheader) {
		this.poheader = poheader;
	}

}