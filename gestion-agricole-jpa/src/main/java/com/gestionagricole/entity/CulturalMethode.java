package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "D010_CULTURAL_METHODES")
public class CulturalMethode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cultural_methode_pk", nullable = false)
	private Long id;

	@Column(name = "cultural_methode_label")
	private String label;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}