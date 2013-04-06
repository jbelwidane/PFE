package com.gestionagricole.dto;

import java.io.Serializable;

public class ArboriculturalVarietyInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String code;

	private String label;

	private CulturalTypeInfo type;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public CulturalTypeInfo getType() {
		return type;
	}

	public void setType(CulturalTypeInfo type) {
		this.type = type;
	}

}