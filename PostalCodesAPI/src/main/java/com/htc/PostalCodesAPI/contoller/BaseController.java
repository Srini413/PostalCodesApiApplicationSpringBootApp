package com.htc.PostalCodesAPI.contoller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.PostalCodesAPI.model.SubUrbCities;
import com.htc.PostalCodesAPI.model.SuburbsCodes;
import com.htc.PostalCodesAPI.repository.PostalRepo;

/*
 * Base controller with to methods for accessing data and writing back data to database
 */

@RestController
public class BaseController {
	@Autowired
	PostalRepo repo;
	
	@Autowired
	SubUrbCities subUrbs;
	/*Name : getCitiesList
	 *Description : Will accept two arguments startcode and startcode from client request and return list of city names in ascending order
	 * and count of all characters in returning list
	 */
	@RequestMapping("/getCities")
	public SubUrbCities getCitiesList(@RequestParam(name = "startcode") int startcode,@RequestParam(name = "endcode") int endcode) {
		int char_sum =0;
		System.out.println( "Range is : "+Integer.valueOf(startcode)+" : "+Integer.valueOf(endcode));
		//Will get list of all data from database
		List<SuburbsCodes> li=repo.findByRange(Integer.valueOf(startcode),Integer.valueOf(endcode));
		
		//Storing cities alone in the list and sorting them in natural order with stream API
		List<String> cityList=li.stream().map(n->n.getCity()).sorted().collect(Collectors.toList());
		
		//Storing sum of all characters in returing list in to varaible Sum
		char_sum=cityList.stream().mapToInt((n)->n.length()).sum();
			
		subUrbs.setCities(cityList);
		subUrbs.setCount(char_sum);
		
		return subUrbs;
	}
	
	/*
	 * MethodName : storeData method type: POST
	 * Description: This method accepts list of postal codes and suburb cities in JSON format and persists them in in memory m2 database
	 */
	@RequestMapping(value="/storeData",consumes = "application/json",method =RequestMethod.POST )
	public void storeData(@RequestBody List<SuburbsCodes> SuburbsCodes) {
		
		repo.saveAll(SuburbsCodes);

	}
}
