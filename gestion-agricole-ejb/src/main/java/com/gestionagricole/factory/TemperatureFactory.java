
package com.gestionagricole.factory;

import com.gestionagricole.dto.TemperatureInfo;
import com.gestionagricole.entity.Temperature;

public class TemperatureFactory
{
	
public static Long getId(String uid){
		
		String[] s = uid.split("\\.");
		
		if( s.length == 3)
			return new Long(s[2]);
		
		return 0L;
	}
	
	public static String getUid(Temperature temperature)
	{
		return temperature.getId()+"";
	}
	
	/**
	 * Create a Dto from an Entity
	 * @param an Entity
	 * @return a Dto
	 */

	public static TemperatureInfo createDto(Temperature temperature)
   {
           TemperatureInfo temperatureInfo = new TemperatureInfo();

           if (temperature==null)
              return temperatureInfo;

           if (temperature.getId()!=null)
               temperatureInfo.uid = getUid(temperature);

           temperatureInfo.min = temperature.getMin();
           temperatureInfo.max = temperature.getMax();
           temperatureInfo.moy = temperature.getMoy();
           temperatureInfo.date = temperature.getDate();

           return temperatureInfo;
   }

	/**
	 * Create a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Temperature createEntity(TemperatureInfo temperatureInfo) {
		Temperature temperature = new Temperature();
		return updateEntity(temperature, temperatureInfo);
	}

	/**
	 * Update a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Temperature updateEntity(Temperature temperature,TemperatureInfo temperatureInfo) 
	{
		temperature.setMin(temperatureInfo.min);
		temperature.setMax(temperatureInfo.max);
		temperature.setMoy(temperatureInfo.moy);
		temperature.setDate(temperatureInfo.date);

		return temperature;
	}
}