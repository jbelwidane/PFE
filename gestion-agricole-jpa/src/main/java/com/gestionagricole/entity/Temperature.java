package com.gestionagricole.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "findAllTemperature", query = "select t from Temperature t") }
)

@Entity
@Table(name = "C006_TEMPERATURES")
public class Temperature {

	@Id
	@Column(name = "temperature_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "temperature_min")
	private Float min;

	@Column(name = "temperature_max")
	private Float max;

	@Column(name = "temperature_moy")
	private Float moy;

	@Column(name = "temperature_date")
	private Date date;

	@OneToMany(mappedBy = "temperature", fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	private List<FarmUnit> farmUnits;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getMin() {
		return min;
	}

	public void setMin(Float min) {
		this.min = min;
	}

	public Float getMax() {
		return max;
	}

	public void setMax(Float max) {
		this.max = max;
	}

	public Float getMoy() {
		return moy;
	}

	public void setMoy(Float moy) {
		this.moy = moy;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// public OperationUnit[] unnamed_OperationUnit_ = new OperationUnit[0];
}