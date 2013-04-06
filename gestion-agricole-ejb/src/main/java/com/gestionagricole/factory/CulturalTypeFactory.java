package com.gestionagricole.factory;

import com.gestionagricole.dto.CulturalTypeInfo;
import com.gestionagricole.entity.CulturalType;

public class CulturalTypeFactory {

	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static CulturalTypeInfo createDto(CulturalType culturalType)
   {
           CulturalTypeInfo culturalTypeInfo = new CulturalTypeInfo();

           if (culturalType==null)
              return culturalTypeInfo;

           if (culturalType.getId()!=null)
                   culturalTypeInfo.setUid(getUid(culturalType));

           culturalTypeInfo.setLabel(culturalType.getLabel());
           culturalTypeInfo.setSpeculation(culturalType.getSpeculation());

           return culturalTypeInfo;
   }

   private static String getUid(CulturalType culturalType) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(culturalType.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalType createEntity(CulturalTypeInfo culturalTypeInfo)
   {
           CulturalType culturalType = new CulturalType();
           return updateEntity(culturalType, culturalTypeInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalType updateEntity(CulturalType culturalType, CulturalTypeInfo culturalTypeInfo)
   {

           culturalType.setLabel(culturalTypeInfo.getLabel());
           culturalType.setSpeculation(culturalTypeInfo.getSpeculation());

           return culturalType;
   }

}