package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.FarmUnitInfo;

@ManagedBean(name = "farmUnit")
public class FarmUnitBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FarmUnitBean selected;
	private FarmUnitInfo info = new FarmUnitInfo();

	public FarmUnitBean() {
		// TODO Auto-generated constructor stub
	}

	public FarmUnitBean getSelected() {
		return selected;
	}

	public void setSelected(FarmUnitBean bean) {
		this.selected = bean;
	}

	public FarmUnitInfo getInfo() {
		return info;
	}

	public void setInfo(FarmUnitInfo info) {
		this.info = info;
	}

}