package com.gestionagricole.dto;

import java.io.Serializable;

public class TownInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public String uid;
	public String label;

	public ProvinceInfo province;

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

	public ProvinceInfo getProvince() {
		return province;
	}

	public void setProvince(ProvinceInfo province) {
		this.province = province;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(label);
		return buffer.toString();
	}
}