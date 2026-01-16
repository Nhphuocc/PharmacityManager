package dao;

import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Bill;
import entity.MakeBill;
import entity.MedincineShort;

public class MakeBillDAO {
	
	public static List<MakeBill> searchMedicineByName(String name) {
	    List<MakeBill> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareCall("{call SearchMedicineInventoryByName(?)}");
	    ) {
	        cs.setString(1, name);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                var makeBill = new MakeBill();
	                makeBill.setIdMedin(rs.getInt("IdMedin"));
	                makeBill.setInnCode(rs.getString("INNCode"));
	                makeBill.setNameMedin(rs.getString("NameMedin"));
	                makeBill.setQuantity(rs.getInt("Quantity"));
	                makeBill.setSellingPrice(rs.getDouble("SellingPrice"));
	                result.add(makeBill);
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return result;
	}
	public static List<MakeBill> searchMedicineByINNCode(String innCode) {
	    List<MakeBill> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareCall("{call SearchMedicineTOBillByINNCode(?)}");
	    ) {
	        cs.setString(1, innCode);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                var makeBill = new MakeBill();
	                makeBill.setIdMedin(rs.getInt("IdMedin"));
	                makeBill.setInnCode(rs.getString("INNCode"));
	                makeBill.setNameMedin(rs.getString("NameMedin"));
	                makeBill.setQuantity(rs.getInt("Quantity"));
	                makeBill.setSellingPrice(rs.getDouble("SellingPrice"));
	                result.add(makeBill);
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return result;
	}
	public static int getMedicineInventoryQuantityByIdMedin(int idMedin) {
        int quantity = 0;
        try (
            var con = ConnectToDB.getConn();
            var cs = con.prepareCall("{call GetMedicineInventoryQuantityByIdMedin(?)}");
        ) {
            cs.setInt(1, idMedin);
            cs.execute();
            if (cs.getResultSet() != null) {
                while (cs.getResultSet().next()) {
                    quantity = cs.getResultSet().getInt("Quantity");
                }
            }
        } catch (SQLException e) {
            
        }
        return quantity;
    }
	public static boolean insertBillandInvoiceDetailAndMinusMedicineInvetory(Bill bill) {
        	try (	
        		var con = ConnectToDB.getConn();
        		var cs = con.prepareCall("{call InsertBill(?, ?, ?, ?, ?)}");
        		var cs2 = con.prepareCall("{call InsertInvoiceDetail(?, ?, ?)}");
        		) {
        		cs.setInt(1, bill.getIdCus()); 
        		cs.setDate(2, java.sql.Date.valueOf(bill.getInvoiceDate()));
        		cs.setDouble(3,bill.getTotalBill());
        		cs.setInt(4, (int) bill.getIdEmp());
 
        		cs.registerOutParameter(5, Types.INTEGER);
       
        		cs.execute();
        		bill.setIdBill(cs.getInt(5));
          
        		bill.getListMedincineInBill().forEach(medincine -> {
                try {
                    cs2.setInt(1, bill.getIdBill());
                    cs2.setInt(2, medincine.getIdMedin());
                    cs2.setInt(3, medincine.getQuantity());
                    cs2.execute();
                } catch (SQLException e) {
                    
                }
            });
        		 return true;
        } catch (Exception e) {
        	return false;
        }
    }
	
	public static List<Bill> searchBillById(int id) {
	    List<Bill> billList = new ArrayList<>();
	    String sql = "{call SearchBillById(?)}";
	    
	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setInt(1, id);
	        var resultSet = statement.executeQuery();
	        
	        while (resultSet.next()) {
	            Bill bill = new Bill();
	            bill.setIdBill(resultSet.getInt("IdBill"));
	            bill.setIdCus(resultSet.getInt("IdCus"));
	            bill.setInvoiceDate(resultSet.getDate("InvoiceDate").toLocalDate());
	            bill.setTotalBill(resultSet.getFloat("PriceTotal"));
	            bill.setIdEmp(resultSet.getInt("IdEmp"));
	            billList.add(bill);
	        }
	    } catch (SQLException e) {
	        
	    }
	    
	    return billList;
	}

	public static List<MedincineShort> getInvoiceDetailsByBillId(int idBill) {
	    List<MedincineShort> invoiceDetailsList = new ArrayList<>();
	    String sql = "{call GetInvoiceDetailsByBillId(?)}";
	    
	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setInt(1, idBill);
	        var resultSet = statement.executeQuery();
	        
	        while (resultSet.next()) {
	            MedincineShort medincine = new MedincineShort();
	            medincine.setIdID(resultSet.getInt("IdID"));
	            medincine.setIdBill(resultSet.getInt("IdBill"));
	            medincine.setIdMedin(resultSet.getInt("IdMedin"));
	            medincine.setQuantity(resultSet.getInt("Quantity"));
	            invoiceDetailsList.add(medincine);
	        }
	    } catch (SQLException e) {
	      
	    }
	    
	    return invoiceDetailsList;
	}
	
	public static List<Bill> searchBillsByDate(LocalDate startDate, LocalDate endDate) {
	    List<Bill> billList = new ArrayList<>();
	    String sql = "{call SearchBillsByDate(?, ?)}";
	    
	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setDate(1, java.sql.Date.valueOf(startDate));
	        statement.setDate(2, java.sql.Date.valueOf(endDate));
	        var resultSet = statement.executeQuery();
	        
	        while (resultSet.next()) {
	            Bill bill = new Bill();
	            bill.setIdBill(resultSet.getInt("IdBill"));
	            bill.setIdCus(resultSet.getInt("IdCus"));
	            bill.setInvoiceDate(resultSet.getDate("InvoiceDate").toLocalDate());
	            bill.setTotalBill(resultSet.getFloat("PriceTotal"));
	            bill.setIdEmp(resultSet.getInt("IdEmp"));
	            billList.add(bill);
	        }
	    } catch (SQLException e) {
	       
	    }
	    
	    return billList;
	}

	public static List<Bill> searchBillsByEmpId(int idEmp) {
	    List<Bill> billList = new ArrayList<>();
	    String sql = "{call SearchBillsByEmpId(?)}";
	    
	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setInt(1, idEmp);
	        var resultSet = statement.executeQuery();
	        
	        while (resultSet.next()) {
	            Bill bill = new Bill();
	            bill.setIdBill(resultSet.getInt("IdBill"));
	            bill.setIdCus(resultSet.getInt("IdCus"));
	            bill.setInvoiceDate(resultSet.getDate("InvoiceDate").toLocalDate());
	            bill.setTotalBill(resultSet.getFloat("PriceTotal"));
	            bill.setIdEmp(resultSet.getInt("IdEmp"));
	            billList.add(bill);
	        }
	    } catch (SQLException e) {
	        
	    }
	    
	    return billList;
	}

	public static List<Bill> searchBillsByDateAndEmpId(LocalDate startDate, LocalDate endDate, int idEmp) {
	    List<Bill> billList = new ArrayList<>();
	    String sql = "{call SearchBillsByDateAndEmpId(?, ?, ?)}";
	    
	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setDate(1, java.sql.Date.valueOf(startDate));
	        statement.setDate(2, java.sql.Date.valueOf(endDate));
	        statement.setInt(3, idEmp);
	        var resultSet = statement.executeQuery();
	        
	        while (resultSet.next()) {
	            Bill bill = new Bill();
	            bill.setIdBill(resultSet.getInt("IdBill"));
	            bill.setIdCus(resultSet.getInt("IdCus"));
	            bill.setInvoiceDate(resultSet.getDate("InvoiceDate").toLocalDate());
	            bill.setTotalBill(resultSet.getFloat("PriceTotal"));
	            bill.setIdEmp(resultSet.getInt("IdEmp"));
	            billList.add(bill);
	        }
	    } catch (SQLException e) {
	       
	    }
	    
	    return billList;
	}

}
