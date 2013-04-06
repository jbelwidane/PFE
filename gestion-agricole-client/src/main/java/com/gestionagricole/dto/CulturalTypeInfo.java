package com.gestionagricole.dto;

import java.io.Serializable;

public class CulturalTypeInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private String speculation;

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

	public String getSpeculation() {
		return speculation;
	}

	public void setSpeculation(String speculation) {
		this.speculation = speculation;
	}


}