package com.gestionagricole.factory;

import com.gestionagricole.dto.OperationTypeInfo;
import com.gestionagricole.entity.OperationType;

public class OperationTypeFactory {
	

	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static OperationTypeInfo createDto(OperationType operationType)
   {
           OperationTypeInfo operationTypeInfo = new OperationTypeInfo();

           if (operationType==null)
              return operationTypeInfo;

           if (operationType.getId()!=null)
                   operationTypeInfo.setUid(getUid(operationType));

           operationTypeInfo.setLabel(operationType.getLabel());
           operationTypeInfo.setOrderNumber(operationType.getOrderNumber());

           return operationTypeInfo;
   }

   private static String getUid(OperationType operationType) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(operationType.getId());
	   return builder.toString();
   }

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static OperationType createEntity(OperationTypeInfo operationTypeInfo)
   {
           OperationType operationType = new OperationType();
           return updateEntity(operationType, operationTypeInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static OperationType updateEntity(OperationType operationType, OperationTypeInfo operationTypeInfo)
   {

           operationType.setLabel(operationTypeInfo.getLabel());
           operationType.setOrderNumber(operationTypeInfo.getOrderNumber());

           return operationType;
   }


}