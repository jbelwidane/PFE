package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.Date;

import com.gestionagricole.constant.OperationConstants.STATUS;

public class LargeculturalOperationInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private FarmUnitInfo farmUnit;

	private STATUS status;

	private CulturalMethodeInfo methode;

	private CulturalTypeInfo type;

	private OperationInfo operation;

	private Date startDate;

	private Date endDate;

	private Integer iteration;

	private String label;

	private Float surface;

	private Float fuelUsed;

	private Integer manpower;

	private String note;

	private LargeculturalVarietyInfo variety;

	private CulturalCategoryInfo category;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public FarmUnitInfo getFarmUnit() {
		return farmUnit;
	}

	public void setFarmUnit(FarmUnitInfo farmUnit) {
		this.farmUnit = farmUnit;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public CulturalMethodeInfo getMethode() {
		return methode;
	}

	public void setMethode(CulturalMethodeInfo methode) {
		this.methode = methode;
	}

	public CulturalTypeInfo getType() {
		return type;
	}

	public void setType(CulturalTypeInfo type) {
		this.type = type;
	}

	public OperationInfo getOperation() {
		return operation;
	}

	public void setOperation(OperationInfo operation) {
		this.operation = operation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getIteration() {
		return iteration;
	}

	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Float getSurface() {
		return surface;
	}

	public void setSurface(Float surface) {
		this.surface = surface;
	}

	public Float getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(Float fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	public Integer getManpower() {
		return manpower;
	}

	public void setManpower(Integer manpower) {
		this.manpower = manpower;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LargeculturalVarietyInfo getVariety() {
		return variety;
	}

	public void setVariety(LargeculturalVarietyInfo variety) {
		this.variety = variety;
	}

	public CulturalCategoryInfo getCategory() {
		return category;
	}

	public void setCategory(CulturalCategoryInfo category) {
		this.category = category;
	}

}