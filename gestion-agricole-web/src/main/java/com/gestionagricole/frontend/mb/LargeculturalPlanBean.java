package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.LargeculturalPlanInfo;

@ManagedBean(name = "largeculturalPlan")
public class LargeculturalPlanBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LargeculturalPlanBean selected;
	private LargeculturalPlanInfo info = new LargeculturalPlanInfo();

	public LargeculturalPlanBean() {
		// TODO Auto-generated constructor stub
	}

	public LargeculturalPlanBean getSelected() {
		return selected;
	}

	public void setSelected(LargeculturalPlanBean bean) {
		this.selected = bean;
	}

	public LargeculturalPlanInfo getInfo() {
		return info;
	}

	public void setInfo(LargeculturalPlanInfo info) {
		this.info = info;
	}

}