package com.ipr.entity.other;
// Generated 28 Dec, 2018 2:44:56 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AppUserDetailsId generated by hbm2java
 */
@Embeddable
public class AppUserDetailsId implements java.io.Serializable {

	private long userIdId;
	private String userFirstName;
	private String userLastName;
	private String mailIdOfc;
	private String mailIdPersonal;
	private Long mobileNo;
	private Long phoneNo;
	private Short dobYear;
	private Byte dobMonth;
	private Byte dobDate;
	private Short dojYear;
	private Byte dojMonth;
	private Byte dojDate;
	private String idType;
	private String idNumber;
	private String fatherName;
	private Long fatherMobileNo;
	private Long homePhoneNo;
	private String address;
	private String bloodGroup;
	private long createdBy;
	private Date createdDate;
	private Date disableDate;
	private long disableBy;

	public AppUserDetailsId() {
	}

	public AppUserDetailsId(long userIdId, long createdBy, long disableBy) {
		this.userIdId = userIdId;
		this.createdBy = createdBy;
		this.disableBy = disableBy;
	}

	public AppUserDetailsId(long userIdId, String userFirstName, String userLastName, String mailIdOfc,
			String mailIdPersonal, Long mobileNo, Long phoneNo, Short dobYear, Byte dobMonth, Byte dobDate,
			Short dojYear, Byte dojMonth, Byte dojDate, String idType, String idNumber, String fatherName,
			Long fatherMobileNo, Long homePhoneNo, String address, String bloodGroup, long createdBy, Date createdDate,
			Date disableDate, long disableBy) {
		this.userIdId = userIdId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.mailIdOfc = mailIdOfc;
		this.mailIdPersonal = mailIdPersonal;
		this.mobileNo = mobileNo;
		this.phoneNo = phoneNo;
		this.dobYear = dobYear;
		this.dobMonth = dobMonth;
		this.dobDate = dobDate;
		this.dojYear = dojYear;
		this.dojMonth = dojMonth;
		this.dojDate = dojDate;
		this.idType = idType;
		this.idNumber = idNumber;
		this.fatherName = fatherName;
		this.fatherMobileNo = fatherMobileNo;
		this.homePhoneNo = homePhoneNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.disableDate = disableDate;
		this.disableBy = disableBy;
	}

	@Column(name = "USER_ID_ID", unique = true, nullable = false)
	public long getUserIdId() {
		return this.userIdId;
	}

	public void setUserIdId(long userIdId) {
		this.userIdId = userIdId;
	}

	@Column(name = "user_first_name", length = 50)
	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	@Column(name = "user_last_name", length = 50)
	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	@Column(name = "mail_id_ofc", unique = true, length = 50)
	public String getMailIdOfc() {
		return this.mailIdOfc;
	}

	public void setMailIdOfc(String mailIdOfc) {
		this.mailIdOfc = mailIdOfc;
	}

	@Column(name = "mail_id_personal", unique = true, length = 50)
	public String getMailIdPersonal() {
		return this.mailIdPersonal;
	}

	public void setMailIdPersonal(String mailIdPersonal) {
		this.mailIdPersonal = mailIdPersonal;
	}

	@Column(name = "mobile_no", unique = true)
	public Long getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "phone_no")
	public Long getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "dob_year")
	public Short getDobYear() {
		return this.dobYear;
	}

	public void setDobYear(Short dobYear) {
		this.dobYear = dobYear;
	}

	@Column(name = "dob_month")
	public Byte getDobMonth() {
		return this.dobMonth;
	}

	public void setDobMonth(Byte dobMonth) {
		this.dobMonth = dobMonth;
	}

	@Column(name = "dob_date")
	public Byte getDobDate() {
		return this.dobDate;
	}

	public void setDobDate(Byte dobDate) {
		this.dobDate = dobDate;
	}

	@Column(name = "doj_year")
	public Short getDojYear() {
		return this.dojYear;
	}

	public void setDojYear(Short dojYear) {
		this.dojYear = dojYear;
	}

	@Column(name = "doj_month")
	public Byte getDojMonth() {
		return this.dojMonth;
	}

	public void setDojMonth(Byte dojMonth) {
		this.dojMonth = dojMonth;
	}

	@Column(name = "doj_date")
	public Byte getDojDate() {
		return this.dojDate;
	}

	public void setDojDate(Byte dojDate) {
		this.dojDate = dojDate;
	}

	@Column(name = "id_type", length = 50)
	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	@Column(name = "id_number", length = 50)
	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Column(name = "father_name", length = 100)
	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "father_mobile_no")
	public Long getFatherMobileNo() {
		return this.fatherMobileNo;
	}

	public void setFatherMobileNo(Long fatherMobileNo) {
		this.fatherMobileNo = fatherMobileNo;
	}

	@Column(name = "home_phone_no")
	public Long getHomePhoneNo() {
		return this.homePhoneNo;
	}

	public void setHomePhoneNo(Long homePhoneNo) {
		this.homePhoneNo = homePhoneNo;
	}

	@Column(name = "address", length = 750)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "blood_group", length = 3)
	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "disable_date", length = 19)
	public Date getDisableDate() {
		return this.disableDate;
	}

	public void setDisableDate(Date disableDate) {
		this.disableDate = disableDate;
	}

	@Column(name = "disable_by", nullable = false)
	public long getDisableBy() {
		return this.disableBy;
	}

	public void setDisableBy(long disableBy) {
		this.disableBy = disableBy;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AppUserDetailsId))
			return false;
		AppUserDetailsId castOther = (AppUserDetailsId) other;

		return (this.getUserIdId() == castOther.getUserIdId())
				&& ((this.getUserFirstName() == castOther.getUserFirstName())
						|| (this.getUserFirstName() != null && castOther.getUserFirstName() != null
								&& this.getUserFirstName().equals(castOther.getUserFirstName())))
				&& ((this.getUserLastName() == castOther.getUserLastName())
						|| (this.getUserLastName() != null && castOther.getUserLastName() != null
								&& this.getUserLastName().equals(castOther.getUserLastName())))
				&& ((this.getMailIdOfc() == castOther.getMailIdOfc()) || (this.getMailIdOfc() != null
						&& castOther.getMailIdOfc() != null && this.getMailIdOfc().equals(castOther.getMailIdOfc())))
				&& ((this.getMailIdPersonal() == castOther.getMailIdPersonal())
						|| (this.getMailIdPersonal() != null && castOther.getMailIdPersonal() != null
								&& this.getMailIdPersonal().equals(castOther.getMailIdPersonal())))
				&& ((this.getMobileNo() == castOther.getMobileNo()) || (this.getMobileNo() != null
						&& castOther.getMobileNo() != null && this.getMobileNo().equals(castOther.getMobileNo())))
				&& ((this.getPhoneNo() == castOther.getPhoneNo()) || (this.getPhoneNo() != null
						&& castOther.getPhoneNo() != null && this.getPhoneNo().equals(castOther.getPhoneNo())))
				&& ((this.getDobYear() == castOther.getDobYear()) || (this.getDobYear() != null
						&& castOther.getDobYear() != null && this.getDobYear().equals(castOther.getDobYear())))
				&& ((this.getDobMonth() == castOther.getDobMonth()) || (this.getDobMonth() != null
						&& castOther.getDobMonth() != null && this.getDobMonth().equals(castOther.getDobMonth())))
				&& ((this.getDobDate() == castOther.getDobDate()) || (this.getDobDate() != null
						&& castOther.getDobDate() != null && this.getDobDate().equals(castOther.getDobDate())))
				&& ((this.getDojYear() == castOther.getDojYear()) || (this.getDojYear() != null
						&& castOther.getDojYear() != null && this.getDojYear().equals(castOther.getDojYear())))
				&& ((this.getDojMonth() == castOther.getDojMonth()) || (this.getDojMonth() != null
						&& castOther.getDojMonth() != null && this.getDojMonth().equals(castOther.getDojMonth())))
				&& ((this.getDojDate() == castOther.getDojDate()) || (this.getDojDate() != null
						&& castOther.getDojDate() != null && this.getDojDate().equals(castOther.getDojDate())))
				&& ((this.getIdType() == castOther.getIdType()) || (this.getIdType() != null
						&& castOther.getIdType() != null && this.getIdType().equals(castOther.getIdType())))
				&& ((this.getIdNumber() == castOther.getIdNumber()) || (this.getIdNumber() != null
						&& castOther.getIdNumber() != null && this.getIdNumber().equals(castOther.getIdNumber())))
				&& ((this.getFatherName() == castOther.getFatherName()) || (this.getFatherName() != null
						&& castOther.getFatherName() != null && this.getFatherName().equals(castOther.getFatherName())))
				&& ((this.getFatherMobileNo() == castOther.getFatherMobileNo())
						|| (this.getFatherMobileNo() != null && castOther.getFatherMobileNo() != null
								&& this.getFatherMobileNo().equals(castOther.getFatherMobileNo())))
				&& ((this.getHomePhoneNo() == castOther.getHomePhoneNo())
						|| (this.getHomePhoneNo() != null && castOther.getHomePhoneNo() != null
								&& this.getHomePhoneNo().equals(castOther.getHomePhoneNo())))
				&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
				&& ((this.getBloodGroup() == castOther.getBloodGroup()) || (this.getBloodGroup() != null
						&& castOther.getBloodGroup() != null && this.getBloodGroup().equals(castOther.getBloodGroup())))
				&& (this.getCreatedBy() == castOther.getCreatedBy())
				&& ((this.getCreatedDate() == castOther.getCreatedDate())
						|| (this.getCreatedDate() != null && castOther.getCreatedDate() != null
								&& this.getCreatedDate().equals(castOther.getCreatedDate())))
				&& ((this.getDisableDate() == castOther.getDisableDate())
						|| (this.getDisableDate() != null && castOther.getDisableDate() != null
								&& this.getDisableDate().equals(castOther.getDisableDate())))
				&& (this.getDisableBy() == castOther.getDisableBy());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getUserIdId();
		result = 37 * result + (getUserFirstName() == null ? 0 : this.getUserFirstName().hashCode());
		result = 37 * result + (getUserLastName() == null ? 0 : this.getUserLastName().hashCode());
		result = 37 * result + (getMailIdOfc() == null ? 0 : this.getMailIdOfc().hashCode());
		result = 37 * result + (getMailIdPersonal() == null ? 0 : this.getMailIdPersonal().hashCode());
		result = 37 * result + (getMobileNo() == null ? 0 : this.getMobileNo().hashCode());
		result = 37 * result + (getPhoneNo() == null ? 0 : this.getPhoneNo().hashCode());
		result = 37 * result + (getDobYear() == null ? 0 : this.getDobYear().hashCode());
		result = 37 * result + (getDobMonth() == null ? 0 : this.getDobMonth().hashCode());
		result = 37 * result + (getDobDate() == null ? 0 : this.getDobDate().hashCode());
		result = 37 * result + (getDojYear() == null ? 0 : this.getDojYear().hashCode());
		result = 37 * result + (getDojMonth() == null ? 0 : this.getDojMonth().hashCode());
		result = 37 * result + (getDojDate() == null ? 0 : this.getDojDate().hashCode());
		result = 37 * result + (getIdType() == null ? 0 : this.getIdType().hashCode());
		result = 37 * result + (getIdNumber() == null ? 0 : this.getIdNumber().hashCode());
		result = 37 * result + (getFatherName() == null ? 0 : this.getFatherName().hashCode());
		result = 37 * result + (getFatherMobileNo() == null ? 0 : this.getFatherMobileNo().hashCode());
		result = 37 * result + (getHomePhoneNo() == null ? 0 : this.getHomePhoneNo().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getBloodGroup() == null ? 0 : this.getBloodGroup().hashCode());
		result = 37 * result + (int) this.getCreatedBy();
		result = 37 * result + (getCreatedDate() == null ? 0 : this.getCreatedDate().hashCode());
		result = 37 * result + (getDisableDate() == null ? 0 : this.getDisableDate().hashCode());
		result = 37 * result + (int) this.getDisableBy();
		return result;
	}

}
