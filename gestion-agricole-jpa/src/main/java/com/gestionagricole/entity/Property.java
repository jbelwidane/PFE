package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@NamedQueries({
//		@NamedQuery(name = "findAlProperty", query = "select a from Property p") })

@Entity
@Table(name = "D002_PROPERTIES")
public class Property {

	@Id
	@Column(name = "property_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "property_label")
	private String label;

	@Column(name = "property_land_title_number")
	private Integer landTitlenumber;

	@Column(name = "property_surface_general")
	private Float generalSurface;

	@Column(name = "property_surface_usable")
	private Float usableSurface;

	@Column(name = "property_surface_planting")
	private Float plantingSurface;

	@Column(name = "property_surface_forest")
	private Float forestSurface;

	@Column(name = "property_surface_uncultivated")
	private Float uncultivatedSurface;

	@Column(name = "property_surface_variums")
	private Float variusSurfaces;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	@JoinColumn(name = "farm_unit_pk_fk")
	private FarmUnit farmUnit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public FarmUnit getFarmUnit() {
		return farmUnit;
	}

	public void setFarmUnit(FarmUnit farmUnit) {
		this.farmUnit = farmUnit;
	}

}