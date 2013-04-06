package com.gestionagricole.factory;

import com.gestionagricole.dto.LargeculturalPlanInfo;
import com.gestionagricole.entity.LargeculturalPlan;

public class LargeCulturalPlanFactory {
	
	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static LargeculturalPlanInfo createDto(LargeculturalPlan largeCulturalPlan)
   {
           LargeculturalPlanInfo largeCulturalPlanInfo = new LargeculturalPlanInfo();

           if (largeCulturalPlan==null)
              return largeCulturalPlanInfo;

           if (largeCulturalPlan.getId()!=null)
                   largeCulturalPlanInfo.setUid(getUid(largeCulturalPlan));

//           largeCulturalPlanInfo.setFarmUnit(largeCulturalPlan.getFarmUnit());
           largeCulturalPlanInfo.setStatus(largeCulturalPlan.getStatus());
//           largeCulturalPlanInfo.setMethode(largeCulturalPlan.getMethode());
//           largeCulturalPlanInfo.setType(largeCulturalPlan.getType());
           largeCulturalPlanInfo.setYear(largeCulturalPlan.getYear());
           largeCulturalPlanInfo.setPlannedSurface(largeCulturalPlan.getPlannedSurface());
           largeCulturalPlanInfo.setRealizedSurface(largeCulturalPlan.getRealizedSurface());
           largeCulturalPlanInfo.setRealizedProduction(largeCulturalPlan.getRealizedProduction());
//           largeCulturalPlanInfo.setProductionMeasuringUnit(largeCulturalPlan.getProductionMeasuringUnit());
           largeCulturalPlanInfo.setStockValue(largeCulturalPlan.getStockValue());
//           largeCulturalPlanInfo.setStockMeasuringUnit(largeCulturalPlan.getStockMeasuringUnit());
           largeCulturalPlanInfo.setAffectedSurface(largeCulturalPlan.getAffectedSurface());
//           largeCulturalPlanInfo.setVariety(largeCulturalPlan.getVariety());
//           largeCulturalPlanInfo.setCategory(largeCulturalPlan.getCategory());

           return largeCulturalPlanInfo;
   }

   private static String getUid(LargeculturalPlan largeCulturalPlan) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(largeCulturalPlan.getFarmUnit().getArea().getId()).append(".");
	   builder.append(largeCulturalPlan.getFarmUnit().getId()).append(".");
	   builder.append(largeCulturalPlan.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalPlan createEntity(LargeculturalPlanInfo largeCulturalPlanInfo)
   {
           LargeculturalPlan largeCulturalPlan = new LargeculturalPlan();
           return updateEntity(largeCulturalPlan, largeCulturalPlanInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalPlan updateEntity(LargeculturalPlan largeCulturalPlan, LargeculturalPlanInfo largeCulturalPlanInfo)
   {

//           largeCulturalPlan.setFarmUnit(largeCulturalPlanInfo.getFarmUnit());
           largeCulturalPlan.setStatus(largeCulturalPlanInfo.getStatus());
//           largeCulturalPlan.setMethode(largeCulturalPlanInfo.getMethode());
//           largeCulturalPlan.setType(largeCulturalPlanInfo.getType());
           largeCulturalPlan.setYear(largeCulturalPlanInfo.getYear());
           largeCulturalPlan.setPlannedSurface(largeCulturalPlanInfo.getPlannedSurface());
           largeCulturalPlan.setRealizedSurface(largeCulturalPlanInfo.getRealizedSurface());
           largeCulturalPlan.setRealizedProduction(largeCulturalPlanInfo.getRealizedProduction());
//           largeCulturalPlan.setProductionMeasuringUnit(largeCulturalPlanInfo.getProductionMeasuringUnit());
           largeCulturalPlan.setStockValue(largeCulturalPlanInfo.getStockValue());
//           largeCulturalPlan.setStockMeasuringUnit(largeCulturalPlanInfo.getStockMeasuringUnit());
           largeCulturalPlan.setAffectedSurface(largeCulturalPlanInfo.getAffectedSurface());
//           largeCulturalPlan.setVariety(largeCulturalPlanInfo.getVariety());
//           largeCulturalPlan.setCategory(largeCulturalPlanInfo.getCategory());

           return largeCulturalPlan;
   }


}