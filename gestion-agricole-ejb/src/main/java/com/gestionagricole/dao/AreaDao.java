package com.gestionagricole.dao;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.entity.Area;

@Local
public interface AreaDao 
{
	
	public Area createArea(Area area) throws Exception;

	public boolean deleteArea(Area area);

	public Area updateArea(Area area);

	public List<Area> getAllArea();

	public Area findAreaByName(String label);
}