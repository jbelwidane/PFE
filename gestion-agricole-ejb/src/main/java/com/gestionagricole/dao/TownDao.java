package com.gestionagricole.dao;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.entity.Town;

@Local
public interface TownDao {

	public Town createTown(Town town) throws Exception;

	public boolean deleteTown(Town town);

	public Town updateTown(Town town);

	public Town findTownByName(String label);

	public List<Town> getAllTown();

}