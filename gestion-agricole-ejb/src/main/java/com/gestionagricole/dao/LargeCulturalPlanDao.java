package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.LargeculturalPlan;

@Local
public interface LargeCulturalPlanDao
{
        public LargeculturalPlan createLargeCulturalPlan(LargeculturalPlan largeCulturalPlan) throws Exception;

        public boolean deleteLargeCulturalPlan(LargeculturalPlan largeCulturalPlan);

        public LargeculturalPlan updateLargeCulturalPlan(LargeculturalPlan largeCulturalPlan);
}
