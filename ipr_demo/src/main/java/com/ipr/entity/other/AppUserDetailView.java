package com.ipr.entity.other;
// Generated 3 Jan, 2019 3:16:32 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AppUserDetailView generated by hbm2java
 */
@Entity
@Table(name = "app_user_detail_view", catalog = "ipr_data")
public class AppUserDetailView implements java.io.Serializable {

	private AppUserDetailViewId id;

	public AppUserDetailView() {
	}

	public AppUserDetailView(AppUserDetailViewId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userIdId", column = @Column(name = "USER_ID_ID", nullable = false)),
			@AttributeOverride(name = "userFirstName", column = @Column(name = "user_first_name", length = 50)),
			@AttributeOverride(name = "userLastName", column = @Column(name = "user_last_name", length = 50)),
			@AttributeOverride(name = "mailIdOfc", column = @Column(name = "mail_id_ofc", length = 50)),
			@AttributeOverride(name = "mailIdPersonal", column = @Column(name = "mail_id_personal", length = 50)),
			@AttributeOverride(name = "mobileNo", column = @Column(name = "mobile_no")),
			@AttributeOverride(name = "phoneNo", column = @Column(name = "phone_no")),
			@AttributeOverride(name = "dobYear", column = @Column(name = "dob_year")),
			@AttributeOverride(name = "dobMonth", column = @Column(name = "dob_month")),
			@AttributeOverride(name = "dobDate", column = @Column(name = "dob_date")),
			@AttributeOverride(name = "dojYear", column = @Column(name = "doj_year")),
			@AttributeOverride(name = "dojMonth", column = @Column(name = "doj_month")),
			@AttributeOverride(name = "dojDate", column = @Column(name = "doj_date")),
			@AttributeOverride(name = "idType", column = @Column(name = "id_type", length = 50)),
			@AttributeOverride(name = "idNumber", column = @Column(name = "id_number", length = 50)),
			@AttributeOverride(name = "fatherName", column = @Column(name = "father_name", length = 100)),
			@AttributeOverride(name = "fatherMobileNo", column = @Column(name = "father_mobile_no")),
			@AttributeOverride(name = "homePhoneNo", column = @Column(name = "home_phone_no")),
			@AttributeOverride(name = "address", column = @Column(name = "address", length = 750)),
			@AttributeOverride(name = "bloodGroup", column = @Column(name = "blood_group", length = 3)),
			@AttributeOverride(name = "createdBy", column = @Column(name = "created_by", nullable = false)),
			@AttributeOverride(name = "createdDate", column = @Column(name = "created_date", nullable = false, length = 19)),
			@AttributeOverride(name = "disableDate", column = @Column(name = "disable_date", length = 19)),
			@AttributeOverride(name = "disableBy", column = @Column(name = "disable_by", nullable = false)),
			@AttributeOverride(name = "userId", column = @Column(name = "USER_ID")),
			@AttributeOverride(name = "userName", column = @Column(name = "USER_NAME", length = 36)),
			@AttributeOverride(name = "encrytedPassword", column = @Column(name = "ENCRYTED_PASSWORD", length = 128)),
			@AttributeOverride(name = "enabled", column = @Column(name = "ENABLED")) })
	public AppUserDetailViewId getId() {
		return this.id;
	}

	public void setId(AppUserDetailViewId id) {
		this.id = id;
	}

}
