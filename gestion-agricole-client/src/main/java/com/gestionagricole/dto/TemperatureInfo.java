package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.Date;

public class TemperatureInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public String uid;
	public float min;
	public float max;
	public float moy;
	public Date date;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getMoy() {
		return moy;
	}

	public void setMoy(float moy) {
		this.moy = moy;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("min:");
		buffer.append(min);
		buffer.append(",");
		buffer.append("max:");
		buffer.append(max);
		buffer.append(",");
		buffer.append("moy:");
		buffer.append(moy);
		buffer.append(",");
		buffer.append("date:");
		buffer.append(date);
		return buffer.toString();
	}
}