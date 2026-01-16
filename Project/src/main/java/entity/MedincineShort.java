package entity;

public class MedincineShort {
	private int idID;
	private int IdBill;
	private int IdMedin;
	private int Quantity;
	
	
	public MedincineShort() {}


	public MedincineShort(int idID, int idBill, int idMedin, int quantity) {
		this.idID = idID;
		IdBill = idBill;
		IdMedin = idMedin;
		Quantity = quantity;
	}


	public int getIdID() {
		return idID;
	}


	public void setIdID(int idID) {
		this.idID = idID;
	}


	public int getIdBill() {
		return IdBill;
	}


	public void setIdBill(int idBill) {
		IdBill = idBill;
	}


	public int getIdMedin() {
		return IdMedin;
	}


	public void setIdMedin(int idMedin) {
		IdMedin = idMedin;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	@Override
	public String toString() {
		return "MedincineShort [idID=" + idID + ", IdBill=" + IdBill + ", IdMedin=" + IdMedin + ", Quantity=" + Quantity
				+ "]";
	}
	
	
	
	
}
