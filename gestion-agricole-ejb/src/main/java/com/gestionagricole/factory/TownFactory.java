
package com.gestionagricole.factory;

import com.gestionagricole.dto.TownInfo;
import com.gestionagricole.entity.Town;

public class TownFactory
{
	public static Long getId(String uid) {

		String[] s = uid.split("\\.");

		if (s.length == 3)
			return new Long(s[2]);

		return 0L;
	}

	public static String getUid(Town town) {
		return town.getId() + "";
	}

	/**
	 * Create a Dto from an Entity
	 * @param an Entity
	 * @return a Dto
	 */

	public static TownInfo createDto(Town town) {
		TownInfo townInfo = new TownInfo();

		if (town == null)
			return townInfo;

		if (town.getId() != null)
			townInfo.uid = getUid(town);

		townInfo.label = town.getLabel();

		return townInfo;
	}

	/**
	 * Create a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Town createEntity(TownInfo townInfo) {
		Town temperature = new Town();
		return updateEntity(temperature, townInfo);
	}

	/**
	 * Update a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Town updateEntity(Town town, TownInfo townInfo) {
		town.setLabel(townInfo.label);
		return town;
	}
}