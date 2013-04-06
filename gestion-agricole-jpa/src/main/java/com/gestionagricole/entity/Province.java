package com.gestionagricole.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
		@NamedQuery(name = "findProvinceByLabel", query = "select p from Province as p where p.label = :provinceLabel"),
		@NamedQuery(name = "findAllProvince", query = "select p from Province p") }
)
@Entity
@Table(name = "C002_PROVINCES")
public class Province {

	@Id
	@Column(name = "province_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "province_label")
	private String label;

	@OneToMany(mappedBy = "province", fetch = FetchType.LAZY, targetEntity = Town.class)
	private List<Town> towns;

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

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

}