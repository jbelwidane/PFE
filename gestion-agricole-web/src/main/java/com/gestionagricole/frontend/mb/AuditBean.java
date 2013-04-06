package com.gestionagricole.frontend.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import com.gestionagricole.dto.AuditInfo;

@ManagedBean(name = "audit")
public class AuditBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AuditBean selected;
	private AuditInfo auditInfo = new AuditInfo();

	public AuditBean() {
		// TODO Auto-generated constructor stub
	}

	public AuditBean getSelected() {
		return selected;
	}

	public void setSelected(AuditBean auditBean) {
		this.selected = auditBean;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}