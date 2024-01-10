package com.feujiCompany.DTO;

import org.hibernate.validator.constraints.NotEmpty;

public class Application {

	@NotEmpty(message = "name is mandatory")
	private String firstName;
	private String lastName;
	private long mblNo;
	private String email;
	private String education;
	private double percentage;
	private String location;
	
	
	public Application() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getMblNo() {
		return mblNo;
	}
	public void setMblNo(long mblNo) {
		this.mblNo = mblNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Application [firstName=" + firstName + ", lastName=" + lastName + ", mblNo=" + mblNo + ", email="
				+ email + ", education=" + education + ", percentage=" + percentage + ", location=" + location + "]";
	}
	
	
	
	
}
