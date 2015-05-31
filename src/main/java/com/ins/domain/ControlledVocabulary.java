package com.ins.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CONTROLLED_VOCABULARY database table.
 * 
 */
@Entity
@Table(name="CONTROLLED_VOCABULARY")
@NamedQuery(name="ControlledVocabulary.findAll", query="SELECT c FROM ControlledVocabulary c")
public class ControlledVocabulary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TERM_ID")
	private String termId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	@Column(name="TERM_NAME")
	private String termName;

	public ControlledVocabulary() {
	}

	public String getTermId() {
		return this.termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
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

	public String getTermName() {
		return this.termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

}