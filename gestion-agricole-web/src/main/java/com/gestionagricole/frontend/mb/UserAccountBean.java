package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.UserAccountInfo;

@ManagedBean(name = "userAccount")
public class UserAccountBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserAccountBean selected;
	private UserAccountInfo info = new UserAccountInfo();

	public UserAccountBean() {
		// TODO Auto-generated constructor stub
	}

	public UserAccountBean getSelected() {
		return selected;
	}

	public void setSelected(UserAccountBean bean) {
		this.selected = bean;
	}

	public UserAccountInfo getInfo() {
		return info;
	}

	public void setInfo(UserAccountInfo info) {
		this.info = info;
	}

}