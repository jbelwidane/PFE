package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.CulturalCategory;


@Local
public interface CulturalCategoryDao
{
        public CulturalCategory createCulturalCategory(CulturalCategory culturalCategory) throws Exception;

        public boolean deleteCulturalCategory(CulturalCategory culturalCategory);

        public CulturalCategory updateCulturalCategory(CulturalCategory culturalCategory);
}
