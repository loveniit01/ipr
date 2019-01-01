package com.ipr.dao.security;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.AppUser;
 
@Repository
@Transactional
public class AppUserDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    public AppUser findUserAccount(String userName) {
        try {
            String sql = "Select e from " + AppUser.class.getName() + " e " //
                    + " Where e.userName = :userName ";
 
            Query query = entityManager.createQuery(sql, AppUser.class);
            query.setParameter("userName", userName);
 
            return (AppUser) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public Long saveData(AppUser appUser)
	{
		entityManager.persist(appUser);
		entityManager.flush();
		return appUser.getUserId();
	}
 
    public List<AppUser> getAlluser()
    {
    	String sql = "Select e from " + AppUser.class.getName() + " e order by e.userId desc"  ;
    	Query query = entityManager.createQuery(sql, AppUser.class);
    	return  query.getResultList();
    }
    
}
