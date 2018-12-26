package com.ipr.entity.other;
// Generated 26 Dec, 2018 5:16:16 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UploadDataViewPmqc generated by hbm2java
 */
@Entity
@Table(name = "upload_data_view_pmqc", catalog = "ipr_data")
public class UploadDataViewPmqc implements java.io.Serializable {

	private UploadDataViewPmqcId id;

	public UploadDataViewPmqc() {
	}

	public UploadDataViewPmqc(UploadDataViewPmqcId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "link", column = @Column(name = "link", nullable = false, length = 250)),
			@AttributeOverride(name = "domainName", column = @Column(name = "domain_name", nullable = false, length = 50)),
			@AttributeOverride(name = "sourceLink", column = @Column(name = "source_link", nullable = false, length = 250)),
			@AttributeOverride(name = "projectId", column = @Column(name = "project_id", nullable = false)),
			@AttributeOverride(name = "projectName", column = @Column(name = "project_name", length = 250)),
			@AttributeOverride(name = "channelName", column = @Column(name = "channel_name", length = 250)),
			@AttributeOverride(name = "projectUrl", column = @Column(name = "project_url", length = 250)),
			@AttributeOverride(name = "projectType", column = @Column(name = "project_type", nullable = false, length = 50)),
			@AttributeOverride(name = "accountName", column = @Column(name = "account_name", length = 250)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id")),
			@AttributeOverride(name = "userFirstName", column = @Column(name = "user_first_name", length = 50)),
			@AttributeOverride(name = "userLastName", column = @Column(name = "user_last_name", length = 50)) })
	public UploadDataViewPmqcId getId() {
		return this.id;
	}

	public void setId(UploadDataViewPmqcId id) {
		this.id = id;
	}

}