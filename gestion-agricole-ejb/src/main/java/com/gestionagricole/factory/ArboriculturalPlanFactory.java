package com.gestionagricole.factory;

import com.gestionagricole.dto.ArboriculturalVarietyInfo;
import com.gestionagricole.entity.ArboriculturalVariety;

public class ArboriculturalPlanFactory {

	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static ArboriculturalVarietyInfo createDto(ArboriculturalVariety arboriculturalVariety)
   {
           ArboriculturalVarietyInfo arboriculturalVarietyInfo = new ArboriculturalVarietyInfo();

           if (arboriculturalVariety==null)
              return arboriculturalVarietyInfo;

           if (arboriculturalVariety.getId()!=null)
                   arboriculturalVarietyInfo.setUid(getUid(arboriculturalVariety));

           arboriculturalVarietyInfo.setCode(arboriculturalVariety.getCode());
           arboriculturalVarietyInfo.setLabel(arboriculturalVariety.getLabel());
//           arboriculturalVarietyInfo.setType(arboriculturalVariety.getType());

           return arboriculturalVarietyInfo;
   }

   private static String getUid(ArboriculturalVariety arboriculturalVariety) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(arboriculturalVariety.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static ArboriculturalVariety createEntity(ArboriculturalVarietyInfo arboriculturalVarietyInfo)
   {
           ArboriculturalVariety arboriculturalVariety = new ArboriculturalVariety();
           return updateEntity(arboriculturalVariety, arboriculturalVarietyInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static ArboriculturalVariety updateEntity(ArboriculturalVariety arboriculturalVariety, ArboriculturalVarietyInfo arboriculturalVarietyInfo)
   {

           arboriculturalVariety.setCode(arboriculturalVarietyInfo.getCode());
           arboriculturalVariety.setLabel(arboriculturalVarietyInfo.getLabel());
//           arboriculturalVariety.setType(arboriculturalVarietyInfo.getType());

           return arboriculturalVariety;
   }

}