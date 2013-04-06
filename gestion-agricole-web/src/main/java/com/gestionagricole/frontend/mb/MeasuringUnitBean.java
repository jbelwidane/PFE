package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.MeasuringUnitInfo;

@ManagedBean(name = "measuringUnit")
public class MeasuringUnitBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private MeasuringUnitBean selected;
	private MeasuringUnitInfo info = new MeasuringUnitInfo();

	public MeasuringUnitBean() {}
	
	public MeasuringUnitBean getSelected() {
		return selected;
	}

	public void setSelected(MeasuringUnitBean selected) {
		this.selected = selected;
	}

	public MeasuringUnitInfo getInfo() {
		return info;
	}

	public void setInfo(MeasuringUnitInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(info.getLabel());
		return buffer.toString();
	}
}
