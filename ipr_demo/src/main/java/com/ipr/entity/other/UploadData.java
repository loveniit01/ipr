package com.ipr.entity.other;
// Generated 27 Dec, 2018 5:15:44 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * UploadData generated by hbm2java
 */
@Entity
@Table(name = "upload_data", catalog = "ipr_data", uniqueConstraints = @UniqueConstraint(columnNames = { "link",
		"project_id", "domain_name", "link_type", "is_deleted" }))
public class UploadData implements java.io.Serializable {

	private long id;
	private String link;
	private long projectId;
	private String domainName;
	private String sourceLink;
	private String note1;
	private String note2;
	private String note3;
	private Date uploadTime;
	private byte linkType;
	private byte isManual;
	private Integer userId;
	private Integer projectType;
	private byte isWhitelist;
	private byte isGreyList;
	private int isDeleted;

	public UploadData() {
	}

	public UploadData(long id, String link, long projectId, String domainName, String sourceLink, Date uploadTime,
			byte linkType, byte isManual, byte isWhitelist, byte isGreyList, int isDeleted) {
		this.id = id;
		this.link = link;
		this.projectId = projectId;
		this.domainName = domainName;
		this.sourceLink = sourceLink;
		this.uploadTime = uploadTime;
		this.linkType = linkType;
		this.isManual = isManual;
		this.isWhitelist = isWhitelist;
		this.isGreyList = isGreyList;
		this.isDeleted = isDeleted;
	}

	public UploadData(long id, String link, long projectId, String domainName, String sourceLink, String note1,
			String note2, String note3, Date uploadTime, byte linkType, byte isManual, Integer userId,
			Integer projectType, byte isWhitelist, byte isGreyList, int isDeleted) {
		this.id = id;
		this.link = link;
		this.projectId = projectId;
		this.domainName = domainName;
		this.sourceLink = sourceLink;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		this.uploadTime = uploadTime;
		this.linkType = linkType;
		this.isManual = isManual;
		this.userId = userId;
		this.projectType = projectType;
		this.isWhitelist = isWhitelist;
		this.isGreyList = isGreyList;
		this.isDeleted = isDeleted;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "link", nullable = false, length = 250)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "project_id", nullable = false)
	public long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	@Column(name = "domain_name", nullable = false, length = 50)
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Column(name = "source_link", nullable = false, length = 250)
	public String getSourceLink() {
		return this.sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	@Column(name = "note1", length = 250)
	public String getNote1() {
		return this.note1;
	}

	public void setNote1(String note1) {
		this.note1 = note1;
	}

	@Column(name = "note2", length = 250)
	public String getNote2() {
		return this.note2;
	}

	public void setNote2(String note2) {
		this.note2 = note2;
	}

	@Column(name = "note3", length = 250)
	public String getNote3() {
		return this.note3;
	}

	public void setNote3(String note3) {
		this.note3 = note3;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upload_time", nullable = false, length = 19)
	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	@Column(name = "link_type", nullable = false)
	public byte getLinkType() {
		return this.linkType;
	}

	public void setLinkType(byte linkType) {
		this.linkType = linkType;
	}

	@Column(name = "is_manual", nullable = false)
	public byte getIsManual() {
		return this.isManual;
	}

	public void setIsManual(byte isManual) {
		this.isManual = isManual;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "project_type")
	public Integer getProjectType() {
		return this.projectType;
	}

	public void setProjectType(Integer projectType) {
		this.projectType = projectType;
	}

	@Column(name = "is_whitelist", nullable = false)
	public byte getIsWhitelist() {
		return this.isWhitelist;
	}

	public void setIsWhitelist(byte isWhitelist) {
		this.isWhitelist = isWhitelist;
	}

	@Column(name = "is_greyList", nullable = false)
	public byte getIsGreyList() {
		return this.isGreyList;
	}

	public void setIsGreyList(byte isGreyList) {
		this.isGreyList = isGreyList;
	}

	@Column(name = "is_deleted", nullable = false)
	public int getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}
