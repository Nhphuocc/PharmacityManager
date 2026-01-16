package entity;

import java.time.*;

public class Customer {
	private int idCus;
	private String lastName;
	private String firstName;
	private LocalDate dob;
	private boolean gender;
	private	String Address;
	private String phoneNb;
	
	public Customer() {}
	
	public Customer(int idCus, String lastName, String firstName, LocalDate dob, boolean gender, String address,
			String phoneNb) {
		this.idCus = idCus;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
		this.gender = gender;
		Address = address;
		this.phoneNb = phoneNb;
	}

	public int getIdCus() {
		return idCus;
	}

	public void setIdCus(int idCus) {
		this.idCus = idCus;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNb() {
		return phoneNb;
	}

	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}
	
	
}
