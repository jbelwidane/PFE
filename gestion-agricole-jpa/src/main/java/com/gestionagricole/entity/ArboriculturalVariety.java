package com.gestionagricole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "D005_ARBORICULTURAL_VARIETIES")
public class ArboriculturalVariety {
	@Id
	@Column(name = "arb_variety_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "arb_variety_code")
	private String code;

	@Column(name = "arb_variety_label")
	private String label;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalType.class)
	@JoinColumn(name = "cultural_type_pf_fk")
	private CulturalType type;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CulturalType getType() {
		return type;
	}

	public void setType(CulturalType type) {
		this.type = type;
	}
	
	

}