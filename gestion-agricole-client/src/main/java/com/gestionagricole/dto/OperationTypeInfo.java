package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.List;

public class OperationTypeInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private Integer orderNumber;

	private List<OperationInfo> operations;

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

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OperationInfo> getOperations() {
		return operations;
	}

	public void setOperations(List<OperationInfo> operations) {
		this.operations = operations;
	}
	
	

}