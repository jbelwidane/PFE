package com.gestionagricole.factory;

import com.gestionagricole.dto.PedologyInfo;
import com.gestionagricole.entity.Pedology;

public class PedologyFactory {
	

	 /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static PedologyInfo createDto(Pedology pedology)
   {
           PedologyInfo pedologyInfo = new PedologyInfo();

           if (pedology==null)
              return pedologyInfo;

           if (pedology.getId()!=null)
                   pedologyInfo.setUid(getUid(pedology));

           pedologyInfo.setLabel(pedology.getLabel());

           return pedologyInfo;
   }

   private static String getUid(Pedology pedology) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(pedology.getId());
	   return builder.toString();
   }

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Pedology createEntity(PedologyInfo pedologyInfo)
   {
           Pedology pedology = new Pedology();
           return updateEntity(pedology, pedologyInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Pedology updateEntity(Pedology pedology, PedologyInfo pedologyInfo)
   {

           pedology.setLabel(pedologyInfo.getLabel());

           return pedology;
   }

}