package com.gestionagricole.dao;

import java.util.List;

import javax.ejb.Local;

import com.gestionagricole.entity.Province;

@Local
public interface ProvinceDao
{
	
	public Province createProvince(Province province);

	public boolean deleteProvince(Province province);

	public Province updateProvince(Province province);

	public Province findProvinceById(long id);

	public Province findProvinceByName(String label);

	public List<Province> getAllProvince();

}