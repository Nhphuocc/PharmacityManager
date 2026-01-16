package dao;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import database.ConnectToDB;
import entity.Medicine;

public class MedicineDAO {
	public static boolean insertMedicine(Medicine medicine) {
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareStatement("INSERT INTO Medincine (INNCode, NameMedin, IdCate, DosageForm, PathImg, content, ingredient) VALUES (?, ?, ?, ?, ?, ?, ?)")
	    ) {
	        cs.setString(1, medicine.getiNNcode());
	        cs.setString(2, medicine.getNameMedin());
	        cs.setInt(3, medicine.getIdCate());
	        cs.setString(4, medicine.getDosageForm());
	        cs.setString(5, medicine.getPathImg());
	        cs.setString(6, medicine.getContent());
	        cs.setString(7, medicine.getIngredient());

	        int rowsInserted = cs.executeUpdate();
	        if (rowsInserted > 0) {
	            return true;
	        } else {
	            return false; 
	        }
	    } catch (Exception e) {
	       
	        return false;
	    }
	}

	public static List<Medicine> searchMedicineByName(String name) {
	    List<Medicine> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareCall("{call SearchMedicineByName(?)}");
	    ) {
	        cs.setString(1, name);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                var medicine = new Medicine();
	                medicine.setiNNcode(rs.getString("INNCode"));
	                medicine.setNameMedin(rs.getString("NameMedin"));
	                medicine.setIdCate(rs.getInt("IdCate"));
	                medicine.setDosageForm(rs.getString("DosageForm"));
	                medicine.setPathImg(rs.getString("PathImg"));
	                medicine.setContent(rs.getString("content"));
	                medicine.setIngredient(rs.getString("ingredient"));
	                result.add(medicine);
	            }
	        }
	    } catch (Exception e) {
	      
	    }
	    return result;
	}
	public static List<Medicine> searchMedicineByCategory(String categoryName) {
	    List<Medicine> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareCall("{call SearchMedicineByCategory(?)}");
	    ) {
	        cs.setString(1, categoryName);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                var medicine = new Medicine();
	                medicine.setiNNcode(rs.getString("INNCode"));
	                medicine.setNameMedin(rs.getString("NameMedin"));
	                medicine.setIdCate(rs.getInt("IdCate"));
	                medicine.setDosageForm(rs.getString("DosageForm"));
	                medicine.setPathImg(rs.getString("PathImg"));
	                medicine.setContent(rs.getString("content"));
	                medicine.setIngredient(rs.getString("ingredient"));
	                result.add(medicine);
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return result;
	}
	public static List<Medicine> searchMedicineByINNCode(String innCode) {
	    List<Medicine> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareCall("{call SearchMedicineByINNCode(?)}");
	    ) {
	        cs.setString(1, innCode);
	        try (var rs = cs.executeQuery()) {
	            while (rs.next()) {
	                var medicine = new Medicine();
	                medicine.setiNNcode(rs.getString("INNCode"));
	                medicine.setNameMedin(rs.getString("NameMedin"));
	                medicine.setIdCate(rs.getInt("IdCate"));
	                medicine.setDosageForm(rs.getString("DosageForm"));
	                medicine.setPathImg(rs.getString("PathImg"));
	                medicine.setContent(rs.getString("content"));
	                medicine.setIngredient(rs.getString("ingredient"));
	                result.add(medicine);
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return result;
	}
	public static List<Medicine> getAllMedicineData() {
	    List<Medicine> result = new ArrayList<>();
	    try (var con = ConnectToDB.getConn();
	         var stmt = con.createStatement();
	         var rs = stmt.executeQuery("SELECT * FROM Medincine");
	    ) {
	        while (rs.next()) {
	            var medicine = new Medicine();
	            medicine.setiNNcode(rs.getString("INNCode"));
	            medicine.setNameMedin(rs.getString("NameMedin"));
	            medicine.setIdCate(rs.getInt("IdCate"));
	            medicine.setDosageForm(rs.getString("DosageForm"));
	            medicine.setPathImg(rs.getString("PathImg"));
	            medicine.setContent(rs.getString("content"));
	            medicine.setIngredient(rs.getString("ingredient"));
	            result.add(medicine);
	        }
	    } catch (Exception e) {
	       
	    }
	    return result;
	}
	public static boolean deleteMedicineByINNCode(String innCode) {
	    try (var con = ConnectToDB.getConn();
	         var cs = con.prepareStatement("SELECT PathImg FROM Medincine WHERE INNCode = ?");
	    ) {
	        cs.setString(1, innCode);
	        try (var rs = cs.executeQuery()) {
	            if (rs.next()) {
	                String imagePathFromDB = rs.getString("PathImg");
	                String projectDirectory = System.getProperty("user.dir");     
	                String imagePath = projectDirectory + File.separator + imagePathFromDB;
	                File imageFile = new File(imagePath);

	                if (imageFile.exists()) {
	                    if (imageFile.delete()) {
	                       
	                        var cs1 = con.prepareStatement("DELETE FROM Medincine WHERE INNCode = ?");
	                        cs1.setString(1, innCode);
	                        int rowsDeleted = cs1.executeUpdate();

	                        if (rowsDeleted > 0) {
	                            return true;
	                        }
	                    }
	                }
	            }
	        }
	    } catch (Exception e) {
	        
	    }
	    return false;
	}

	public static boolean updateMedicine(Medicine updatedMedicine, String oldpath, String oldInnCode) {
		try (var con = ConnectToDB.getConn();
		         var cs = con.prepareCall("{call UpdateMedicineWithNewINNCode(?, ?, ?, ?, ?, ?, ?, ?)}");
		    ) {
			cs.setString(1, oldInnCode);
			cs.setString(2, updatedMedicine.getiNNcode());
			cs.setString(3, updatedMedicine.getNameMedin());
			cs.setInt(4, updatedMedicine.getIdCate());
			cs.setString(5, updatedMedicine.getDosageForm());
			cs.setString(6, updatedMedicine.getContent());
			cs.setString(7, updatedMedicine.getIngredient());
			cs.setString(8, updatedMedicine.getPathImg());
			cs.executeUpdate();

			String projectDirectory = System.getProperty("user.dir");     
			String imagePath = projectDirectory + File.separator + oldpath;
			File imageFile = new File(imagePath);

			if (imageFile.exists()) {
				if (imageFile.delete()) {          
					return true;
				}
			 }
			            	    
			return true;
		    } catch (Exception e) {
		        
		    }
		    return false;
	   
	}

}
