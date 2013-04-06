package com.gestionagricole.factory;

import com.gestionagricole.dto.CulturalCategoryInfo;
import com.gestionagricole.entity.CulturalCategory;

public class CulturalCategoryFactory {

	/**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static CulturalCategoryInfo createDto(CulturalCategory culturalCategory)
   {
           CulturalCategoryInfo culturalCategoryInfo = new CulturalCategoryInfo();

           if (culturalCategory==null)
              return culturalCategoryInfo;

           if (culturalCategory.getId()!=null)
                   culturalCategoryInfo.setUid(getUid(culturalCategory));

           culturalCategoryInfo.setCode(culturalCategory.getCode());
           culturalCategoryInfo.setLabel(culturalCategory.getLabel());

           return culturalCategoryInfo;
   }

   private static String getUid(CulturalCategory culturalCategory) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(culturalCategory.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalCategory createEntity(CulturalCategoryInfo culturalCategoryInfo)
   {
           CulturalCategory culturalCategory = new CulturalCategory();
           return updateEntity(culturalCategory, culturalCategoryInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalCategory updateEntity(CulturalCategory culturalCategory, CulturalCategoryInfo culturalCategoryInfo)
   {

           culturalCategory.setCode(culturalCategoryInfo.getCode());
           culturalCategory.setLabel(culturalCategoryInfo.getLabel());

           return culturalCategory;
   }

}