package com.ipr.form;

import java.util.Date;

import com.ipr.entity.AppUser;
import com.ipr.entity.other.Account;
import com.ipr.entity.other.ProjectTypes;

public class MyProject {

	public MyProject() {
		// TODO Auto-generated constructor stub
	}
	
	private Long id;
	private Long accountId;
//	private AppUser appUser;
	private int projectTypesId;
	private String projectName;
	private String channelName;
	private String projectUrl;
	private String contractUrl;
	private Date createdTime;
	private byte deactivate;
	private Long deactivatedBy;
	private Date deactivatedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	public int getProjectTypesId() {
		return projectTypesId;
	}
	public void setProjectTypesId(int projectTypesId) {
		this.projectTypesId = projectTypesId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public String getContractUrl() {
		return contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public byte getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(byte deactivate) {
		this.deactivate = deactivate;
	}
	public Long getDeactivatedBy() {
		return deactivatedBy;
	}
	public void setDeactivatedBy(Long deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}
	public Date getDeactivatedDate() {
		return deactivatedDate;
	}
	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}
	
	


}
