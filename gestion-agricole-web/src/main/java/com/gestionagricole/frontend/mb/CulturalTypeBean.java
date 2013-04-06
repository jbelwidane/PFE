package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.CulturalTypeInfo;

@ManagedBean(name = "culturalType")
public class CulturalTypeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CulturalTypeBean selected;
	private CulturalTypeInfo info = new CulturalTypeInfo();

	public CulturalTypeBean() {
	}

	public CulturalTypeBean getSelected() {
		return selected;
	}

	public void setSelected(CulturalTypeBean bean) {
		this.selected = bean;
	}

	public CulturalTypeInfo getInfo() {
		return info;
	}

	public void setInfo(CulturalTypeInfo info) {
		this.info = info;
	}

}