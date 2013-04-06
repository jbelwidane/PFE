package com.gestionagricole.dto;

import java.io.Serializable;

public class ProvinceInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String uid;
	private String label;

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

	public ProvinceInfo() {
	}

	public ProvinceInfo(String label) {
		super();
		this.label = label;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(label);
		return buffer.toString();
	}
}