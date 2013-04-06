package com.gestionagricole.dao;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.entity.Temperature;

@Local
public interface TemperatureDao 
{
	public Temperature createTemperature(Temperature temperature)throws Exception;

	public boolean deleteTemperature(Temperature temperature);

	public Temperature updateTemperature(Temperature temperature);

	public List<Temperature> getAllTemperature();
}
