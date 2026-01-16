package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.*;

public class CustomerDAO {
	public static void insertCustomerToDb(Customer cus) {
		try (
		        var con = ConnectToDB.getConn();
		        var cs = con.prepareCall("{call InsertCustomer(?,?,?,?,?,?)}");
				) {
		        cs.setString(1, cus.getLastName());
		        cs.setString(2, cus.getFirstName());
		        cs.setDate(3, java.sql.Date.valueOf(cus.getDob()));
		        cs.setBoolean(4, cus.isGender());
		        cs.setString(5, cus.getAddress());
		        cs.setString(6, cus.getPhoneNb());
		        cs.executeUpdate();
		    } catch (Exception e) {
		       
		    }
	}
	public static void updateCustomerInDb(Customer cus) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call UpdateCustomer(?,?,?,?,?,?,?)}");
	    ) {
	        cs.setInt(1, cus.getIdCus());
	        cs.setString(2, cus.getLastName());
	        cs.setString(3, cus.getFirstName());
	        cs.setDate(4, java.sql.Date.valueOf(cus.getDob()));
	        cs.setBoolean(5, cus.isGender());
	        cs.setString(6, cus.getAddress());
	        cs.setString(7, cus.getPhoneNb());
	        cs.executeUpdate();
	    } catch (Exception e) {
	        
	    }
	}
	public static void deleteCustomerFromDb(int idCus) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call DeleteCustomer(?)}");
	    ) {
	        cs.setInt(1, idCus);
	        cs.executeUpdate();
	    } catch (Exception e) {
	      
	    }
	}
	public static List<Customer> searchCustomerById(int idCus) {
	    List<Customer> customers = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call SearchCustomerById(?)}");
	    ) {
	        cs.setInt(1, idCus);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                Customer cus = new Customer();
	                cus.setIdCus(rs.getInt("IdCus"));
	                cus.setLastName(rs.getString("LastName"));
	                cus.setFirstName(rs.getString("FirstName"));
	                cus.setDob(rs.getDate("DateOfBirth").toLocalDate());
	                cus.setGender(rs.getBoolean("Gender"));
	                cus.setAddress(rs.getString("Address"));
	                cus.setPhoneNb(rs.getString("PhoneNumber"));
	                customers.add(cus);
	            }
	        }
	    } catch (Exception e) {
	       
	    }
	    return customers;
	}
	public static List<Customer> searchCustomerByLastName(String lastName) {
	    List<Customer> customers = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call SearchCustomerByLastName(?)}");
	    ) {
	        cs.setString(1, lastName);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                Customer cus = new Customer();
	                cus.setIdCus(rs.getInt("IdCus"));
	                cus.setLastName(rs.getString("LastName"));
	                cus.setFirstName(rs.getString("FirstName"));
	                cus.setDob(rs.getDate("DateOfBirth").toLocalDate());
	                cus.setGender(rs.getBoolean("Gender"));
	                cus.setAddress(rs.getString("Address"));
	                cus.setPhoneNb(rs.getString("PhoneNumber"));
	                customers.add(cus);
	            }
	        }
	    } catch (Exception e) {
	       
	    }
	    return customers;
	}
	public static List<Customer> searchCustomerByBirthYear(int birthYear) {
	    List<Customer> customers = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call SearchCustomerByBirthYear(?)}");
	    ) {
	        cs.setInt(1, birthYear);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                Customer cus = new Customer();
	                cus.setIdCus(rs.getInt("IdCus"));
	                cus.setLastName(rs.getString("LastName"));
	                cus.setFirstName(rs.getString("FirstName"));
	                cus.setDob(rs.getDate("DateOfBirth").toLocalDate());
	                cus.setGender(rs.getBoolean("Gender"));
	                cus.setAddress(rs.getString("Address"));
	                cus.setPhoneNb(rs.getString("PhoneNumber"));
	                customers.add(cus);
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return customers;
	}

	public static List<Customer> getListCus() {
	    List<Customer> listCus = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var stmt = con.createStatement();
	        var rs = stmt.executeQuery("select IdCus, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber from Customers")
	    ) {
	        while (rs.next()) {
	            var cus = new Customer();
	            cus.setIdCus(rs.getInt("IdCus"));
	            cus.setFirstName(rs.getString("FirstName"));
	            cus.setLastName(rs.getString("LastName"));
	            cus.setDob(rs.getDate("DateOfBirth").toLocalDate());
	            cus.setGender(rs.getBoolean("Gender"));
	            cus.setAddress(rs.getString("Address"));
	            cus.setPhoneNb(rs.getString("PhoneNumber"));
	            listCus.add(cus);
	        }
	    } catch (Exception e) {
	        
	    }

	    return listCus;
	}
	public static List<Customer> findCustomerByPhoneNumber(String phoneNumber) {
		List<Customer> listCus = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var stmt = con.prepareStatement("SELECT IdCus, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber FROM Customers WHERE PhoneNumber = ?");
	    ) {
	        stmt.setString(1, phoneNumber);

	        var rs = stmt.executeQuery();

	        if (rs.next()) {
	        	var cus = new Customer();
	            cus.setIdCus(rs.getInt("IdCus"));
	            cus.setFirstName(rs.getString("FirstName"));
	            cus.setLastName(rs.getString("LastName"));
	            cus.setDob(rs.getDate("DateOfBirth").toLocalDate());
	            cus.setGender(rs.getBoolean("Gender"));
	            cus.setAddress(rs.getString("Address"));
	            cus.setPhoneNb(rs.getString("PhoneNumber"));
	            listCus.add(cus);
	        }
	    } catch (Exception e) {
	        
	    }

	    return listCus;
	}

}
