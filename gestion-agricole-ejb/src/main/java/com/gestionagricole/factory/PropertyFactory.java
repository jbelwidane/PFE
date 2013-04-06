package com.gestionagricole.factory;

import com.gestionagricole.dto.PropertyInfo;
import com.gestionagricole.entity.Property;

public class PropertyFactory {
	

	/**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static PropertyInfo createDto(Property property)
   {
           PropertyInfo propertyInfo = new PropertyInfo();

           if (property==null)
              return propertyInfo;

           if (property.getId()!=null)
                   propertyInfo.setUid(getUid(property));

           propertyInfo.setLabel(property.getLabel());
           propertyInfo.setLandTitlenumber(property.getLandTitlenumber());
           propertyInfo.setGeneralSurface(property.getGeneralSurface());
           propertyInfo.setUsableSurface(property.getUsableSurface());
           propertyInfo.setPlantingSurface(property.getPlantingSurface());
           propertyInfo.setForestSurface(property.getForestSurface());
           propertyInfo.setUncultivatedSurface(property.getUncultivatedSurface());
           propertyInfo.setVariusSurfaces(property.getVariusSurfaces());

           return propertyInfo;
   }

   private static String getUid(Property property) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(property.getFarmUnit().getArea().getId()).append(".");
	   builder.append(property.getFarmUnit().getId()).append(".");
	   builder.append(property.getId());
	   return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Property createEntity(PropertyInfo propertyInfo)
   {
           Property property = new Property();
           return updateEntity(property, propertyInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Property updateEntity(Property property, PropertyInfo propertyInfo)
   {

           property.setLabel(propertyInfo.getLabel());
           property.setLandTitlenumber(propertyInfo.getLandTitlenumber());
           property.setGeneralSurface(propertyInfo.getGeneralSurface());
           property.setUsableSurface(propertyInfo.getUsableSurface());
           property.setPlantingSurface(propertyInfo.getPlantingSurface());
           property.setForestSurface(propertyInfo.getForestSurface());
           property.setUncultivatedSurface(propertyInfo.getUncultivatedSurface());
           property.setVariusSurfaces(propertyInfo.getVariusSurfaces());

           return property;
   }

}