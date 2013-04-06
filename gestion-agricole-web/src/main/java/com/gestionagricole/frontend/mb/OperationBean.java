package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.OperationInfo;

@ManagedBean(name = "operation")
public class OperationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OperationBean selected;
	private OperationInfo info = new OperationInfo();

	public OperationBean() {
		// TODO Auto-generated constructor stub
	}

	public OperationBean getSelected() {
		return selected;
	}

	public void setSelected(OperationBean bean) {
		this.selected = bean;
	}

	public OperationInfo getInfo() {
		return info;
	}

	public void setInfo(OperationInfo info) {
		this.info = info;
	}

}