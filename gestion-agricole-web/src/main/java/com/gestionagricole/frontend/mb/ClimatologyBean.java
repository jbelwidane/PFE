package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.ClimatologyInfo;

@ManagedBean(name = "climatology")
public class ClimatologyBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ClimatologyBean selected;
	private ClimatologyInfo climatology = new ClimatologyInfo();

	public ClimatologyBean() {}

	public ClimatologyBean getSelected() {
		return selected;
	}

	public void setSelected(ClimatologyBean selected) {
		this.selected = selected;
	}

	public ClimatologyInfo getClimatology() {
		return climatology;
	}

	public void setClimatology(ClimatologyInfo climatology) {
		this.climatology = climatology;
	}
}