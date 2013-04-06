package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.LargeculturalVarietyInfo;

@ManagedBean(name = "largeculturalVariety")
public class LargeculturalVarietyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LargeculturalVarietyBean selected;
	private LargeculturalVarietyInfo info = new LargeculturalVarietyInfo();

	public LargeculturalVarietyBean() {
		// TODO Auto-generated constructor stub
	}

	public LargeculturalVarietyBean getSelected() {
		return selected;
	}

	public void setSelected(LargeculturalVarietyBean bean) {
		this.selected = bean;
	}

	public LargeculturalVarietyInfo getInfo() {
		return info;
	}

	public void setInfo(LargeculturalVarietyInfo info) {
		this.info = info;
	}

}