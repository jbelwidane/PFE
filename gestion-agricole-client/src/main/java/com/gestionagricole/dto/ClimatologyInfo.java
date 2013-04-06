package com.gestionagricole.dto;

import java.io.Serializable;

public class ClimatologyInfo implements Serializable {

	public static final long serialVersionUID = 1L;

	private String uid;
	private float temperatureMin;
	private float temperatureMax;
	private float temperatureMoy;
	private String note;

	public ClimatologyInfo() {
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public float getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(float temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public float getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(float temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public float getTemperatureMoy() {
		return temperatureMoy;
	}

	public void setTemperatureMoy(float temperatureMoy) {
		this.temperatureMoy = temperatureMoy;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(temperatureMin);
		buffer.append(" ");
		buffer.append(temperatureMin);
		return buffer.toString();
	}

}