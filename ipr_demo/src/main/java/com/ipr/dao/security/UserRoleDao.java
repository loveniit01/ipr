package com.ipr.dao.security;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.UserRole;

@Repository
@Transactional
public class UserRoleDao {

	public UserRoleDao() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private EntityManager entityManager;

	public Long saveData(UserRole userRole) {
		entityManager.persist(userRole);
		entityManager.flush();
		return userRole.getId();
	}
}
