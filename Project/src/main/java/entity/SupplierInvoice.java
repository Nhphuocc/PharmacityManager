package entity;

import java.time.LocalDate;

public class SupplierInvoice {
	private int idSupply;
	private int idSupplier;
	private String iNNCode;
	private LocalDate supply_date;
	private LocalDate productionDate;
	private LocalDate expirationDate;
	private int quantityBox;
	private int quantityPelletsIn1Box;
	private double costPrice;
	
	public SupplierInvoice() {}
	public SupplierInvoice(int idSupply, int idSupplier, String iNNCode, LocalDate supply_date,
			LocalDate productionDate, LocalDate expirationDate, int quantityBox, int quantityPelletsIn1Box,
			double costPrice) {
		
		this.idSupply = idSupply;
		this.idSupplier = idSupplier;
		this.iNNCode = iNNCode;
		this.supply_date = supply_date;
		this.productionDate = productionDate;
		this.expirationDate = expirationDate;
		this.quantityBox = quantityBox;
		this.quantityPelletsIn1Box = quantityPelletsIn1Box;
		this.costPrice = costPrice;
	}


	public int getIdSupply() {
		return idSupply;
	}


	public void setIdSupply(int idSupply) {
		this.idSupply = idSupply;
	}


	public int getIdSupplier() {
		return idSupplier;
	}


	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}


	public String getiNNCode() {
		return iNNCode;
	}


	public void setiNNCode(String iNNCode) {
		this.iNNCode = iNNCode;
	}


	public LocalDate getSupply_date() {
		return supply_date;
	}


	public void setSupply_date(LocalDate supply_date) {
		this.supply_date = supply_date;
	}


	public LocalDate getProductionDate() {
		return productionDate;
	}


	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}


	public LocalDate getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}


	public int getQuantityBox() {
		return quantityBox;
	}


	public void setQuantityBox(int quantityBox) {
		this.quantityBox = quantityBox;
	}


	public int getQuantityPelletsIn1Box() {
		return quantityPelletsIn1Box;
	}


	public void setQuantityPelletsIn1Box(int quantityPelletsIn1Box) {
		this.quantityPelletsIn1Box = quantityPelletsIn1Box;
	}


	public double getCostPrice() {
		return costPrice;
	}


	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	
	
	
	
}
