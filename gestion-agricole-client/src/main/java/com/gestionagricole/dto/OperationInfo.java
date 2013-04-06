package com.gestionagricole.dto;

import java.io.Serializable;

import com.gestionagricole.constant.OperationConstants.OPERATION_SCOPE;

public class OperationInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private String sigle;

	private String tri;

	private OPERATION_SCOPE operationScope;

	private OperationTypeInfo operationType;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getTri() {
		return tri;
	}

	public void setTri(String tri) {
		this.tri = tri;
	}

	public OPERATION_SCOPE getOperationScope() {
		return operationScope;
	}

	public void setOperationScope(OPERATION_SCOPE operationScope) {
		this.operationScope = operationScope;
	}

	public OperationTypeInfo getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationTypeInfo operationType) {
		this.operationType = operationType;
	}


}