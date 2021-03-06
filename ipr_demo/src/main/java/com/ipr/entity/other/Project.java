package com.ipr.entity.other;
// Generated 3 Jan, 2019 3:16:32 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.ipr.entity.AppUser;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "project", catalog = "ipr_data", uniqueConstraints = @UniqueConstraint(columnNames = "project_url"))
public class Project implements java.io.Serializable {

	private Long id;
	private Account account;
	private AppUser appUser;
	private ProjectTypes projectTypes;
	private String projectName;
	private String channelName;
	private String projectUrl;
	private String contractUrl;
	private Date createdTime;
	private byte deactivate;
	private Long deactivatedBy;
	private Date deactivatedDate;

	public Project() {
	}

	public Project(Account account, ProjectTypes projectTypes, Date createdTime, byte deactivate) {
		this.account = account;
		this.projectTypes = projectTypes;
		this.createdTime = createdTime;
		this.deactivate = deactivate;
	}

	public Project(Account account, AppUser appUser, ProjectTypes projectTypes, String projectName, String channelName,
			String projectUrl, String contractUrl, Date createdTime, byte deactivate, Long deactivatedBy,
			Date deactivatedDate) {
		this.account = account;
		this.appUser = appUser;
		this.projectTypes = projectTypes;
		this.projectName = projectName;
		this.channelName = channelName;
		this.projectUrl = projectUrl;
		this.contractUrl = contractUrl;
		this.createdTime = createdTime;
		this.deactivate = deactivate;
		this.deactivatedBy = deactivatedBy;
		this.deactivatedDate = deactivatedDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by")
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_types_id", nullable = false)
	public ProjectTypes getProjectTypes() {
		return this.projectTypes;
	}

	public void setProjectTypes(ProjectTypes projectTypes) {
		this.projectTypes = projectTypes;
	}

	@Column(name = "project_name", length = 250)
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "channel_name", length = 250)
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Column(name = "project_url", unique = true, length = 250)
	public String getProjectUrl() {
		return this.projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	@Column(name = "contract_url", length = 250)
	public String getContractUrl() {
		return this.contractUrl;
	}

	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_time", length = 19, nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	
	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@Column(name = "deactivate", nullable = false)
	public byte getDeactivate() {
		return this.deactivate;
	}

	public void setDeactivate(byte deactivate) {
		this.deactivate = deactivate;
	}

	@Column(name = "deactivated_by")
	public Long getDeactivatedBy() {
		return this.deactivatedBy;
	}

	public void setDeactivatedBy(Long deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deactivated_date", length = 19)
	public Date getDeactivatedDate() {
		return this.deactivatedDate;
	}

	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}

}
