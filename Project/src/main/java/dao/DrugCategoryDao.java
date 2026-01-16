package dao;

import java.util.*;
import database.ConnectToDB;
import entity.DrugCategory;

public class DrugCategoryDao {
    public static void insertDrugCategoryToDb(String category) {
        try (
            var con = ConnectToDB.getConn();
            var cs = con.prepareCall("{call InsertDrugCategory(?)}");
        ) {
            cs.setString(1, category);
            cs.executeUpdate();
        } catch (Exception e) {
           
        }
    }
    public static boolean deleteDrugCategoryFromDb(int categoryId) {
        try (var con = ConnectToDB.getConn();
             var ps = con.prepareStatement("DELETE FROM DrugCategory WHERE IdCate = ?")) {
            ps.setInt(1, categoryId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
           
            return false;
        }
    }
    public static boolean updateDrugCategoryInDb(int categoryId, String updatedName) {
        try (var con = ConnectToDB.getConn();
             var ps = con.prepareStatement("UPDATE DrugCategory SET CategoryName = ? WHERE IdCate = ?")) {
            ps.setString(1, updatedName);
            ps.setInt(2, categoryId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {

            return false;
        }
    }

    public static List<DrugCategory> getListDrugCategories() {
        List<DrugCategory> listCategories = new ArrayList<>();
        try (
            var con = ConnectToDB.getConn();
            var stmt = con.createStatement();
            var rs = stmt.executeQuery("select IdCate, CategoryName from DrugCategory")
        ) {
            while (rs.next()) {
                var category = new DrugCategory();
                category.setIdCate(rs.getInt("IdCate"));
                category.setCategoryName(rs.getString("CategoryName"));
                listCategories.add(category);
            }
        } catch (Exception e) {
           
        }

        return listCategories;
    }
    public static DrugCategory getDrugCategoriesById(int categoryId) {
    	 var category = new DrugCategory();
        try (var con = ConnectToDB.getConn();
             var stmt = con.createStatement();
             var rs = stmt.executeQuery("SELECT IdCate, CategoryName FROM DrugCategory WHERE IdCate = " + categoryId)
        ) {
            while (rs.next()) {
               
                category.setIdCate(rs.getInt("IdCate"));
                category.setCategoryName(rs.getString("CategoryName"));
            }
            return category;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return category;
    }

    
}

