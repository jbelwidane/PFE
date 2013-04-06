package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.CulturalCategoryInfo;

@ManagedBean(name = "culturalCategory")
public class CulturalCategoryBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CulturalCategoryBean selected;
	private CulturalCategoryInfo info = new CulturalCategoryInfo();

	public CulturalCategoryBean() {
	}

	public CulturalCategoryBean getSelected() {
		return selected;
	}

	public void setSelected(CulturalCategoryBean bean) {
		this.selected = bean;
	}

	public CulturalCategoryInfo getInfo() {
		return info;
	}

	public void setInfo(CulturalCategoryInfo info) {
		this.info = info;
	}

}