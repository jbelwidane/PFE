package com.gestionagricole.factory;

import com.gestionagricole.dto.ArboriculturalOperationInfo;
import com.gestionagricole.entity.ArboriculturalOperation;

public class ArboriculturalVarietyFactory {

	/**
	 * 
	 * Create a Dto from an Entity
	 * @param an Entity
	 * @return a Dto
	 */

	public static ArboriculturalOperationInfo createDto(ArboriculturalOperation arboriculturalOperation) 
	{
		ArboriculturalOperationInfo arboriculturalOperationInfo = new ArboriculturalOperationInfo();

		if (arboriculturalOperation == null)
			return arboriculturalOperationInfo;

		if (arboriculturalOperation.getId() != null)
			arboriculturalOperationInfo.setUid(getUid(arboriculturalOperation));
		
//		arboriculturalOperationInfo.setFarmUnit(arboriculturalOperation.getFarmUnit());
        arboriculturalOperationInfo.setStatus(arboriculturalOperation.getStatus());
//        arboriculturalOperationInfo.setMethode(arboriculturalOperation.getMethode());
//        arboriculturalOperationInfo.setType(arboriculturalOperation.getType());
//        arboriculturalOperationInfo.setOperation(arboriculturalOperation.getOperation());
        arboriculturalOperationInfo.setStartDate(arboriculturalOperation.getStartDate());
        arboriculturalOperationInfo.setEndDate(arboriculturalOperation.getEndDate());
        arboriculturalOperationInfo.setIteration(arboriculturalOperation.getIteration());
        arboriculturalOperationInfo.setLabel(arboriculturalOperation.getLabel());
        arboriculturalOperationInfo.setSurface(arboriculturalOperation.getSurface());
        arboriculturalOperationInfo.setFuelUsed(arboriculturalOperation.getFuelUsed());
        arboriculturalOperationInfo.setManpower(arboriculturalOperation.getManpower());
        arboriculturalOperationInfo.setNote(arboriculturalOperation.getNote());
//        arboriculturalOperationInfo.setVariety(arboriculturalOperation.getVariety());

		
		return arboriculturalOperationInfo;
	}

	private static String getUid(ArboriculturalOperation arboriculturalOperation) 
	{
		StringBuilder builder = new StringBuilder();
		builder.append(arboriculturalOperation.getFarmUnit().getArea().getId()).append(".");
		builder.append(arboriculturalOperation.getFarmUnit().getId()).append(".");
		builder.append(arboriculturalOperation.getId());
		return builder.toString();
	}

	/**
	 * 
	 * Create a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static ArboriculturalOperation createEntity(ArboriculturalOperationInfo arboriculturalOperationInfo) 
	{
		ArboriculturalOperation arboriculturalOperation = new ArboriculturalOperation();
		return updateEntity(arboriculturalOperation,arboriculturalOperationInfo);
	}

	/**
	 * 
	 * Update a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static ArboriculturalOperation updateEntity(ArboriculturalOperation arboriculturalOperation,ArboriculturalOperationInfo arboriculturalOperationInfo) 
	{
//		arboriculturalOperation.setFarmUnit(arboriculturalOperationInfo.getFarmUnit());
        arboriculturalOperation.setStatus(arboriculturalOperationInfo.getStatus());
//        arboriculturalOperation.setMethode(arboriculturalOperationInfo.getMethode());
//        arboriculturalOperation.setType(arboriculturalOperationInfo.getType());
//        arboriculturalOperation.setOperation(arboriculturalOperationInfo.getOperation());
        arboriculturalOperation.setStartDate(arboriculturalOperationInfo.getStartDate());
        arboriculturalOperation.setEndDate(arboriculturalOperationInfo.getEndDate());
        arboriculturalOperation.setIteration(arboriculturalOperationInfo.getIteration());
        arboriculturalOperation.setLabel(arboriculturalOperationInfo.getLabel());
        arboriculturalOperation.setSurface(arboriculturalOperationInfo.getSurface());
        arboriculturalOperation.setFuelUsed(arboriculturalOperationInfo.getFuelUsed());
        arboriculturalOperation.setManpower(arboriculturalOperationInfo.getManpower());
        arboriculturalOperation.setNote(arboriculturalOperationInfo.getNote());
//        arboriculturalOperation.setVariety(arboriculturalOperationInfo.getVariety());

		return arboriculturalOperation;
	}

}