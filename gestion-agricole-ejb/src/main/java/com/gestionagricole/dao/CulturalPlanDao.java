package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.CulturalPlan;


@Local
public interface CulturalPlanDao
{
        public CulturalPlan createCulturalPlan(CulturalPlan culturalPlan) throws Exception;

        public boolean deleteCulturalPlan(CulturalPlan culturalPlan);

        public CulturalPlan updateCulturalPlan(CulturalPlan culturalPlan);
}
