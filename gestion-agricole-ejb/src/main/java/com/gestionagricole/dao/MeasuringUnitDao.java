package com.gestionagricole.dao;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.entity.MeasuringUnit;

@Local
public interface MeasuringUnitDao 
{

	public MeasuringUnit createMeasuringUnit(MeasuringUnit measuringUnit)throws Exception;

	public boolean deleteMeasuringUnit(MeasuringUnit measuringUnit);

	public MeasuringUnit updateMeasuringUnit(MeasuringUnit measuringUnit);

	public List<MeasuringUnit> getAllMeasuringUnit();

	public MeasuringUnit findMeasuringUnitByName(String label, String sigle);
}