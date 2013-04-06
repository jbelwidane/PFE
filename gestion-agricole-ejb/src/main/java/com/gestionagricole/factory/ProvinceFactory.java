
package com.gestionagricole.factory;

import com.gestionagricole.dto.ProvinceInfo;
import com.gestionagricole.entity.Province;

public class ProvinceFactory
{
	
	
	public static Long getId(String uid){
		
		String[] s = uid.split("\\.");
		
		if( s.length == 3)
			return new Long(s[2]);
		
		return 0L;
	}
	
	public static String getUid(Province province)
	{
		return province.getId()+"";
	}
	/**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static ProvinceInfo createDto(Province province)
   {
           ProvinceInfo provinceInfo = new ProvinceInfo();

           if (province==null)
              return provinceInfo;

           if (province.getId()!=null)
                   provinceInfo.setUid(getUid(province));

           provinceInfo.setLabel(province.getLabel());

           return provinceInfo;
   }

   /**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Province createEntity(ProvinceInfo provinceInfo)
   {
       Province province = new Province();
       return updateEntity(province, provinceInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Province updateEntity(Province province, ProvinceInfo provinceInfo)
   {
       province.setLabel(provinceInfo.getLabel());
       return province;
   }


}