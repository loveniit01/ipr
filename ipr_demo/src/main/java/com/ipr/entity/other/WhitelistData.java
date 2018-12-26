package com.ipr.entity.other;
// Generated 26 Dec, 2018 5:16:16 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.ipr.entity.AppUser;

/**
 * WhitelistData generated by hbm2java
 */
@Entity
@Table(name = "whitelist_data", catalog = "ipr_data", uniqueConstraints = @UniqueConstraint(columnNames = "domain_name"))
public class WhitelistData implements java.io.Serializable {

	private long id;
	private AppUser appUser;
	private String domainName;
	private Date createdDate;
	private byte deleted;
	private long deletedBy;
	private Date deletedDate;

	public WhitelistData() {
	}

	public WhitelistData(long id, AppUser appUser, String domainName, Date createdDate, byte deleted, long deletedBy) {
		this.id = id;
		this.appUser = appUser;
		this.domainName = domainName;
		this.createdDate = createdDate;
		this.deleted = deleted;
		this.deletedBy = deletedBy;
	}

	public WhitelistData(long id, AppUser appUser, String domainName, Date createdDate, byte deleted, long deletedBy,
			Date deletedDate) {
		this.id = id;
		this.appUser = appUser;
		this.domainName = domainName;
		this.createdDate = createdDate;
		this.deleted = deleted;
		this.deletedBy = deletedBy;
		this.deletedDate = deletedDate;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by", nullable = false)
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Column(name = "domain_name", unique = true, nullable = false, length = 100)
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "deleted", nullable = false)
	public byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	@Column(name = "deleted_by", nullable = false)
	public long getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(long deletedBy) {
		this.deletedBy = deletedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_date", length = 19)
	public Date getDeletedDate() {
		return this.deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

}
