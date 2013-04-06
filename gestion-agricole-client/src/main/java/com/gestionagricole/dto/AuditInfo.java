package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.Date;

import com.gestionagricole.constant.OperationConstants.ACTION;
import com.gestionagricole.constant.OperationConstants.COMPONENT;

public class AuditInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private COMPONENT component;

	private String componentId;

	private Date updateDate;

	private ACTION updateType;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public COMPONENT getComponent() {
		return component;
	}

	public void setComponent(COMPONENT component) {
		this.component = component;
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public ACTION getUpdateType() {
		return updateType;
	}

	public void setUpdateType(ACTION updateType) {
		this.updateType = updateType;
	}


}