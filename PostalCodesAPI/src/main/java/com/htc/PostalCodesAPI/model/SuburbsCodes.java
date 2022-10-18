package com.htc.PostalCodesAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * Class to persist postal codes and city names in database with table name:POSTALCODES
 */
@Entity
@Table(name="POSTALCODES")
public class SuburbsCodes {
	private String city;
	@Id
	private int code;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "SuburbsCodes [city=" + city + ", code=" + code + "]";
	}
	
	
}
