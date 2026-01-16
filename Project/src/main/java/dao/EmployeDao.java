package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectToDB;
import entity.Account;
import entity.EmpAndAcc;
import entity.Employee;

public class EmployeDao {
    public static void insertEmployeeToDb(Employee employee, Account acc) {
        Connection con = null;
        try {
            con = ConnectToDB.getConn();
            con.setAutoCommit(false); 

            try (CallableStatement cs = con.prepareCall("{call InsertEmployeeAndAccount(?,?,?,?,?,?,?,?,?,?)}")) {
                cs.setString(1, employee.getFirstName());
                cs.setString(2, employee.getLastName());
                cs.setDate(3, java.sql.Date.valueOf(employee.getDob()));
                cs.setBoolean(4, employee.isGender());
                cs.setString(5, employee.getAddress());
                cs.setString(6, employee.getPhoneNb());
                cs.setString(7, employee.getUserName());
                cs.setInt(8, employee.getIdMng());
                cs.setString(9, acc.getPassWord());
                cs.setString(10, acc.getRole());
                cs.executeUpdate();
            }

            con.commit(); 

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback(); 
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
         
            JOptionPane.showMessageDialog(null, "Account already exist.", "Message", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); 
                    con.close(); 
                }
            } catch (SQLException closeException) {
                
            }
        }
    }
    

    public static List<EmpAndAcc> getEmpAndAccs() {
        List<EmpAndAcc> employeeList = new ArrayList<>();
        try (
            Connection con = ConnectToDB.getConn();
            var stmt = con.prepareStatement("SELECT \r\n"
            		+ "    e.IdEmp, e.First_Name, e.Last_Name, e.DateOfBirth, e.Gender, e.Addres, e.PhoneNumber, e.Username, e.IdMng, a.PassWord, a.Role\r\n"
            		+ "FROM \r\n"
            		+ "    Employee e\r\n"
            		+ "INNER JOIN\r\n"
            		+ "    Account a ON e.Username = a.Username;");
            ResultSet rs = stmt.executeQuery();
        ) {
            while (rs.next()) {
                EmpAndAcc empacc = new EmpAndAcc();
                empacc.setIdEmp(rs.getInt("IdEmp"));
                empacc.setFirstName(rs.getString("First_Name"));
                empacc.setLastName(rs.getString("Last_Name"));
                empacc.setDob(rs.getDate("DateOfBirth").toLocalDate());
                empacc.setGender(rs.getBoolean("Gender"));
                empacc.setAddress(rs.getString("Addres"));
                empacc.setPhoneNb(rs.getString("PhoneNumber"));
                empacc.setUserName(rs.getString("Username"));
                empacc.setIdMng(rs.getInt("IdMng"));
                empacc.setPassWord(rs.getString("PassWord"));
                empacc.setRole(rs.getString("Role"));
                
                employeeList.add(empacc);
            }
        } catch (Exception e) {
           
        }
        return employeeList;
    }    
    
    public static boolean deleteEmployeeAndAccount(int employeeId) {
        try (Connection con = ConnectToDB.getConn();
             CallableStatement cstmt = con.prepareCall("{call DeleteEmployeeAndAccount(?)}")) {
            cstmt.setInt(1, employeeId);

            int rowsDeleted = cstmt.executeUpdate();

            return rowsDeleted > 0;
        } catch (SQLException e) {
            
        }
        return false;
    }

    public static boolean updateEmpAndAcc(EmpAndAcc empAndAcc) {
        try (
        		var con = ConnectToDB.getConn();
        		var cstmt = con.prepareCall("{call UpdateEmployeeAndAccount(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}")            		 
        	) {
        	String oldUsername = EmployeDao.takeUsernameOld(empAndAcc.getIdEmp());
        	String newUsername = empAndAcc.getUserName();
        	if (!newUsername.equals(oldUsername)) {
                
                if (isUsernameExists(newUsername)) {
                    JOptionPane.showMessageDialog(null, "Username đã tồn tại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    return false;
                	}
               }
            cstmt.setInt(1, empAndAcc.getIdEmp());
            cstmt.setString(2, empAndAcc.getFirstName());
            cstmt.setString(3, empAndAcc.getLastName());
            cstmt.setDate(4, java.sql.Date.valueOf(empAndAcc.getDob()));
            cstmt.setBoolean(5, empAndAcc.isGender());
            cstmt.setString(6, empAndAcc.getAddress());
            cstmt.setString(7, empAndAcc.getPhoneNb());
            cstmt.setString(8, oldUsername);
            cstmt.setString(9, empAndAcc.getUserName());
            cstmt.setString(10, empAndAcc.getPassWord());
            cstmt.setInt(11, empAndAcc.getIdMng());
            cstmt.setString(12, empAndAcc.getRole());
            
            int rowsUpdated = cstmt.executeUpdate();

            if (rowsUpdated > 0) {
                return true;
            }
        } catch (SQLException e) {
           
        }
        return false;
    }
    public static String takeUsernameOld(int idEmp) {
        try (
            Connection con = ConnectToDB.getConn();
            var stmt = con.prepareStatement("SELECT Username FROM Employee WHERE IdEmp = ?");
        ) {
            stmt.setInt(1, idEmp);

            ResultSet rs = stmt.executeQuery();
            String username = "";

            while (rs.next()) {
                username = rs.getString("Username");
            }

            return username;
        } catch (Exception e) {
            
        }
        return "";
    }
    public static int findIdEmpByUsername(String username) {
        try (
            var con = ConnectToDB.getConn();
            var stmt = con.prepareStatement("SELECT IdEmp FROM Employee WHERE Username = ?");
        ) {
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int idEmp = rs.getInt("IdEmp");
                return idEmp;
            }
        } catch (Exception e) {
            
        }

        return -1; 
    }

    private static boolean isUsernameExists(String username) {
        try (
            Connection con = ConnectToDB.getConn();
            var stmt = con.prepareStatement("SELECT Username FROM Account WHERE Username = ?")
        ) {
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
           
            return false;
        }
    } 
    
    public static EmpAndAcc getEmployeeAndAccountById(int idEmp) {
        EmpAndAcc empAndAcc = null;

        try (
            Connection connection = ConnectToDB.getConn();
            CallableStatement cstmt = connection.prepareCall("{call GetEmployeeAndAccountById(?)}")
        ) {
            cstmt.setInt(1, idEmp);
            ResultSet rs = cstmt.executeQuery();
            if (rs.next()) {
                empAndAcc = new EmpAndAcc();
                empAndAcc.setIdEmp(rs.getInt("IdEmp"));
                empAndAcc.setFirstName(rs.getString("First_Name"));
                empAndAcc.setLastName(rs.getString("Last_Name"));
                empAndAcc.setDob(rs.getDate("DateOfBirth").toLocalDate());
                empAndAcc.setGender(rs.getBoolean("Gender"));
                empAndAcc.setAddress(rs.getString("Addres"));
                empAndAcc.setPhoneNb(rs.getString("PhoneNumber"));
                empAndAcc.setUserName(rs.getString("Username"));
                empAndAcc.setIdMng(rs.getInt("IdMng"));
                empAndAcc.setPassWord(rs.getString("PassWord"));
                empAndAcc.setRole(rs.getString("Role"));
            }
        } catch (SQLException e) {
        	
        }

        return empAndAcc;
    }

    public static List<EmpAndAcc> getEmployeesAndAccountsByFirstName(String firstName) {
        List<EmpAndAcc> empAndAccList = new ArrayList<>();
        String storedProcedure = "{call GetEmployeeAndAccountByFirstName(?)}";

        try (Connection connection = ConnectToDB.getConn();
             CallableStatement cstmt = connection.prepareCall(storedProcedure)) {

            cstmt.setString(1, firstName);

            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                EmpAndAcc empAndAcc = new EmpAndAcc();
                empAndAcc.setIdEmp(rs.getInt("IdEmp"));
                empAndAcc.setFirstName(rs.getString("First_Name"));
                empAndAcc.setLastName(rs.getString("Last_Name"));
                empAndAcc.setDob(rs.getDate("DateOfBirth").toLocalDate());
                empAndAcc.setGender(rs.getBoolean("Gender"));
                empAndAcc.setAddress(rs.getString("Addres"));
                empAndAcc.setPhoneNb(rs.getString("PhoneNumber"));
                empAndAcc.setUserName(rs.getString("Username"));
                empAndAcc.setIdMng(rs.getInt("IdMng"));
                empAndAcc.setPassWord(rs.getString("Password"));
                empAndAcc.setRole(rs.getString("Role"));
                empAndAccList.add(empAndAcc);
            }

        } catch (SQLException e) {
            
        }

        return empAndAccList;
    }

    
}
