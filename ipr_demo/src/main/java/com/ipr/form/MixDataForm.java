/**
 * 
 */
package com.ipr.form;

/**
 * @author CBEC PROJECT
 *
 */
public class MixDataForm {

	/**
	 * 
	 */
	public MixDataForm() {
		// TODO Auto-generated constructor stub
	}

	String user_id;
	Long user_type;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Long getUser_type() {
		return user_type;
	}

	public void setUser_type(Long user_type) {
		this.user_type = user_type;
	}

	long id, created_by, deleted_by;
	Byte deleted;
	String domain_name, created_date, deleted_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public long getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(long deleted_by) {
		this.deleted_by = deleted_by;
	}

	public Byte getDeleted() {
		return deleted;
	}

	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	public String getDomain_name() {
		return domain_name;
	}

	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getDeleted_date() {
		return deleted_date;
	}

	public void setDeleted_date(String deleted_date) {
		this.deleted_date = deleted_date;
	}

}
