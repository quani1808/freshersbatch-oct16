package com.Adminmicroservice.adminservice.models;

import java.sql.Date;

public class Drugs {

	private int drugID;
	private String drugName;
	private Date expirationDate;
	private Date manufacturedDate;
	private String drugType;
	private String drugDescription;
	private int drugAvailibility;
	private int drugPrice;
	
	
	public Drugs(int drugID, String drugName, Date expirationDate, Date manufacturedDate, String drugType,
			String drugDescription, int drugAvailibility, int drugPrice) {
		super();
		this.drugID = drugID;
		this.drugName = drugName;
		this.expirationDate = expirationDate;
		this.manufacturedDate = manufacturedDate;
		this.drugType = drugType;
		this.drugDescription = drugDescription;
		this.drugAvailibility = drugAvailibility;
		this.drugPrice = drugPrice;
	}
	
	public int getDrugID() {
		return drugID;
	}
	public void setDrugID(int drugID) {
		this.drugID = drugID;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	public String getDrugType() {
		return drugType;
	}
	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}
	public String getDrugDescription() {
		return drugDescription;
	}
	public void setDrugDescription(String drugDescription) {
		this.drugDescription = drugDescription;
	}
	public int getDrugAvailibility() {
		return drugAvailibility;
	}
	public void setDrugAvailibility(int drugAvailibility) {
		this.drugAvailibility = drugAvailibility;
	}
	public int getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(int drugPrice) {
		this.drugPrice = drugPrice;
	}
	
	@Override
	public String toString() {
		return "Drugs [drugID=" + drugID + ", drugName=" + drugName + ", expirationDate=" + expirationDate
				+ ", manufacturedDate=" + manufacturedDate + ", drugType=" + drugType
				+ ", drugDescription=" + drugDescription + ", drugAvailibility=" + drugAvailibility + ", drugPrice="
				+ drugPrice + "]";
	}

}
