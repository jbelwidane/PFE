package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.ArboriculturalOperationInfo;

@ManagedBean(name = "arboriculturalOperation")
public class ArboriculturalOperationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArboriculturalOperationBean selected;
	private ArboriculturalOperationInfo info = new ArboriculturalOperationInfo();
	
	public ArboriculturalOperationBean() {}
	
	public ArboriculturalOperationBean getSelected() {
		return selected;
	}
	public void setSelected(ArboriculturalOperationBean selected) {
		this.selected = selected;
	}
	public ArboriculturalOperationInfo getInfo() {
		return info;
	}
	public void setInfo(ArboriculturalOperationInfo info) {
		this.info = info;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


}