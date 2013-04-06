package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.CulturalMethodeInfo;

@ManagedBean(name = "culturalMethode")
public class CulturalMethodeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CulturalMethodeBean selected;
	private CulturalMethodeInfo info = new CulturalMethodeInfo();

	public CulturalMethodeBean() {
	}

	public CulturalMethodeBean getSelected() {
		return selected;
	}

	public void setSelected(CulturalMethodeBean bean) {
		this.selected = bean;
	}

	public CulturalMethodeInfo getInfo() {
		return info;
	}

	public void setInfo(CulturalMethodeInfo info) {
		this.info = info;
	}

}