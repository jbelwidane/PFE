package com.gestionagricole.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "D004_ARBORICULTURAL_PLANS")
public class ArboriculturalPlan extends CulturalPlan {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = ArboriculturalVariety.class)
	@JoinColumn(name = "arb_variety_pk_fk")
	private ArboriculturalVariety variety;

	public ArboriculturalVariety getVariety() {
		return variety;
	}

	public void setVariety(ArboriculturalVariety variety) {
		this.variety = variety;
	}

}