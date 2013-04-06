package com.gestionagricole.dto;

import java.io.Serializable;

public class MeasuringUnitInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String uid;
	private String label;

	private String sigle;

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

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(label);
		return buffer.toString();
	}
}
