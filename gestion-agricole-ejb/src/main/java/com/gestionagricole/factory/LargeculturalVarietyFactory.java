package com.gestionagricole.factory;

import com.gestionagricole.dto.LargeculturalVarietyInfo;
import com.gestionagricole.entity.LargeculturalVariety;

public class LargeculturalVarietyFactory {
	
	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static LargeculturalVarietyInfo createDto(LargeculturalVariety largeculturalVariety)
   {
           LargeculturalVarietyInfo largeculturalVarietyInfo = new LargeculturalVarietyInfo();

           if (largeculturalVariety==null)
              return largeculturalVarietyInfo;

           if (largeculturalVariety.getId()!=null)
                   largeculturalVarietyInfo.setUid(getUid(largeculturalVariety));

           largeculturalVarietyInfo.setCode(largeculturalVariety.getCode());
           largeculturalVarietyInfo.setLabel(largeculturalVariety.getLabel());

           return largeculturalVarietyInfo;
   }

   private static String getUid(LargeculturalVariety largeculturalVariety) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(largeculturalVariety.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalVariety createEntity(LargeculturalVarietyInfo largeculturalVarietyInfo)
   {
           LargeculturalVariety largeculturalVariety = new LargeculturalVariety();
           return updateEntity(largeculturalVariety, largeculturalVarietyInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalVariety updateEntity(LargeculturalVariety largeculturalVariety, LargeculturalVarietyInfo largeculturalVarietyInfo)
   {

           largeculturalVariety.setCode(largeculturalVarietyInfo.getCode());
           largeculturalVariety.setLabel(largeculturalVarietyInfo.getLabel());

           return largeculturalVariety;
   }


}