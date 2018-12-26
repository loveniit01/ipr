package com.ipr.entity.other;
// Generated 26 Dec, 2018 5:16:16 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact", catalog = "ipr_data", uniqueConstraints = @UniqueConstraint(columnNames = "mail_id"))
public class Contact implements java.io.Serializable {

	private long id;
	private long accountId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String designation;
	private String mailId;
	private String phone;
	private Long mobile1;
	private Long mobile2;
	private long createdBy;
	private Date createdDate;

	public Contact() {
	}

	public Contact(long id, long accountId, long createdBy) {
		this.id = id;
		this.accountId = accountId;
		this.createdBy = createdBy;
	}

	public Contact(long id, long accountId, String firstName, String middleName, String lastName, String designation,
			String mailId, String phone, Long mobile1, Long mobile2, long createdBy, Date createdDate) {
		this.id = id;
		this.accountId = accountId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.designation = designation;
		this.mailId = mailId;
		this.phone = phone;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "account_id", nullable = false)
	public long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	@Column(name = "first_name", length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "middle_name", length = 100)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "last_name", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "designation", length = 100)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name = "mail_id", unique = true, length = 100)
	public String getMailId() {
		return this.mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Column(name = "phone", length = 100)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "mobile1")
	public Long getMobile1() {
		return this.mobile1;
	}

	public void setMobile1(Long mobile1) {
		this.mobile1 = mobile1;
	}

	@Column(name = "mobile2")
	public Long getMobile2() {
		return this.mobile2;
	}

	public void setMobile2(Long mobile2) {
		this.mobile2 = mobile2;
	}

	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}