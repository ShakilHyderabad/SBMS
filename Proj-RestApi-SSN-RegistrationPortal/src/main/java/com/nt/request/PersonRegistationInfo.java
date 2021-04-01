package com.nt.request;

public class PersonRegistationInfo {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String DOB;
	private String state;
	
	public PersonRegistationInfo() {
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "PersonRegistationInfo [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", DOB=" + DOB + ", state=" + state + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
