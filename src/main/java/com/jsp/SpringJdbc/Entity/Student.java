package com.jsp.SpringJdbc.Entity;
 
public class Student {
	private String USN;
	private String Name;
	private String City;
	public String getUSN() {
		return USN;
	}
	public String getName() {
		return Name;
	}
	public String getCity() {
		return City;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setCity(String city) {
		City = city;
	}
	public Student() {
	}
	public Student(String uSN, String name, String city) {
		super();
		USN = uSN;
		Name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Student [USN=" + USN + ", Name=" + Name + ", City=" + City + "]";
	}


 
}