package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.gestionagricole.constant.OperationConstants.STATUS;

@MappedSuperclass
public class CulturalPlan {
	@Id
	@Column(name = "cultural_plan_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	@JoinColumn(name = "frmu_pk_fk")
	private FarmUnit farmUnit;

	@Enumerated(EnumType.STRING)
	@Column(name = "cultural_plan_status")
	private STATUS status;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalMethode.class)
	@JoinColumn(name = "cultural_methode_pf_fk")
	private CulturalMethode methode;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalType.class)
	@JoinColumn(name = "cultural_type_pf_fk")
	private CulturalType type;

	@Column(name = "cultural_plan_year")
	private Integer year;

	@Column(name = "cultural_plan_surface_planned")
	private Float plannedSurface;

	@Column(name = "cultural_plan_surface_realized")
	private Float realizedSurface;

	@Column(name = "cultural_plan_production_realized")
	private String realizedProduction;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = MeasuringUnit.class)
	@JoinColumn(name = "measuring_unit_production_pk_fk")
	private MeasuringUnit productionMeasuringUnit;

	@Column(name = "cultural_plan_stock_value")
	private Float stockValue;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = MeasuringUnit.class)
	@JoinColumn(name = "measuring_unit_stock_pk_fk")
	private MeasuringUnit stockMeasuringUnit;

	@Column(name = "cultural_plan_surface_affected")
	private Float affectedSurface;

	@Column(name = "cultural_plan_surface_declassified")
	private Float declassifiedSurface;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
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

	public MeasuringUnit getProductionMeasuringUnit() {
		return productionMeasuringUnit;
	}

	public void setProductionMeasuringUnit(MeasuringUnit productionMeasuringUnit) {
		this.productionMeasuringUnit = productionMeasuringUnit;
	}

	public Float getStockValue() {
		return stockValue;
	}

	public void setStockValue(Float stockValue) {
		this.stockValue = stockValue;
	}

	public MeasuringUnit getStockMeasuringUnit() {
		return stockMeasuringUnit;
	}

	public void setStockMeasuringUnit(MeasuringUnit stockMeasuringUnit) {
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

	public FarmUnit getFarmUnit() {
		return farmUnit;
	}

	public void setFarmUnit(FarmUnit farmUnit) {
		this.farmUnit = farmUnit;
	}

	public CulturalMethode getMethode() {
		return methode;
	}

	public void setMethode(CulturalMethode methode) {
		this.methode = methode;
	}

	public CulturalType getType() {
		return type;
	}

	public void setType(CulturalType type) {
		this.type = type;
	}
}