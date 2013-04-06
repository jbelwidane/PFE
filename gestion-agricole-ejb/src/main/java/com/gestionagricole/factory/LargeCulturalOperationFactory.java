package com.gestionagricole.factory;

import com.gestionagricole.dto.LargeculturalOperationInfo;
import com.gestionagricole.entity.LargeculturalOperation;

public class LargeCulturalOperationFactory {
	 /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static LargeculturalOperationInfo createDto(LargeculturalOperation largeCulturalOperation)
   {
           LargeculturalOperationInfo largeCulturalOperationInfo = new LargeculturalOperationInfo();

           if (largeCulturalOperation==null)
              return largeCulturalOperationInfo;

           if (largeCulturalOperation.getId()!=null)
                   largeCulturalOperationInfo.setUid(getUid(largeCulturalOperation));

//           largeCulturalOperationInfo.setFarmUnit(largeCulturalOperation.getFarmUnit());
           largeCulturalOperationInfo.setStatus(largeCulturalOperation.getStatus());
//           largeCulturalOperationInfo.setMethode(largeCulturalOperation.getMethode());
//           largeCulturalOperationInfo.setType(largeCulturalOperation.getType());
//           largeCulturalOperationInfo.setOperation(largeCulturalOperation.getOperation());
           largeCulturalOperationInfo.setStartDate(largeCulturalOperation.getStartDate());
           largeCulturalOperationInfo.setEndDate(largeCulturalOperation.getEndDate());
           largeCulturalOperationInfo.setIteration(largeCulturalOperation.getIteration());
           largeCulturalOperationInfo.setLabel(largeCulturalOperation.getLabel());
           largeCulturalOperationInfo.setSurface(largeCulturalOperation.getSurface());
           largeCulturalOperationInfo.setFuelUsed(largeCulturalOperation.getFuelUsed());
           largeCulturalOperationInfo.setManpower(largeCulturalOperation.getManpower());
           largeCulturalOperationInfo.setNote(largeCulturalOperation.getNote());
//           largeCulturalOperationInfo.setVariety(largeCulturalOperation.getVariety());
//           largeCulturalOperationInfo.setCategory(largeCulturalOperation.getCategory());

           return largeCulturalOperationInfo;
   }

   private static String getUid(LargeculturalOperation largeCulturalOperation) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(largeCulturalOperation.getFarmUnit().getArea().getId()).append(".");
	   builder.append(largeCulturalOperation.getFarmUnit().getId()).append(".");
	   builder.append(largeCulturalOperation.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalOperation createEntity(LargeculturalOperationInfo largeCulturalOperationInfo)
   {
           LargeculturalOperation largeCulturalOperation = new LargeculturalOperation();
           return updateEntity(largeCulturalOperation, largeCulturalOperationInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static LargeculturalOperation updateEntity(LargeculturalOperation largeCulturalOperation, LargeculturalOperationInfo largeCulturalOperationInfo)
   {

//           largeCulturalOperation.setFarmUnit(largeCulturalOperationInfo.getFarmUnit());
           largeCulturalOperation.setStatus(largeCulturalOperationInfo.getStatus());
//           largeCulturalOperation.setMethode(largeCulturalOperationInfo.getMethode());
//           largeCulturalOperation.setType(largeCulturalOperationInfo.getType());
//           largeCulturalOperation.setOperation(largeCulturalOperationInfo.getOperation());
           largeCulturalOperation.setStartDate(largeCulturalOperationInfo.getStartDate());
           largeCulturalOperation.setEndDate(largeCulturalOperationInfo.getEndDate());
           largeCulturalOperation.setIteration(largeCulturalOperationInfo.getIteration());
           largeCulturalOperation.setLabel(largeCulturalOperationInfo.getLabel());
           largeCulturalOperation.setSurface(largeCulturalOperationInfo.getSurface());
           largeCulturalOperation.setFuelUsed(largeCulturalOperationInfo.getFuelUsed());
           largeCulturalOperation.setManpower(largeCulturalOperationInfo.getManpower());
           largeCulturalOperation.setNote(largeCulturalOperationInfo.getNote());
//           largeCulturalOperation.setVariety(largeCulturalOperationInfo.getVariety());
//           largeCulturalOperation.setCategory(largeCulturalOperationInfo.getCategory());
           return largeCulturalOperation;
   }

}