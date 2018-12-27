package com.ipr.entity.other;
// Generated 27 Dec, 2018 5:15:44 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.ipr.entity.AppUser;

/**
 * AppUserDetails generated by hbm2java
 */
@Entity
@Table(name = "app_user_details", catalog = "ipr_data", uniqueConstraints = {
		@UniqueConstraint(columnNames = "mail_id_ofc"), @UniqueConstraint(columnNames = "mail_id_personal"),
		@UniqueConstraint(columnNames = "mobile_no"), @UniqueConstraint(columnNames = "USER_ID_ID") })
public class AppUserDetails implements java.io.Serializable {

	private AppUserDetailsId id;
	private AppUser appUser;

	public AppUserDetails() {
	}

	public AppUserDetails(AppUserDetailsId id, AppUser appUser) {
		this.id = id;
		this.appUser = appUser;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userIdId", column = @Column(name = "USER_ID_ID", unique = true, nullable = false)),
			@AttributeOverride(name = "userFirstName", column = @Column(name = "user_first_name", length = 50)),
			@AttributeOverride(name = "userLastName", column = @Column(name = "user_last_name", length = 50)),
			@AttributeOverride(name = "mailIdOfc", column = @Column(name = "mail_id_ofc", unique = true, length = 50)),
			@AttributeOverride(name = "mailIdPersonal", column = @Column(name = "mail_id_personal", unique = true, length = 50)),
			@AttributeOverride(name = "mobileNo", column = @Column(name = "mobile_no", unique = true)),
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
			@AttributeOverride(name = "createdDate", column = @Column(name = "created_date", length = 19)),
			@AttributeOverride(name = "disableDate", column = @Column(name = "disable_date", length = 19)),
			@AttributeOverride(name = "disableBy", column = @Column(name = "disable_by", nullable = false)) })
	public AppUserDetailsId getId() {
		return this.id;
	}

	public void setId(AppUserDetailsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID_ID", unique = true, nullable = false, insertable = false, updatable = false)
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

}
