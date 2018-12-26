package com.ipr.dao;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.other.UploadData;


@Repository
@Transactional
public class UploadDataDaoImpl implements UploadDataDao {

	public UploadDataDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    private EntityManager entityManager;

	@Override
	public <S extends UploadData> S save(S entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		return null;
	}

	@Override
	public <S extends UploadData> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UploadData> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UploadData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UploadData> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UploadData entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UploadData> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	

}
