package com.ipr.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.ipr.entity.other.WhitelistData;

public interface WhitelistDataDao extends CrudRepository<WhitelistData, Long> {
	public List<WhitelistData> allData();
	public List<String> allDomain();
}
