package com.gestionagricole.service;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.dto.AreaInfo;
import com.gestionagricole.dto.MeasuringUnitInfo;
import com.gestionagricole.dto.ProvinceInfo;
import com.gestionagricole.dto.TemperatureInfo;
import com.gestionagricole.dto.TownInfo;
import com.gestionagricole.exception.ApplicationException;
 
@Local
public interface ConfigurationService 
{
	
	//CRUD Area
	public List<AreaInfo> getAllArea();
	public AreaInfo createArea(AreaInfo provinceInfo) throws ApplicationException;
	public AreaInfo updateArea(AreaInfo provinceInfo);
	public void deleteArea(String uid);
	
	//CRUD MeasuringUnit
	public List<MeasuringUnitInfo> getAllMeasuringUnit();
	public MeasuringUnitInfo createMeasuringUnit(MeasuringUnitInfo provinceInfo) throws ApplicationException;
	public MeasuringUnitInfo updateMeasuringUnit(MeasuringUnitInfo provinceInfo);
	public void deleteMeasuringUnit(String uid);
		
	//CRUD Province
	public List<ProvinceInfo> getAllProvince();
	public ProvinceInfo createProvince(ProvinceInfo provinceInfo) throws ApplicationException;
	public ProvinceInfo updateProvince(ProvinceInfo provinceInfo);
	public void deleteProvince(String uid);
	
	//CRUD Temperature
	public List<TemperatureInfo> getAllTemperature();
	public TemperatureInfo createTemperature(TemperatureInfo provinceInfo) throws ApplicationException;
	public TemperatureInfo updateTemperature(TemperatureInfo provinceInfo);
	public void deleteTemperature(String uid);
	
	//CRUD Town
	public List<TownInfo> getAllTown();
	public TownInfo createTown(TownInfo provinceInfo) throws ApplicationException;
	public TownInfo updateTown(TownInfo provinceInfo);
	public void deleteTown(String uid);
}
