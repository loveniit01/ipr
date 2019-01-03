package com.ipr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.other.GreylistData;
import com.ipr.entity.other.Project;

@Repository
@Transactional
public class ProjectDao {

	public ProjectDao() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EntityManager entityManager;

	public List<Project> getAllProject() {
		String sql = "Select e from " + Project.class.getName() + " e order by e.id desc";
		Query query = entityManager.createQuery(sql, Project.class);
		return query.getResultList();
	}

	public <S extends Project> S save(S entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);

		return null;
	}
}
