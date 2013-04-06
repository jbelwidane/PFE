package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.ArboriculturalPlanInfo;

@ManagedBean(name = "arboriculturalPlan")
public class ArboriculturalPlanBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArboriculturalPlanBean selected;
	private ArboriculturalPlanInfo info = new ArboriculturalPlanInfo();

	public ArboriculturalPlanBean() {
	}

	public ArboriculturalPlanBean getSelected() {
		return selected;
	}

	public void setSelected(ArboriculturalPlanBean selected) {
		this.selected = selected;
	}

	public ArboriculturalPlanInfo getInfo() {
		return info;
	}

	public void setInfo(ArboriculturalPlanInfo info) {
		this.info = info;
	}

}