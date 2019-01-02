package com.ipr.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.form.MyDownloadFile;

@Repository
@Transactional
public class DownloadDataDao {

	public DownloadDataDao() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EntityManager entityManager;

	public List<Object[]> getalldata(String cur_date) {
		String sqlString = "select ud.id, ud.link, ud.domain_name, ud.project_id, pro.project_name, pro.channel_name, pt.project_type, acc.account_name, pro.project_url, au.USER_NAME, ud.upload_time, ud.note1, ud.note2, ud.note3, ud.is_whitelist, ud.is_greylist from upload_data ud, app_user au, project pro, project_types pt, account acc where ud.user_id = au.USER_ID and ud.project_id = pro.id and pro.project_types_id = pt.id and pro.account_id = acc.id and date(ud.upload_time)=:cur_date";
		Query query = entityManager.createNativeQuery(sqlString);
		
		query.setParameter("cur_date", cur_date);
		
				
		
		
		return query.getResultList();

	}
}
