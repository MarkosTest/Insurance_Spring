package com.ins.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the POHEADER database table.
 * 
 */
@Entity
@NamedQuery(name="Poheader.findAll", query="SELECT p FROM Poheader p")
public class Poheader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String ponumber;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	@Column(name="\"STATE\"")
	private String state;

	//bi-directional many-to-one association to Podetail
	@OneToMany(mappedBy="poheader")
	private List<Podetail> podetails;

	public Poheader() {
	}

	public String getPonumber() {
		return this.ponumber;
	}

	public void setPonumber(String ponumber) {
		this.ponumber = ponumber;
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

	public List<Podetail> getPodetails() {
		return this.podetails;
	}

	public void setPodetails(List<Podetail> podetails) {
		this.podetails = podetails;
	}

	public Podetail addPodetail(Podetail podetail) {
		getPodetails().add(podetail);
		podetail.setPoheader(this);

		return podetail;
	}

	public Podetail removePodetail(Podetail podetail) {
		getPodetails().remove(podetail);
		podetail.setPoheader(null);

		return podetail;
	}

}