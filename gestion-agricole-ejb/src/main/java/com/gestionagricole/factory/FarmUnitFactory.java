package com.gestionagricole.factory;

import com.gestionagricole.dto.FarmUnitInfo;
import com.gestionagricole.entity.FarmUnit;

public class FarmUnitFactory {

	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static FarmUnitInfo createDto(FarmUnit farmUnit)
   {
           FarmUnitInfo farmUnitInfo = new FarmUnitInfo();

           if (farmUnit==null)
              return farmUnitInfo;

           if (farmUnit.getId()!=null)
                   farmUnitInfo.setUid(getUid(farmUnit));

           farmUnitInfo.setLabel(farmUnit.getLabel());
           farmUnitInfo.setOtherFeatures(farmUnit.getOtherFeatures());
//           farmUnitInfo.setTown(farmUnit.getTown());
//           farmUnitInfo.setArea(farmUnit.getArea());
//           farmUnitInfo.setClimatology(farmUnit.getClimatology());
//           farmUnitInfo.setTemperature(farmUnit.getTemperature());
//           farmUnitInfo.setPedology(farmUnit.getPedology());

           return farmUnitInfo;
   }

   private static String getUid(FarmUnit farmUnit) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(farmUnit.getArea().getId()).append(".");
	   builder.append(farmUnit.getId());
	   return builder.toString();	
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static FarmUnit createEntity(FarmUnitInfo farmUnitInfo)
   {
           FarmUnit farmUnit = new FarmUnit();
           return updateEntity(farmUnit, farmUnitInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static FarmUnit updateEntity(FarmUnit farmUnit, FarmUnitInfo farmUnitInfo)
   {

           farmUnit.setLabel(farmUnitInfo.getLabel());
           farmUnit.setOtherFeatures(farmUnitInfo.getOtherFeatures());
//           farmUnit.setTown(farmUnitInfo.getTown());
//           farmUnit.setArea(farmUnitInfo.getArea());
//           farmUnit.setClimatology(farmUnitInfo.getClimatology());
//           farmUnit.setTemperature(farmUnitInfo.getTemperature());
//           farmUnit.setPedology(farmUnitInfo.getPedology());

           return farmUnit;
   }

}