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
public class WhitelistDataDaoImpl implements WhitelistDataDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public <S extends WhitelistData> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends WhitelistData> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<WhitelistData> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<WhitelistData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<WhitelistData> findAllById(Iterable<Long> ids) {
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
	public void delete(WhitelistData entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends WhitelistData> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<WhitelistData> allData() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select wd from " + WhitelistData.class.getName() + " wd ");

		List<WhitelistData> whitelist = query.getResultList();

		return whitelist;
	}

	@Override
	public List<String> allDomain() {
		// TODO Auto-generated method stub
//		Set<String> whitelistDomain = (Set<String>) entityManager
//				.createQuery("select wd.domainName from " + WhitelistData.class.getName() + " wd");

		Query query = entityManager.createQuery("select wd.domainName from " + WhitelistData.class.getName() + " wd");

		List<String> whitelistDomain = query.getResultList();

		return whitelistDomain;

	}

}
