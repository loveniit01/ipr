package com.ipr.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipr.entity.other.GreylistData;
import com.ipr.entity.other.WhitelistData;

@Repository
@Transactional
public class GreylistDataDaoImpl implements GreylistDataDao {

	@Override
	public <S extends GreylistData> S save(S entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		return null;
	}

	@Autowired
	private EntityManager entityManager;

	@Override
	public <S extends GreylistData> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GreylistData> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<GreylistData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<GreylistData> findAllById(Iterable<Long> ids) {
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
	public void delete(GreylistData entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends GreylistData> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<GreylistData> allData() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select gd from " + GreylistData.class.getName() + " gd");
		
		List<GreylistData> greylist = query.getResultList();

		return greylist;

	}

	@Override
	public List<String> allDomain() {
		// TODO Auto-generated method stub

		Query query = entityManager.createQuery("select gd.domainName from " + GreylistData.class.getName() + " gd");

		List<String> greylistDomain = query.getResultList();

		return greylistDomain;

	}

}
