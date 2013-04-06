package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.ProvinceInfo;

@ManagedBean(name = "province")
public class ProvinceBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProvinceBean selected;
	private ProvinceInfo info = new ProvinceInfo();

	public ProvinceBean() {}
	
	public ProvinceBean(ProvinceInfo p) 
	{
		this(p.getUid(),p.getLabel());
	}

	public ProvinceBean(String uid, String label) 
	{
		info.setUid(uid);
		info.setLabel(label);
	}

	public ProvinceBean getSelected() {
		return selected;
	}

	public void setSelected(ProvinceBean selected) {
		this.selected = selected;
	}

	public ProvinceInfo getInfo() {
		return info;
	}

	public void setInfo(ProvinceInfo info) {
		this.info = info;
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