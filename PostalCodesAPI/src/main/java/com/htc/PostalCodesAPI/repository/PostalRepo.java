package com.htc.PostalCodesAPI.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.htc.PostalCodesAPI.model.SuburbsCodes;
@Repository
public interface PostalRepo extends CrudRepository<SuburbsCodes, Integer>{
	/*
	 * Native query to fetch data between the given range
	 */
	@Query(value="select * from POSTALCODES p where p.code between :start and :end ", nativeQuery=true)
	List<SuburbsCodes> findByRange(@Param("start") int start,@Param("end")int end);
	
}
