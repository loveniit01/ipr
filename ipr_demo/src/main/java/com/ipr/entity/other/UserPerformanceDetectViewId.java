package com.ipr.entity.other;
// Generated 26 Dec, 2018 5:16:16 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserPerformanceDetectViewId generated by hbm2java
 */
@Embeddable
public class UserPerformanceDetectViewId implements java.io.Serializable {

	private Long userIdId;
	private String userFirstName;
	private String userLastName;
	private Date workDate;
	private int infringingCount;
	private int sourceCount;
	private int ytCount;
	private int fbCount;
	private int instaCount;
	private int twitterCount;
	private int wlCount;
	private int glCount;
	private int invalidCount;

	public UserPerformanceDetectViewId() {
	}

	public UserPerformanceDetectViewId(int infringingCount, int sourceCount, int ytCount, int fbCount, int instaCount,
			int twitterCount, int wlCount, int glCount, int invalidCount) {
		this.infringingCount = infringingCount;
		this.sourceCount = sourceCount;
		this.ytCount = ytCount;
		this.fbCount = fbCount;
		this.instaCount = instaCount;
		this.twitterCount = twitterCount;
		this.wlCount = wlCount;
		this.glCount = glCount;
		this.invalidCount = invalidCount;
	}

	public UserPerformanceDetectViewId(Long userIdId, String userFirstName, String userLastName, Date workDate,
			int infringingCount, int sourceCount, int ytCount, int fbCount, int instaCount, int twitterCount,
			int wlCount, int glCount, int invalidCount) {
		this.userIdId = userIdId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.workDate = workDate;
		this.infringingCount = infringingCount;
		this.sourceCount = sourceCount;
		this.ytCount = ytCount;
		this.fbCount = fbCount;
		this.instaCount = instaCount;
		this.twitterCount = twitterCount;
		this.wlCount = wlCount;
		this.glCount = glCount;
		this.invalidCount = invalidCount;
	}

	@Column(name = "USER_ID_ID")
	public Long getUserIdId() {
		return this.userIdId;
	}

	public void setUserIdId(Long userIdId) {
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

	@Column(name = "work_date", length = 10)
	public Date getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	@Column(name = "infringing_count", nullable = false)
	public int getInfringingCount() {
		return this.infringingCount;
	}

	public void setInfringingCount(int infringingCount) {
		this.infringingCount = infringingCount;
	}

	@Column(name = "source_count", nullable = false)
	public int getSourceCount() {
		return this.sourceCount;
	}

	public void setSourceCount(int sourceCount) {
		this.sourceCount = sourceCount;
	}

	@Column(name = "yt_count", nullable = false)
	public int getYtCount() {
		return this.ytCount;
	}

	public void setYtCount(int ytCount) {
		this.ytCount = ytCount;
	}

	@Column(name = "fb_count", nullable = false)
	public int getFbCount() {
		return this.fbCount;
	}

	public void setFbCount(int fbCount) {
		this.fbCount = fbCount;
	}

	@Column(name = "insta_count", nullable = false)
	public int getInstaCount() {
		return this.instaCount;
	}

	public void setInstaCount(int instaCount) {
		this.instaCount = instaCount;
	}

	@Column(name = "twitter_count", nullable = false)
	public int getTwitterCount() {
		return this.twitterCount;
	}

	public void setTwitterCount(int twitterCount) {
		this.twitterCount = twitterCount;
	}

	@Column(name = "wl_count", nullable = false)
	public int getWlCount() {
		return this.wlCount;
	}

	public void setWlCount(int wlCount) {
		this.wlCount = wlCount;
	}

	@Column(name = "gl_count", nullable = false)
	public int getGlCount() {
		return this.glCount;
	}

	public void setGlCount(int glCount) {
		this.glCount = glCount;
	}

	@Column(name = "invalid_count", nullable = false)
	public int getInvalidCount() {
		return this.invalidCount;
	}

	public void setInvalidCount(int invalidCount) {
		this.invalidCount = invalidCount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserPerformanceDetectViewId))
			return false;
		UserPerformanceDetectViewId castOther = (UserPerformanceDetectViewId) other;

		return ((this.getUserIdId() == castOther.getUserIdId()) || (this.getUserIdId() != null
				&& castOther.getUserIdId() != null && this.getUserIdId().equals(castOther.getUserIdId())))
				&& ((this.getUserFirstName() == castOther.getUserFirstName())
						|| (this.getUserFirstName() != null && castOther.getUserFirstName() != null
								&& this.getUserFirstName().equals(castOther.getUserFirstName())))
				&& ((this.getUserLastName() == castOther.getUserLastName())
						|| (this.getUserLastName() != null && castOther.getUserLastName() != null
								&& this.getUserLastName().equals(castOther.getUserLastName())))
				&& ((this.getWorkDate() == castOther.getWorkDate()) || (this.getWorkDate() != null
						&& castOther.getWorkDate() != null && this.getWorkDate().equals(castOther.getWorkDate())))
				&& (this.getInfringingCount() == castOther.getInfringingCount())
				&& (this.getSourceCount() == castOther.getSourceCount())
				&& (this.getYtCount() == castOther.getYtCount()) && (this.getFbCount() == castOther.getFbCount())
				&& (this.getInstaCount() == castOther.getInstaCount())
				&& (this.getTwitterCount() == castOther.getTwitterCount())
				&& (this.getWlCount() == castOther.getWlCount()) && (this.getGlCount() == castOther.getGlCount())
				&& (this.getInvalidCount() == castOther.getInvalidCount());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserIdId() == null ? 0 : this.getUserIdId().hashCode());
		result = 37 * result + (getUserFirstName() == null ? 0 : this.getUserFirstName().hashCode());
		result = 37 * result + (getUserLastName() == null ? 0 : this.getUserLastName().hashCode());
		result = 37 * result + (getWorkDate() == null ? 0 : this.getWorkDate().hashCode());
		result = 37 * result + this.getInfringingCount();
		result = 37 * result + this.getSourceCount();
		result = 37 * result + this.getYtCount();
		result = 37 * result + this.getFbCount();
		result = 37 * result + this.getInstaCount();
		result = 37 * result + this.getTwitterCount();
		result = 37 * result + this.getWlCount();
		result = 37 * result + this.getGlCount();
		result = 37 * result + this.getInvalidCount();
		return result;
	}

}
