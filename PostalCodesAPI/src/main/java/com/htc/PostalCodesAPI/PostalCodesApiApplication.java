package com.htc.PostalCodesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * 
 * @author Srinivasu Kanchumarthi
 * Data: 18-Oct-2022
 * JDK 1.8
 * Database : H2 and url :JDBC URL :jdbc:h2:mem:postal_details
 * APIS Provided: 2 
 * API - 1:http://localhost:8080/getCities?startcode=1&endcode=999999 Method: POST
 * API - 2: http://localhost:8080/storeData Method : GET
 */
@SpringBootApplication
public class PostalCodesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostalCodesApiApplication.class, args);
	}

}
