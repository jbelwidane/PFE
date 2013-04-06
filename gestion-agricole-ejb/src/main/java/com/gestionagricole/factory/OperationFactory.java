package com.gestionagricole.factory;

import com.gestionagricole.dto.OperationInfo;
import com.gestionagricole.entity.Operation;

public class OperationFactory {
	
	 /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static OperationInfo createDto(Operation operation)
   {
           OperationInfo operationInfo = new OperationInfo();

           if (operation==null)
              return operationInfo;

           if (operation.getId()!=null)
                   operationInfo.setUid(getUid(operation));

           operationInfo.setLabel(operation.getLabel());
           operationInfo.setSigle(operation.getSigle());
           operationInfo.setTri(operation.getTri());
           operationInfo.setOperationScope(operation.getOperationScope());
//           operationInfo.setOperationType(operation.getOperationType());

           return operationInfo;
   }

   private static String getUid(Operation operation) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(operation.getId());
	   return builder.toString();
   }

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Operation createEntity(OperationInfo operationInfo)
   {
           Operation operation = new Operation();
           return updateEntity(operation, operationInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Operation updateEntity(Operation operation, OperationInfo operationInfo)
   {

           operation.setLabel(operationInfo.getLabel());
           operation.setSigle(operationInfo.getSigle());
           operation.setTri(operationInfo.getTri());
           operation.setOperationScope(operationInfo.getOperationScope());
//           operation.setOperationType(operationInfo.getOperationType());

           return operation;
   }

}