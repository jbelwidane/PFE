package com.gestionagricole.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({ @NamedQuery(name = "findClimatologyByDate", query = "select c from Climatology c where  c.measuringDate =  :measuringDate ") })
@Entity
@Table(name = "C005_CLIMATOLOGIES")
public class Climatology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clim_id", nullable = false)
	private Integer id;

	@Column(name = "clim_temperature_min", nullable = false)
	private Float temperatureMin;

	@Column(name = "clim_temperature_max", nullable = false)
	private Float temperatureMax;

	@Column(name = "clim_temperature_moy", nullable = false)
	private Float temperatureMoy;

	@Temporal(TemporalType.DATE)
	@Column(name = "clim_measuring_date", nullable = false)
	private Date measuringDate;

	@Column(name = "clim_note", nullable = false)
	private String note;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(Float temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public Float getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(Float temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public Float getTemperatureMoy() {
		return temperatureMoy;
	}

	public void setTemperatureMoy(Float temperatureMoy) {
		this.temperatureMoy = temperatureMoy;
	}

	public Date getMeasuringDate() {
		return measuringDate;
	}

	public void setMeasuringDate(Date measuringDate) {
		this.measuringDate = measuringDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}