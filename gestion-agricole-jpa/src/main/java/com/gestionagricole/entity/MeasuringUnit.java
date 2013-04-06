package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "findMeasuringUnitBySigleAndLabel", query = "select m from MeasuringUnit as m where m.sigle = :measuringUnitSigle or m.label = :measuringUnitLabel"),
	@NamedQuery(name = "findAllMeasuringUnit", query = "select m from MeasuringUnit m") }
)
@Entity
@Table(name = "C009_MEASURING_UNITS")
public class MeasuringUnit {

	@Id
	@Column(name = "measuring_unit_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "measuring_unit_sigle")
	private String sigle;

	@Column(name = "measuring_unit_label")
	private String label;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	// public LargeCulturalPlan[] unnamed_LargeCulturalPlan_ = new
	// LargeCulturalPlan[0];
	// public ArboriCulturalPlan[] unnamed_ArboriCulturalPlan_ = new
	// ArboriCulturalPlan[0];
}