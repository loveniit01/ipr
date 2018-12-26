/**
 * 
 */
package com.ipr.dao;

import org.springframework.data.repository.CrudRepository;

import com.ipr.entity.other.UploadData;


/**
 * @author CBEC PROJECT
 *
 */
public interface UploadDataDao extends CrudRepository<UploadData, Long> {
	

}
