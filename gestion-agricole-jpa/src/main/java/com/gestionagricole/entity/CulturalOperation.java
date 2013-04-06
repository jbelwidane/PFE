package com.gestionagricole.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gestionagricole.constant.OperationConstants.STATUS;

@MappedSuperclass
public class CulturalOperation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cutural_operation_pk", nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	@JoinColumn(name = "frmu_pk_fk")
	private FarmUnit farmUnit;

	@Enumerated(EnumType.STRING)
	@Column(name = "cutural_operation_status")
	private STATUS status;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalMethode.class)
	@JoinColumn(name = "cultural_methode_pf_fk")
	private CulturalMethode methode;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalType.class)
	@JoinColumn(name = "cultural_type_pf_fk")
	private CulturalType type;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Operation.class)
	@JoinColumn(name = "op_operation_pf_fk")
	private Operation operation;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "cutural_operation_start_date")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "cutural_operation_end_date")
	private Date endDate;

	@Column(name = "cutural_operation_iteration")
	private Integer iteration;

	@Column(name = "cutural_operation_label")
	private String label;

	@Column(name = "cutural_operation_surface")
	private Float surface;

	@Column(name = "cutural_operation_fuel")
	private Float fuelUsed;

	@Column(name = "cutural_operation_manpower")
	private Integer manpower;

	@Column(name = "cutural_operation_note")
	private String note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getIteration() {
		return iteration;
	}

	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Float getSurface() {
		return surface;
	}

	public void setSurface(Float surface) {
		this.surface = surface;
	}

	public Float getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(Float fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	public Integer getManpower() {
		return manpower;
	}

	public void setManpower(Integer manpower) {
		this.manpower = manpower;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public CulturalMethode getMethode() {
		return methode;
	}

	public void setMethode(CulturalMethode methode) {
		this.methode = methode;
	}

	public CulturalType getType() {
		return type;
	}

	public void setType(CulturalType type) {
		this.type = type;
	}

	public FarmUnit getFarmUnit() {
		return farmUnit;
	}

	public void setFarmUnit(FarmUnit farmUnit) {
		this.farmUnit = farmUnit;
	}
}