package com.revature.ws;

import javax.jws.WebService;

import com.revature.pojo.Person;

@WebService(endpointInterface = "com.revature.ws.PersonService", serviceName = "personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public String addPerson(Person person) {
		String result = "Adding " + person.getPersonName() + " ro our databse.";
		System.out.println(result);
		return result;
	}

	@Override
	public boolean updateAge(Person person, int newAge) {

		if (newAge >= 1 && newAge < 150) {
			System.out.println("Age updated successfully.");
			return true;
		} else {
			System.out.println("Age should be between 1 and 150");
			return false;

		}

	}

	@Override
	public String updatePersonName(Person person, String newName) {
		String result = person.getPersonName() + ", updated to " + newName;
		return result;
	}

}
