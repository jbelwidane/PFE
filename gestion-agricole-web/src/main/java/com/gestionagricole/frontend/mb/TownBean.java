package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.TownInfo;

@ManagedBean(name = "town")
public class TownBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TownBean selected;
	private TownInfo info = new TownInfo();

	public TownBean() {}
	
	public TownBean getSelected() {
		return selected;
	}

	public void setSelected(TownBean selected) {
		this.selected = selected;
	}

	public TownInfo getInfo() {
		return info;
	}

	public void setInfo(TownInfo info) {
		this.info = info;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(info.label);
		return buffer.toString();
	}
}