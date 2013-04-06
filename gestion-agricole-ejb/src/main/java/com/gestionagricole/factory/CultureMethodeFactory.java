package com.gestionagricole.factory;

import com.gestionagricole.dto.CulturalMethodeInfo;
import com.gestionagricole.entity.CulturalMethode;

public class CultureMethodeFactory {

	/**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static CulturalMethodeInfo createDto(CulturalMethode cultureMethode)
   {
           CulturalMethodeInfo cultureMethodeInfo = new CulturalMethodeInfo();

           if (cultureMethode==null)
              return cultureMethodeInfo;

           if (cultureMethode.getId()!=null)
                   cultureMethodeInfo.setUid(getUid(cultureMethode));

           cultureMethodeInfo.setLabel(cultureMethode.getLabel());

           return cultureMethodeInfo;
   }

   private static String getUid(CulturalMethode cultureMethode) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(cultureMethode.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalMethode createEntity(CulturalMethodeInfo cultureMethodeInfo)
   {
           CulturalMethode cultureMethode = new CulturalMethode();
           return updateEntity(cultureMethode, cultureMethodeInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static CulturalMethode updateEntity(CulturalMethode cultureMethode, CulturalMethodeInfo cultureMethodeInfo)
   {

           cultureMethode.setLabel(cultureMethodeInfo.getLabel());

           return cultureMethode;
   }

}