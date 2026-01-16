package dao;

import java.util.ArrayList;
import java.util.List;
import database.ConnectToDB;
import entity.Supplier;

public class SupplierDAO {
    public static void insertSupplierToDb(String nameSupplier) {
        try (
            var con = ConnectToDB.getConn();
            var cs = con.prepareCall("{call InsertSupplier(?)}");
        ) {
            cs.setString(1, nameSupplier);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
    public static boolean deleteSupplierFromDb(int supplierId) {
        try (var con = ConnectToDB.getConn();
             var ps = con.prepareStatement("DELETE FROM Supplier WHERE idSupplier = ?")) {
            ps.setInt(1, supplierId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public static boolean updateSupplierInDb(int supplierId, String updatedName) {
        try (var con = ConnectToDB.getConn();
             var ps = con.prepareStatement("UPDATE Supplier SET nameSupplier = ? WHERE idSupplier = ?")) {
            ps.setString(1, updatedName);
            ps.setInt(2, supplierId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
          
            return false;
        }
    }
    public static Supplier getSupplierById(int supplierId) {
        Supplier supplier = null;
        try (var con = ConnectToDB.getConn();
             var ps = con.prepareStatement("SELECT * FROM Supplier WHERE idSupplier = ?")) {
            ps.setInt(1, supplierId);
            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    supplier = new Supplier();
                    supplier.setIdSupplier(rs.getInt("idSupplier"));
                    supplier.setNameSupplier(rs.getString("nameSupplier"));
                }
            }
        } catch (Exception e) {
            
        }
        return supplier;
    }

    public static List<Supplier> getListSuppliers() {
        List<Supplier> listSuppliers = new ArrayList<>();
        try (
            var con = ConnectToDB.getConn();
            var stmt = con.createStatement();
            var rs = stmt.executeQuery("SELECT idSupplier, nameSupplier FROM Supplier")
        ) {
            while (rs.next()) {
                var supplier = new Supplier();
                supplier.setIdSupplier(rs.getInt("idSupplier"));
                supplier.setNameSupplier(rs.getString("nameSupplier"));
                listSuppliers.add(supplier);
            }
        } catch (Exception e) {
           
        }

        return listSuppliers;
    }
}
