package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.PedologyInfo;

@ManagedBean(name = "pedology")
public class PedologyBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PedologyBean selected;
	private PedologyInfo info = new PedologyInfo();

	public PedologyBean() {
		// TODO Auto-generated constructor stub
	}

	public PedologyBean getSelected() {
		return selected;
	}

	public void setSelected(PedologyBean bean) {
		this.selected = bean;
	}

	public PedologyInfo getInfo() {
		return info;
	}

	public void setInfo(PedologyInfo info) {
		this.info = info;
	}

}