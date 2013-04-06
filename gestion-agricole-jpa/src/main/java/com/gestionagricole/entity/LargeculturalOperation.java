package com.gestionagricole.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "D006_LARGECULTURAL_OPERATIONS")
public class LargeculturalOperation extends CulturalOperation {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = LargeculturalVariety.class)
	@JoinColumn(name = "var_pk_fk")
	private LargeculturalVariety variety;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CulturalCategory.class)
	@JoinColumn(name = "cultural_category_pk_fk")
	private CulturalCategory category;
	
	public LargeculturalVariety getVariety() {
		return variety;
	}

	public void setVariety(LargeculturalVariety variety) {
		this.variety = variety;
	}

	
}