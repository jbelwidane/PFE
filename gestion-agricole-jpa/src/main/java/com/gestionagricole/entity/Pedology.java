package com.gestionagricole.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "C004_PEDOLOGIES")
public class Pedology
{
	@Id
	@Column(name = "pedology_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "pedology_label")
	private String label;

	@OneToMany(mappedBy = "pedology", fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	private List<FarmUnit> farmUnits;

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

	public List<FarmUnit> getFarmUnits() {
		return farmUnits;
	}

	public void setFarmUnits(List<FarmUnit> farmUnits) {
		this.farmUnits = farmUnits;
	}
	
	
}