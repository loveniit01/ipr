package com.ipr.form;

import org.springframework.web.multipart.MultipartFile;

public class MyUploadForm {

	public MyUploadForm() {
		// TODO Auto-generated constructor stub
	}
	private String description;
	 
    // Upload files.
    private MultipartFile[] fileDatas;
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public MultipartFile[] getFileDatas() {
        return fileDatas;
    }
 
    public void setFileDatas(MultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }
 

    String c_date1, c_date2;
    Long user_id, account_id, projectType_id, project_id;

	public String getC_date1() {
		return c_date1;
	}

	public void setC_date1(String c_date1) {
		this.c_date1 = c_date1;
	}

	public String getC_date2() {
		return c_date2;
	}

	public void setC_date2(String c_date2) {
		this.c_date2 = c_date2;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getProjectType_id() {
		return projectType_id;
	}

	public void setProjectType_id(Long projectType_id) {
		this.projectType_id = projectType_id;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}
    
    
    
    
}
