package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gestionagricole.constant.OperationConstants.OPERATION_SCOPE;

@Entity
@Table(name = "C007_OPERATIONS")
public class Operation {

	@Id
	@Column(name = "op_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "op_label")
	private String label;

	@Column(name = "op_sigle")
	private String sigle;

	@Column(name = "op_tri")
	private String tri;

	@Enumerated(EnumType.STRING)
	@Column(name = "op_scope")
	private OPERATION_SCOPE operationScope;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = OperationType.class)
	@JoinColumn(name = "op_operation_type")
	private OperationType operationType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public OPERATION_SCOPE getOperationScope() {
		return operationScope;
	}

	public void setOperationScope(OPERATION_SCOPE operationScope) {
		this.operationScope = operationScope;
	}

}