package entity;

public class MakeBill {
	private int idMedin;
	private String innCode;
	private String nameMedin;
	private int quantity ;
	private double sellingPrice;
	
	public MakeBill() {}

	public MakeBill(int idMedin, String innCode, String nameMedin, int quantity, double sellingPrice) {
		this.idMedin = idMedin;
		this.innCode = innCode;
		this.nameMedin = nameMedin;
		this.quantity = quantity;
		this.sellingPrice = sellingPrice;
	}

	public int getIdMedin() {
		return idMedin;
	}

	public void setIdMedin(int idMedin) {
		this.idMedin = idMedin;
	}

	public String getInnCode() {
		return innCode;
	}

	public void setInnCode(String innCode) {
		this.innCode = innCode;
	}

	public String getNameMedin() {
		return nameMedin;
	}

	public void setNameMedin(String nameMedin) {
		this.nameMedin = nameMedin;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	
	
}
