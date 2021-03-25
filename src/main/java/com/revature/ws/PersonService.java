package com.revature.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.pojo.Person;

@WebService
public interface PersonService {

	@WebMethod
	String addPerson(Person person);
	
	@WebMethod
	boolean updateAge(Person person, int newAge);
	
	@WebMethod
	String updatePersonName(Person person, String newName);
}
