package com.gestionagricole.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "D003_ARBORICULTRURAL_OPERATIONS")
public class ArboriculturalOperation extends CulturalOperation {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = ArboriculturalVariety.class)
	@JoinColumn(name = "var_pk_fk")
	private ArboriculturalVariety variety;

	public ArboriculturalVariety getVariety() {
		return variety;
	}

	public void setVariety(ArboriculturalVariety variety) {
		this.variety = variety;
	}

}