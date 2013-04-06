package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.ArboriculturalPlan;


@Local
public interface ArboriCulturalPlanDao
{
        public ArboriculturalPlan createArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan) throws Exception;

        public boolean deleteArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan);

        public ArboriculturalPlan updateArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan);
}
