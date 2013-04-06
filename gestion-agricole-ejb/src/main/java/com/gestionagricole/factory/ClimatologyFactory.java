package com.gestionagricole.factory;

import com.gestionagricole.dto.ClimatologyInfo;
import com.gestionagricole.entity.Climatology;

public class ClimatologyFactory {

	/**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static ClimatologyInfo createDto(Climatology climatology)
   {
           ClimatologyInfo climatologyInfo = new ClimatologyInfo();

           if (climatology==null)
              return climatologyInfo;

           if (climatology.getId()!=null)
                   climatologyInfo.setUid(getUid(climatology));

           climatologyInfo.setTemperatureMin(climatology.getTemperatureMin());
           climatologyInfo.setTemperatureMax(climatology.getTemperatureMax());
           climatologyInfo.setTemperatureMoy(climatology.getTemperatureMoy());
           climatologyInfo.setNote(climatology.getNote());

           return climatologyInfo;
   }

   private static String getUid(Climatology climatology) {
	   StringBuilder builder = new StringBuilder();
		builder.append(climatology.getId());
		return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Climatology createEntity(ClimatologyInfo climatologyInfo)
   {
           Climatology climatology = new Climatology();
           return updateEntity(climatology, climatologyInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Climatology updateEntity(Climatology climatology, ClimatologyInfo climatologyInfo)
   {

           climatology.setTemperatureMin(climatologyInfo.getTemperatureMin());
           climatology.setTemperatureMax(climatologyInfo.getTemperatureMax());
           climatology.setTemperatureMoy(climatologyInfo.getTemperatureMoy());
           climatology.setNote(climatologyInfo.getNote());
           return climatology;
   }

}