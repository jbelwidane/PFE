package com.gestionagricole.dto;

import java.io.Serializable;

import com.gestionagricole.constant.OperationConstants.STATUS;

public class LargeculturalPlanInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private FarmUnitInfo farmUnit;

	private STATUS status;

	private CulturalMethodeInfo methode;

	private CulturalTypeInfo type;

	private Integer year;

	private Float plannedSurface;

	private Float realizedSurface;

	private String realizedProduction;

	private MeasuringUnitInfo productionMeasuringUnit;

	private Float stockValue;

	private MeasuringUnitInfo stockMeasuringUnit;

	private Float affectedSurface;

	private Float declassifiedSurface;

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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getPlannedSurface() {
		return plannedSurface;
	}

	public void setPlannedSurface(Float plannedSurface) {
		this.plannedSurface = plannedSurface;
	}

	public Float getRealizedSurface() {
		return realizedSurface;
	}

	public void setRealizedSurface(Float realizedSurface) {
		this.realizedSurface = realizedSurface;
	}

	public String getRealizedProduction() {
		return realizedProduction;
	}

	public void setRealizedProduction(String realizedProduction) {
		this.realizedProduction = realizedProduction;
	}

	public MeasuringUnitInfo getProductionMeasuringUnit() {
		return productionMeasuringUnit;
	}

	public void setProductionMeasuringUnit(
			MeasuringUnitInfo productionMeasuringUnit) {
		this.productionMeasuringUnit = productionMeasuringUnit;
	}

	public Float getStockValue() {
		return stockValue;
	}

	public void setStockValue(Float stockValue) {
		this.stockValue = stockValue;
	}

	public MeasuringUnitInfo getStockMeasuringUnit() {
		return stockMeasuringUnit;
	}

	public void setStockMeasuringUnit(MeasuringUnitInfo stockMeasuringUnit) {
		this.stockMeasuringUnit = stockMeasuringUnit;
	}

	public Float getAffectedSurface() {
		return affectedSurface;
	}

	public void setAffectedSurface(Float affectedSurface) {
		this.affectedSurface = affectedSurface;
	}

	public Float getDeclassifiedSurface() {
		return declassifiedSurface;
	}

	public void setDeclassifiedSurface(Float declassifiedSurface) {
		this.declassifiedSurface = declassifiedSurface;
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