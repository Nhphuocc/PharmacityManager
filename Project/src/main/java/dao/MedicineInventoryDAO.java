package dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.MedicineInventory;


public class MedicineInventoryDAO {
	
	public static List<MedicineInventory> getAllMedicineInventoryData() {
	    List<MedicineInventory> medicineInventoryList = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var stmt = con.createStatement();
	        var rs = stmt.executeQuery("select * from SupplierInvoice as s inner join MedincineIventory as m on s.idSupply = m.idSupply")
	    ) {
	        while (rs.next()) {
	            var medicineInventory = new MedicineInventory();
	            medicineInventory.setIdSupply(rs.getInt("idSupply"));
	            medicineInventory.setIdSupplier(rs.getInt("idSupplier"));
	            medicineInventory.setiNNCode(rs.getString("INNCode"));
	            medicineInventory.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            medicineInventory.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            medicineInventory.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            medicineInventory.setQuantityBox(rs.getInt("quantity(box)"));
	            medicineInventory.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            medicineInventory.setCostPrice(rs.getDouble("CostPrice"));
	            medicineInventory.setIdMedin(rs.getInt("IdMedin"));
	            medicineInventory.setSellingPrice(rs.getDouble("sellingPrice"));
	            medicineInventory.setIdUnit(rs.getInt("IdUnit"));
	            medicineInventory.setQuantity(rs.getInt("Quantity"));
	            medicineInventory.setStatus(rs.getString("Status"));
	            
	            medicineInventoryList.add(medicineInventory);
	        }
	    } catch (Exception e) {
	        
	    }
	    return medicineInventoryList;
	}
	public static List<MedicineInventory> getExpiringMedicineInventory() {
	    List<MedicineInventory> medicineInventoryList = new ArrayList<>();

	    try (var con = ConnectToDB.getConn();
	         var stmt = con.createStatement();
	         var rs = stmt.executeQuery("EXEC GetExpiringMedicineInventory")
	    ) {
	        while (rs.next()) {
	            var medicineInventory = new MedicineInventory();
	            medicineInventory.setIdSupply(rs.getInt("idSupply"));
	            medicineInventory.setIdSupplier(rs.getInt("idSupplier"));
	            medicineInventory.setiNNCode(rs.getString("INNCode"));
	            medicineInventory.setSupply_date(rs.getDate("supply_date").toLocalDate());
	            medicineInventory.setProductionDate(rs.getDate("productionDate").toLocalDate());
	            medicineInventory.setExpirationDate(rs.getDate("ExpirationDate").toLocalDate());
	            medicineInventory.setQuantityBox(rs.getInt("quantity(box)"));
	            medicineInventory.setQuantityPelletsIn1Box(rs.getInt("Quantity(pelletsIn1Box)"));
	            medicineInventory.setCostPrice(rs.getDouble("CostPrice"));
	            medicineInventory.setIdMedin(rs.getInt("IdMedin"));
	            medicineInventory.setSellingPrice(rs.getDouble("sellingPrice"));
	            medicineInventory.setIdUnit(rs.getInt("IdUnit"));
	            medicineInventory.setQuantity(rs.getInt("Quantity"));
	            medicineInventory.setStatus(rs.getString("Status"));

	            medicineInventoryList.add(medicineInventory);
	        }
	    } catch (Exception e) {
	        
	    }

	    return medicineInventoryList;
	}

	public static boolean updateMedicineInventory(int idMedin, float sellingPrice, int idUnit, int quantity, String status) {
	    try (var con = ConnectToDB.getConn();
	         var ps = con.prepareStatement("UPDATE MedincineIventory SET SellingPrice = ?, IdUnit = ?, Quantity = ?, Status = ? WHERE IdMedin = ?")) {
	        ps.setFloat(1, sellingPrice);
	        ps.setInt(2, idUnit);
	        ps.setInt(3, quantity);
	        ps.setString(4, status);
	        ps.setInt(5, idMedin);
	        int rowsAffected = ps.executeUpdate();
	        return rowsAffected > 0;
	    } catch (Exception e) {
	        
	        return false;
	    }
	}


}
