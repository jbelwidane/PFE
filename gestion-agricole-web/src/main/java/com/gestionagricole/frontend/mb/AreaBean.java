package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.AreaInfo;

@ManagedBean(name = "area")
public class AreaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private AreaBean selected;
	private AreaInfo info = new AreaInfo();

	public AreaBean() {}

	public AreaBean(String label) {
		super();
		info.setLabel(label);
	}

	public AreaBean(String uid, String label) {
		this(label);
		info.setUid(uid);
	}

	public AreaBean(AreaInfo a) {
		this(a.getUid(),a.getLabel());
	}

	public AreaInfo getInfo() {
		return info;
	}

	public void setInfo(AreaInfo info) {
		this.info = info;
	}

	public AreaBean getSelected() {
		return selected;
	}

	public void setSelected(AreaBean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(info.getUid());
		buffer.append(" ");
		buffer.append(info.getLabel());
		return buffer.toString();
	}

}