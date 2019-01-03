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

@Repository
@Transactional
public class AccountDao {

	public AccountDao() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	EntityManager entityManager;
	
	public List<Account> getAllAccount()
    {
    	String sql = "Select e from " + Account.class.getName() + " e order by e.id desc"  ;
    	Query query = entityManager.createQuery(sql, Account.class);
    	return  query.getResultList();
    }
	
	public Account findAccount(Long id) {
        try {
            String sql = "Select e from " + Account.class.getName() + " e " //
                    + " Where e.id = :id ";
 
            Query query = entityManager.createQuery(sql, Account.class);
            query.setParameter("id", id);
 
            return  (Account) query.getSingleResult();
        } catch (NoResultException e) {
        	e.printStackTrace();
            return null;
        }
    }
	
}
