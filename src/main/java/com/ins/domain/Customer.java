package com.ins.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	private Timestamp dob;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LEAD_ID")
	private String leadId;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	private String status;

	private String telephone;

	//TODO es pregunta o afirmacion? bi-directional many-to-one association to CustomerRelative
	@OneToMany(mappedBy="customer")
	private List<CustomerRelative> customerRelatives = null;

	public Customer() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public Timestamp getDob() {
		return this.dob;
	}

	public void setDob(Timestamp dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLeadId() {
		return this.leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<CustomerRelative> getCustomerRelatives() {
		return this.customerRelatives;
	}

	public void setCustomerRelatives(List<CustomerRelative> customerRelatives) {
		this.customerRelatives = customerRelatives;
	}

	public CustomerRelative addCustomerRelative(CustomerRelative customerRelative) {
		getCustomerRelatives().add(customerRelative);
		customerRelative.setCustomer(this);

		return customerRelative;
	}

	public CustomerRelative removeCustomerRelative(CustomerRelative customerRelative) {
		getCustomerRelatives().remove(customerRelative);
		customerRelative.setCustomer(null);

		return customerRelative;
	}

}