package com.ipr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.AppUser;
import com.ipr.entity.other.Account;
import com.ipr.entity.other.ProjectTypes;

@Repository
@Transactional
public class ProjectTypesDao {

	public ProjectTypesDao() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EntityManager entityManager;
	
	public List<ProjectTypes> getAllProjectTypes()
    {
    	String sql = "Select e from " + ProjectTypes.class.getName() + " e order by e.id desc"  ;
    	Query query = entityManager.createQuery(sql, ProjectTypes.class);
    	return  query.getResultList();
    }
	
	public ProjectTypes findProjectType(int id) {
        try {
            String sql = "Select e from " + ProjectTypes.class.getName() + " e " //
                    + " Where e.id = :id ";
 
            Query query = entityManager.createQuery(sql, ProjectTypes.class);
            query.setParameter("id", id);
 
            return (ProjectTypes) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
	
}
