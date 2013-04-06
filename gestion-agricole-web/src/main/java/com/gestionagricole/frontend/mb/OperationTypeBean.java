package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.OperationTypeInfo;

@ManagedBean(name = "operationType")
public class OperationTypeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OperationTypeBean selected;
	private OperationTypeInfo info = new OperationTypeInfo();

	public OperationTypeBean getSelected() {
		return selected;
	}

	public void setSelected(OperationTypeBean bean) {
		this.selected = bean;
	}

	public OperationTypeInfo getInfo() {
		return info;
	}

	public void setInfo(OperationTypeInfo info) {
		this.info = info;
	}

	public OperationTypeBean() {
		// TODO Auto-generated constructor stub
	}

}