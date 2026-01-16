package entity;

import java.time.LocalDate;

public class Employee {
	private int idEmp;
	private String lastName;
	private String firstName;
	private LocalDate dob;
	private boolean gender;
	private	String Address;
	private String phoneNb;
	private String userName;
	private int idMng;
	
	public Employee(){}
	
	public Employee(int idEmp, String lastName, String firstName, LocalDate dob, boolean gender, String address,
			String phoneNb, String userName, int idMng) {
		this.idEmp = idEmp;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
		this.gender = gender;
		Address = address;
		this.phoneNb = phoneNb;
		this.userName = userName;
		this.idMng = idMng;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getIdMng() {
		return idMng;
	}

	public void setIdMng(int idMng) {
		this.idMng = idMng;
	}
	
	
	
}
