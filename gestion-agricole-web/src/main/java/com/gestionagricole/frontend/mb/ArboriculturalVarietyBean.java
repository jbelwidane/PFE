package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.ArboriculturalVarietyInfo;

@ManagedBean(name = "arboriculturalVariety")
public class ArboriculturalVarietyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArboriculturalVarietyBean selected;
	private ArboriculturalVarietyInfo info = new ArboriculturalVarietyInfo();

	public ArboriculturalVarietyBean() {
	}

	public ArboriculturalVarietyBean getSelected() {
		return selected;
	}

	public void setSelected(ArboriculturalVarietyBean selected) {
		this.selected = selected;
	}

	public ArboriculturalVarietyInfo getInfo() {
		return info;
	}

	public void setInfo(ArboriculturalVarietyInfo info) {
		this.info = info;
	}

}