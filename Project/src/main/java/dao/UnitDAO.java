package dao;

import java.util.*;

import database.ConnectToDB;
import entity.Unit;

public class UnitDAO {
	public static void insertUnitToDb(String nameUnit) {
		try (
		        var con = ConnectToDB.getConn();
		        var cs = con.prepareCall("{call InsertUnit(?)}");
				) {
		        cs.setString(1, nameUnit);
		       
		        cs.executeUpdate();
		    } catch (Exception e) {
		       
		    }
	}
	public static List<Unit> getListUnits() {
	    List<Unit> listUnits = new ArrayList<>();
	    try (
	        var con = ConnectToDB.getConn();
	        var stmt = con.createStatement();
	        var rs = stmt.executeQuery("select IdUnit, NameUnit from Unit")
	    ) {
	        while (rs.next()) {
	            var unit = new Unit();
	            unit.setIdUnit(rs.getInt("IdUnit"));
	            unit.setNameUnit(rs.getString("NameUnit"));
	            listUnits.add(unit);
	        }
	    } catch (Exception e) {
	        
	    }

	    return listUnits;
	}
	public static Unit getUnitById(int idUnit) {
	    Unit unit = null;
	    try (
	        var con = ConnectToDB.getConn();
	        var ps = con.prepareStatement("SELECT IdUnit, NameUnit FROM Unit WHERE IdUnit = ?");
	    ) {
	        ps.setInt(1, idUnit);
	        var rs = ps.executeQuery();
	        if (rs.next()) {
	            unit = new Unit();
	            unit.setIdUnit(rs.getInt("IdUnit"));
	            unit.setNameUnit(rs.getString("NameUnit"));
	        }
	    } catch (Exception e) {
	        
	    }
	    return unit;
	}


	public static boolean updateUnitInDb(int unitId, String updatedName) {
	    try (var con = ConnectToDB.getConn();
	         var ps = con.prepareStatement("UPDATE Unit SET NameUnit = ? WHERE IdUnit = ?")) {
	        ps.setString(1, updatedName);
	        ps.setInt(2, unitId);
	        int rowsAffected = ps.executeUpdate();
	        return rowsAffected > 0;
	    } catch (Exception e) {
	       
	        return false;
	    }
	}

	public static boolean deleteUnitFromDb(int unitId) {
	    try (var con = ConnectToDB.getConn();
	         var ps = con.prepareStatement("DELETE FROM Unit WHERE IdUnit = ?")) {
	        ps.setInt(1, unitId);
	        int rowsAffected = ps.executeUpdate();
	        return rowsAffected > 0;
	    } catch (Exception e) {
	        return false;
	    }
	}

}
