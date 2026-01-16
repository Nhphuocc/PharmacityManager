package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.SupplierInvoice;

public class SupplierInvoiceDAO {
	public static void insertSupplierInvoice(SupplierInvoice supplierInvoice) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call InsertSupplierInvoice(?, ?, ?, ?, ?, ?, ?, ?)}");
	    ) {
	        cs.setInt(1, supplierInvoice.getIdSupplier());
	        cs.setString(2, supplierInvoice.getiNNCode());
	        cs.setDate(3, java.sql.Date.valueOf(supplierInvoice.getSupply_date()));
	        cs.setDate(4, java.sql.Date.valueOf(supplierInvoice.getProductionDate()));
	        cs.setDate(5, java.sql.Date.valueOf(supplierInvoice.getExpirationDate()));
	        cs.setInt(6, supplierInvoice.getQuantityBox());
	        cs.setInt(7, supplierInvoice.getQuantityPelletsIn1Box());
	        cs.setDouble(8, supplierInvoice.getCostPrice());
	        cs.executeUpdate();
	        
	    } catch (Exception e) {
	       
	    }
	}
	public static void updateSupplierInvoice(SupplierInvoice supplierInvoice) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call UpdateSupplierInvoice(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
	    ) {
	        cs.setInt(1, supplierInvoice.getIdSupply());
	        cs.setInt(2, supplierInvoice.getIdSupplier());
	        cs.setString(3, supplierInvoice.getiNNCode());
	        cs.setDate(4, java.sql.Date.valueOf(supplierInvoice.getSupply_date()));
	        cs.setDate(5, java.sql.Date.valueOf(supplierInvoice.getProductionDate()));
	        cs.setDate(6, java.sql.Date.valueOf(supplierInvoice.getExpirationDate()));
	        cs.setInt(7, supplierInvoice.getQuantityBox());
	        cs.setInt(8, supplierInvoice.getQuantityPelletsIn1Box());
	        cs.setDouble(9, supplierInvoice.getCostPrice());
	        cs.executeUpdate();
	    } catch (Exception e) {
	        
	    }
	}
	public static boolean deleteSupplierInvoice(int idsupply) {
	    boolean deleted = false;
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call DeleteFromSupplierAndMedicine(?)}");
	    ) {
	        cs.setInt(1, idsupply);
	        int rowsAffected = cs.executeUpdate();
	        if (rowsAffected > 0) {
	            deleted = true; 
	        }
	    } catch (Exception e) {
	       
	    }
	    return deleted;
	}

	public static List<SupplierInvoice> getAllSupplierInvoices() {
	    List<SupplierInvoice> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var stmt = con.createStatement();
	         ResultSet rs = stmt.executeQuery("SELECT * FROM SupplierInvoice");
	    ) {
	        while (rs.next()) {
	            var supplierInvoice = new SupplierInvoice();
	            supplierInvoice.setIdSupply(rs.getInt("idSupply"));
	            supplierInvoice.setIdSupplier(rs.getInt("idSupplier"));
	            supplierInvoice.setiNNCode(rs.getString("INNCode"));
	            supplierInvoice.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            supplierInvoice.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            supplierInvoice.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            supplierInvoice.setQuantityBox(rs.getInt("Quantity(box)"));
	            supplierInvoice.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            supplierInvoice.setCostPrice(rs.getDouble("CostPrice"));
	            result.add(supplierInvoice);
	        }
	    } catch (Exception e) {
	       
	    }
	    return result;
	}
	public static List<SupplierInvoice> searchSupplierInvoiceByIdSupply(int idSupply) {
	    List<SupplierInvoice> supplierInvoiceList = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("{call SearchSupplierInvoiceByIdSupply(?)}");
	    ) {
	        cs.setInt(1, idSupply);
	        var rs = cs.executeQuery();

	        while (rs.next()) {
	            var supplierInvoice = new SupplierInvoice();
	            supplierInvoice.setIdSupply(rs.getInt("idSupply"));
	            supplierInvoice.setIdSupplier(rs.getInt("idSupplier"));
	            supplierInvoice.setiNNCode(rs.getString("INNCode"));
	            supplierInvoice.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            supplierInvoice.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            supplierInvoice.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            supplierInvoice.setQuantityBox(rs.getInt("Quantity(box)"));
	            supplierInvoice.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            supplierInvoice.setCostPrice(rs.getDouble("CostPrice"));
	            supplierInvoiceList.add(supplierInvoice);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return supplierInvoiceList;
	}
	public static List<SupplierInvoice> searchSupplierInvoiceByIdSupplier(int idSupplier) {
	    List<SupplierInvoice> supplierInvoices = new ArrayList<>();
	    String sql = "{call SearchSupplierInvoiceBySupplierId(?)}";

	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setInt(1, idSupplier);
	        ResultSet rs = statement.executeQuery();

	        while (rs.next()) {
	            SupplierInvoice supplierInvoice = new SupplierInvoice();
	            supplierInvoice.setIdSupply(rs.getInt("idSupply"));
	            supplierInvoice.setIdSupplier(rs.getInt("idSupplier"));
	            supplierInvoice.setiNNCode(rs.getString("INNCode"));
	            supplierInvoice.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            supplierInvoice.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            supplierInvoice.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            supplierInvoice.setQuantityBox(rs.getInt("Quantity(box)"));
	            supplierInvoice.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            supplierInvoice.setCostPrice(rs.getDouble("CostPrice"));
	            supplierInvoices.add(supplierInvoice);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return supplierInvoices;
	}
	public static List<SupplierInvoice> searchSupplierInvoiceBySupplyDate(LocalDate startDate) {
	    List<SupplierInvoice> supplierInvoices = new ArrayList<>();
	    String sql = "{call SearchSupplierInvoiceBySupplyDate(?)}";

	    try (var con = ConnectToDB.getConn();
	         var statement = con.prepareCall(sql)) {
	        statement.setDate(1, java.sql.Date.valueOf(startDate));
	        ResultSet rs = statement.executeQuery();

	        while (rs.next()) {
	            SupplierInvoice supplierInvoice = new SupplierInvoice();
	            supplierInvoice.setIdSupply(rs.getInt("idSupply"));
	            supplierInvoice.setIdSupplier(rs.getInt("idSupplier"));
	            supplierInvoice.setiNNCode(rs.getString("INNCode"));
	            supplierInvoice.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            supplierInvoice.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            supplierInvoice.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            supplierInvoice.setQuantityBox(rs.getInt("Quantity(box)"));
	            supplierInvoice.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            supplierInvoice.setCostPrice(rs.getDouble("CostPrice"));
	            supplierInvoices.add(supplierInvoice);
	        }
	    } catch (SQLException e) {
	        
	    }

	    return supplierInvoices;
	}

}
