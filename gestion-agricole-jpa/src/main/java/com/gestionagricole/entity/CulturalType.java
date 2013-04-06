package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "D009_CULTRURAL_TYPES")
public class CulturalType {

	@Id
	@Column(name = "cultural_type_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cultural_type_label")
	private String label;

	@Column(name = "cultural_type_speculation")
	private String speculation;

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

	public String getSpeculation() {
		return speculation;
	}

	public void setSpeculation(String speculation) {
		this.speculation = speculation;
	}

}