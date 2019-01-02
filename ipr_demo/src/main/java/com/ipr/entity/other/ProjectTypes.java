package com.ipr.entity.other;
// Generated 28 Dec, 2018 2:44:56 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ProjectTypes generated by hbm2java
 */
@Entity
@Table(name = "project_types", catalog = "ipr_data", uniqueConstraints = @UniqueConstraint(columnNames = "project_type"))
public class ProjectTypes implements java.io.Serializable {

	private int id;
//	private long accountId;
	private String projectType;

	public ProjectTypes() {
	}

	public ProjectTypes(int id,  String projectType) {
		this.id = id;
//		this.accountId = accountId;
		this.projectType = projectType;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	@Column(name = "project_type", unique = true, nullable = false, length = 50)
	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

}
