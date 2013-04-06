package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.LargeculturalOperationInfo;

@ManagedBean(name="largeculturalOperation")
public class LargeculturalOperationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LargeculturalOperationBean selected;
	private LargeculturalOperationInfo info = new LargeculturalOperationInfo();

	public LargeculturalOperationBean getSelected() {
		return selected;
	}

	public void setSelected(LargeculturalOperationBean bean) {
		this.selected = bean;
	}

	public LargeculturalOperationInfo getInfo() {
		return info;
	}

	public void setInfo(LargeculturalOperationInfo info) {
		this.info = info;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}