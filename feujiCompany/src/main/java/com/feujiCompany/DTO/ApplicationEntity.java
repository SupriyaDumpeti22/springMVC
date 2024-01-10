package com.feujiCompany.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="application")
public class ApplicationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotEmpty(message = "required")
	@Column(name="firstName")
	private String firstName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="mblNo")
	private long mblNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="education")
	private String education;
	
	@Column(name="percentage")
	private double percentage;
	
	@Column(name="location")
	private String location;
	
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
		return "ApplicationEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mblNo="
				+ mblNo + ", email=" + email + ", education=" + education + ", percentage=" + percentage + ", location="
				+ location + "]";
	}
	
	
}
