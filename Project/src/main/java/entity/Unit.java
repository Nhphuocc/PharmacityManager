package entity;

public class Unit {
	private int idUnit;
	private String nameUnit;
	
	public Unit() {}
	public Unit(int idUnit, String nameUnit) {
		this.idUnit = idUnit;
		this.nameUnit = nameUnit;
	}
	public int getIdUnit() {
		return idUnit;
	}
	public void setIdUnit(int idUnit) {
		this.idUnit = idUnit;
	}
	public String getNameUnit() {
		return nameUnit;
	}
	public void setNameUnit(String nameUnit) {
		this.nameUnit = nameUnit;
	}
	
}
