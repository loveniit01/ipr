package com.ipr.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.ipr.entity.other.GreylistData;

public interface GreylistDataDao extends CrudRepository<GreylistData, Long> {

	public List<GreylistData> allData();
	public List<String> allDomain();
}
