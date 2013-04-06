package com.gestionagricole.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gestionagricole.constant.OperationConstants.ACTION;
import com.gestionagricole.constant.OperationConstants.COMPONENT;

@Entity
@Table(name = "A001_AUDITS")
public class Audit {

	@Id
	@Column(name = "audit_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "audit_component")
	private COMPONENT component;

	@Column(name = "audit_component_id")
	private String componentId;

	@Temporal(TemporalType.DATE)
	@Column(name = "cultural_plan_update_date")
	private Date updateDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "cultural_plan_update_type")
	private ACTION updateType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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