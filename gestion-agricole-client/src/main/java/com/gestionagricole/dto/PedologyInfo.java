package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.List;

public class PedologyInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private List<FarmUnitInfo> farmUnits;

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

	public List<FarmUnitInfo> getFarmUnits() {
		return farmUnits;
	}

	public void setFarmUnits(List<FarmUnitInfo> farmUnits) {
		this.farmUnits = farmUnits;
	}

}