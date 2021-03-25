package com.revature.pojo;

public class Person {

	private String personName;
	private int personAge;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person(String personName, int personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public int getPersonAge() {
		return personAge;
	}



	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}



	@Override
	public String toString() {
		return "Person [Name=" + personName + ", Age=" + personAge + "]";
	}
	
	
	
}
