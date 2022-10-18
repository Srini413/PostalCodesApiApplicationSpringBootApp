package com.htc.PostalCodesAPI.model;

import java.util.List;

import org.springframework.stereotype.Component;
/*
 * Class to return data to the client in the form of cities list and char count as variables
 */
@Component
public class SubUrbCities {
private List<String> cities;
private int count;
public List<String> getCities() {
	return cities;
}
public void setCities(List<String> cities) {
	this.cities = cities;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "SortedSuborbCodes [cities=" + cities + ", count=" + count + "]";
}


}
