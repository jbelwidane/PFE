package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.PropertyInfo;

@ManagedBean(name = "property")
public class PropertyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PropertyBean selected;
	private PropertyInfo info = new PropertyInfo();

	public PropertyBean() {
		// TODO Auto-generated constructor stub
	}

	public PropertyBean getSelected() {
		return selected;
	}

	public void setSelected(PropertyBean bean) {
		this.selected = bean;
	}

	public PropertyInfo getInfo() {
		return info;
	}

	public void setInfo(PropertyInfo info) {
		this.info = info;
	}

}