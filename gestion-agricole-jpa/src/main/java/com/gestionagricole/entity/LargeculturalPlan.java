package com.gestionagricole.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "D007_LARGECULTURAL_PLANS")
public class LargeculturalPlan extends CulturalPlan 
{
	
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