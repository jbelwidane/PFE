package com.gestionagricole.service.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.AreaDao;
import com.gestionagricole.dao.MeasuringUnitDao;
import com.gestionagricole.dao.ProvinceDao;
import com.gestionagricole.dao.TemperatureDao;
import com.gestionagricole.dao.TownDao;
import com.gestionagricole.dto.AreaInfo;
import com.gestionagricole.dto.MeasuringUnitInfo;
import com.gestionagricole.dto.ProvinceInfo;
import com.gestionagricole.dto.TemperatureInfo;
import com.gestionagricole.dto.TownInfo;
import com.gestionagricole.entity.Area;
import com.gestionagricole.entity.MeasuringUnit;
import com.gestionagricole.entity.Province;
import com.gestionagricole.entity.Temperature;
import com.gestionagricole.entity.Town;
import com.gestionagricole.exception.ApplicationException;
import com.gestionagricole.exception.ApplicationException.APPLICATION_ERROR_CODE;
import com.gestionagricole.factory.AreaFactory;
import com.gestionagricole.factory.MeasuringUnitFactory;
import com.gestionagricole.factory.ProvinceFactory;
import com.gestionagricole.factory.TemperatureFactory;
import com.gestionagricole.factory.TownFactory;
import com.gestionagricole.service.ConfigurationService;

@Stateless
//@Interceptors({SecurityInterceptor.class})
public class ConfigurationServiceImpl implements ConfigurationService {

	
	Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);
	
	@EJB
	AreaDao areaDao;
	
	@EJB
	MeasuringUnitDao measuringUnitDao;
	
	@EJB
	ProvinceDao provinceDao;
	
	@EJB
	TemperatureDao temperatureDao;
	
	@EJB
	TownDao townDao;

//---------------------------------------------AREA-------------------------------------------------------
	@Override
	public List<AreaInfo> getAllArea() 
	{
		List<AreaInfo> areaInfos = new ArrayList<AreaInfo>();
		
		List<Area> areas = areaDao.getAllArea();
		
		for(Area p : areas)
		{
			areaInfos.add(AreaFactory.createDto(p));
		}
		return areaInfos;
	}

	@Override
	public AreaInfo createArea(AreaInfo areaInfo) throws ApplicationException 
	{
		if(areaInfo == null)
			return null;
		
		Area area = areaDao.findAreaByName(areaInfo.getLabel());
		
		if(area != null)
			throw new ApplicationException(APPLICATION_ERROR_CODE.DUPLICATE_PROVINCE_NAME, "area déja existante");
		
		area = AreaFactory.createEntity(areaInfo);

		try {
			areaDao.createArea(area);
		} catch (Exception e) {
			throw new ApplicationException(APPLICATION_ERROR_CODE.GENERIC_ERROR, e.getMessage());
		}
		
		return AreaFactory.createDto(area);
	}

	@Override
	public AreaInfo updateArea(AreaInfo areaInfo) {
		return null;
	}

	@Override
	public void deleteArea(String uid) {
		
	}
//--------------------------------------------------------------------------------------------------------
//---------------------------------------------AREA-------------------------------------------------------
	@Override
	public List<MeasuringUnitInfo> getAllMeasuringUnit() 
	{
		List<MeasuringUnitInfo> measuringUnitInfos = new ArrayList<MeasuringUnitInfo>();
		
		List<MeasuringUnit> measuringUnits = measuringUnitDao.getAllMeasuringUnit();
		
		for(MeasuringUnit p : measuringUnits)
		{
			measuringUnitInfos.add(MeasuringUnitFactory.createDto(p));
		}
		return measuringUnitInfos;
	}

	@Override
	public MeasuringUnitInfo createMeasuringUnit(MeasuringUnitInfo measuringUnitInfo) throws ApplicationException 
	{
		if(measuringUnitInfo == null)
			return null;
		
		MeasuringUnit measuringUnit = measuringUnitDao.findMeasuringUnitByName(measuringUnitInfo.getLabel(),measuringUnitInfo.getSigle());
		
		if(measuringUnit != null)
			throw new ApplicationException(APPLICATION_ERROR_CODE.DUPLICATE_PROVINCE_NAME, "measuringUnit déja existante");
		
		measuringUnit = MeasuringUnitFactory.createEntity(measuringUnitInfo);

		try {
			measuringUnitDao.createMeasuringUnit(measuringUnit);
		} catch (Exception e) {
			throw new ApplicationException(APPLICATION_ERROR_CODE.GENERIC_ERROR, e.getMessage());
		}
		
		return MeasuringUnitFactory.createDto(measuringUnit);
	}

	@Override
	public MeasuringUnitInfo updateMeasuringUnit(MeasuringUnitInfo measuringUnitInfo) {
		return null;
	}

	@Override
	public void deleteMeasuringUnit(String uid) {
		
	}
//--------------------------------------------------------------------------------------------------------	
//-------------------------------------------PROVINCE-----------------------------------------------------
	@Override
	public List<ProvinceInfo> getAllProvince() 
	{
		List<ProvinceInfo> provinceInfos = new ArrayList<ProvinceInfo>();
		
		List<Province> provinces = provinceDao.getAllProvince();
		
		for(Province p : provinces)
		{
			provinceInfos.add(ProvinceFactory.createDto(p));
		}
		return provinceInfos;
	}

	@Override
	public ProvinceInfo createProvince(ProvinceInfo provinceInfo) throws ApplicationException 
	{
		if(provinceInfo == null)
			return null;
		
		Province province = provinceDao.findProvinceByName(provinceInfo.getLabel());
		
		if(province != null)
			throw new ApplicationException(APPLICATION_ERROR_CODE.DUPLICATE_PROVINCE_NAME, "province déja existante");
		
		province = ProvinceFactory.createEntity(provinceInfo);

		try {
			provinceDao.createProvince(province);
		} catch (Exception e) {
			throw new ApplicationException(APPLICATION_ERROR_CODE.GENERIC_ERROR, e.getMessage());
		}
		
		return ProvinceFactory.createDto(province);
	}

	@Override
	public ProvinceInfo updateProvince(ProvinceInfo provinceInfo) {
		return null;
	}

	@Override
	public void deleteProvince(String uid) {
		
	}
//--------------------------------------------------------------------------------------------------------
//-------------------------------------------PROVINCE-----------------------------------------------------
	@Override
	public List<TemperatureInfo> getAllTemperature() 
	{
		List<TemperatureInfo> temperatureInfos = new ArrayList<TemperatureInfo>();
		
		List<Temperature> temperatures = temperatureDao.getAllTemperature();
		
		for(Temperature p : temperatures)
		{
			temperatureInfos.add(TemperatureFactory.createDto(p));
		}
		return temperatureInfos;
	}

	@Override
	public TemperatureInfo createTemperature(TemperatureInfo temperatureInfo) throws ApplicationException 
	{
		if(temperatureInfo == null)
			return null;
		
//		Temperature temperature = temperatureDao.findTemperatureByName(temperatureInfo.label);
		
//		if(temperature != null)
//			throw new ApplicationException(APPLICATION_ERROR_CODE.DUPLICATE_PROVINCE_NAME, "temperature déja existante");
		
		Temperature temperature = TemperatureFactory.createEntity(temperatureInfo);

		try {
			temperatureDao.createTemperature(temperature);
		} catch (Exception e) {
			throw new ApplicationException(APPLICATION_ERROR_CODE.GENERIC_ERROR, e.getMessage());
		}
		
		return TemperatureFactory.createDto(temperature);
	}

	@Override
	public TemperatureInfo updateTemperature(TemperatureInfo temperatureInfo) {
		return null;
	}

	@Override
	public void deleteTemperature(String uid) {
		
	}
//--------------------------------------------------------------------------------------------------------
//-------------------------------------------PROVINCE-----------------------------------------------------
	@Override
	public List<TownInfo> getAllTown() 
	{
		List<TownInfo> townInfos = new ArrayList<TownInfo>();
		
		List<Town> towns = townDao.getAllTown();
		
		for(Town p : towns)
		{
			townInfos.add(TownFactory.createDto(p));
		}
		return townInfos;
	}

	@Override
	public TownInfo createTown(TownInfo townInfo) throws ApplicationException 
	{
		if(townInfo == null)
			return null;
		
		Town town = townDao.findTownByName(townInfo.label);
		
		if(town != null)
			throw new ApplicationException(APPLICATION_ERROR_CODE.DUPLICATE_PROVINCE_NAME, "town déja existante");
		
		town = TownFactory.createEntity(townInfo);

		try {
			townDao.createTown(town);
		} catch (Exception e) {
			throw new ApplicationException(APPLICATION_ERROR_CODE.GENERIC_ERROR, e.getMessage());
		}
		
		return TownFactory.createDto(town);
	}

	@Override
	public TownInfo updateTown(TownInfo townInfo) {
		return null;
	}

	@Override
	public void deleteTown(String uid) {
		
	}
//--------------------------------------------------------------------------------------------------------
}
