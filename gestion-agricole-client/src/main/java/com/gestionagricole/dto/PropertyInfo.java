package com.gestionagricole.dto;

import java.io.Serializable;


public class PropertyInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private Integer landTitlenumber;

	private Float generalSurface;

	private Float usableSurface;

	private Float plantingSurface;

	private Float forestSurface;

	private Float uncultivatedSurface;

	private Float variusSurfaces;

	private FarmUnitInfo farmUnit;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getLandTitlenumber() {
		return landTitlenumber;
	}

	public void setLandTitlenumber(Integer landTitlenumber) {
		this.landTitlenumber = landTitlenumber;
	}

	public Float getGeneralSurface() {
		return generalSurface;
	}

	public void setGeneralSurface(Float generalSurface) {
		this.generalSurface = generalSurface;
	}

	public Float getUsableSurface() {
		return usableSurface;
	}

	public void setUsableSurface(Float usableSurface) {
		this.usableSurface = usableSurface;
	}

	public Float getPlantingSurface() {
		return plantingSurface;
	}

	public void setPlantingSurface(Float plantingSurface) {
		this.plantingSurface = plantingSurface;
	}

	public Float getForestSurface() {
		return forestSurface;
	}

	public void setForestSurface(Float forestSurface) {
		this.forestSurface = forestSurface;
	}

	public Float getUncultivatedSurface() {
		return uncultivatedSurface;
	}

	public void setUncultivatedSurface(Float uncultivatedSurface) {
		this.uncultivatedSurface = uncultivatedSurface;
	}

	public Float getVariusSurfaces() {
		return variusSurfaces;
	}

	public void setVariusSurfaces(Float variusSurfaces) {
		this.variusSurfaces = variusSurfaces;
	}

	public FarmUnitInfo getFarmUnit() {
		return farmUnit;
	}

	public void setFarmUnit(FarmUnitInfo farmUnit) {
		this.farmUnit = farmUnit;
	}
	
	

}