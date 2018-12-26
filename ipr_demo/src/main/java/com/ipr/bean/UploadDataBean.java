package com.ipr.bean;

import java.util.Date;

public class UploadDataBean {

	public UploadDataBean() {
		// TODO Auto-generated constructor stub
	}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getSourceLink() {
		return sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	public String getNote1() {
		return note1;
	}

	public void setNote1(String note1) {
		this.note1 = note1;
	}

	public String getNote2() {
		return note2;
	}

	public void setNote2(String note2) {
		this.note2 = note2;
	}

	public String getNote3() {
		return note3;
	}

	public void setNote3(String note3) {
		this.note3 = note3;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public byte getLinkType() {
		return linkType;
	}

	public void setLinkType(byte linkType) {
		this.linkType = linkType;
	}

	public byte getIsManual() {
		return isManual;
	}

	public void setIsManual(byte isManual) {
		this.isManual = isManual;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProjectType() {
		return projectType;
	}

	public void setProjectType(Integer projectType) {
		this.projectType = projectType;
	}

}
