package entity;

import java.time.*;
import java.util.*;

public class Bill {
	private int idBill;
	private int idCus;
	private LocalDate invoiceDate;
	private double totalBill;
	private int IdEmp;
	List <MedincineShort> listMedincineInBill;
	
	public Bill() {}
	public Bill(int idBill, int idCus, LocalDate invoiceDate, double totalBill, int idEmp,
			List<MedincineShort> listMedincineInBill) {
		this.idBill = idBill;
		this.idCus = idCus;
		this.invoiceDate = invoiceDate;
		this.totalBill = totalBill;
		IdEmp = idEmp;
		this.listMedincineInBill = listMedincineInBill;
	}
	public int getIdBill() {
		return idBill;
	}
	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}
	
	public int getIdCus() {
		return idCus;
	}
	public void setIdCus(int idCus) {
		this.idCus = idCus;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double d) {
		this.totalBill = d;
	}
	public double getIdEmp() {
		return IdEmp;
	}
	public void setIdEmp(int idEmp) {
		IdEmp = idEmp;
	}
	public List<MedincineShort> getListMedincineInBill() {
		return listMedincineInBill;
	}
	public void setListMedincineInBill(List<MedincineShort> listMedincineInBill) {
		this.listMedincineInBill = listMedincineInBill;
	}
	@Override
	public String toString() {
		return "Bill [idBill=" + idBill + ", idCus=" + idCus + ", invoiceDate=" + invoiceDate + ", totalBill="
				+ totalBill + ", IdEmp=" + IdEmp + ", listMedincineInBill=" + listMedincineInBill + "]";
	}
	
}
