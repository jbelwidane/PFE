package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.TemperatureInfo;

@ManagedBean(name = "temperature")
public class TemperatureBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TemperatureBean selected;
	private TemperatureInfo info = new TemperatureInfo();

	public TemperatureBean() {}
	
	public TemperatureBean getSelected() {
		return selected;
	}

	public void setSelected(TemperatureBean selected) {
		this.selected = selected;
	}

	public TemperatureInfo getInfo() {
		return info;
	}

	public void setInfo(TemperatureInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("min:");
		buffer.append(info.min);
		buffer.append(",");
		buffer.append("max:");
		buffer.append(info.max);
		buffer.append(",");
		buffer.append("moy:");
		buffer.append(info.moy);
		buffer.append(",");
		buffer.append("date:");
		buffer.append(info.date);
		return buffer.toString();
	}
}