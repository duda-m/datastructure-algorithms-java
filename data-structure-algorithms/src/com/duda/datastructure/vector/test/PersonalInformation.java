package com.duda.datastructure.vector.test;

public class PersonalInformation {

	private String name;
	private String number;
	private String email;
	
	
	
	public PersonalInformation(String name, String phone, String email) {
		super();
		this.name = name;
		this.number = phone;
		this.email = email;
	}

	public PersonalInformation() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return number;
	}
	public void setPhone(String phone) {
		this.number = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonalInformation [name=" + name + ", number=" + number + ", email=" + email + "]";
	}
	
	
}
