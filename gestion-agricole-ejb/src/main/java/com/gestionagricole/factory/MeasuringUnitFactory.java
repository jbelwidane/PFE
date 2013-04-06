
package com.gestionagricole.factory;

import com.gestionagricole.dto.MeasuringUnitInfo;
import com.gestionagricole.entity.MeasuringUnit;

public class MeasuringUnitFactory
{
	public static Long getId(String uid) {

		String[] s = uid.split("\\.");

		if (s.length == 3)
			return new Long(s[2]);

		return 0L;
	}

	public static String getUid(MeasuringUnit measuringUnit) {
		return measuringUnit.getId() + "";
	}

	/**
	 * Create a Dto from an Entity
	 * @param an Entity
	 * @return a Dto
	 */

	public static MeasuringUnitInfo createDto(MeasuringUnit measuringUnit) {
		MeasuringUnitInfo measuringUnitInfo = new MeasuringUnitInfo();

		if (measuringUnit == null)
			return measuringUnitInfo;

		if (measuringUnit.getId() != null)
			measuringUnitInfo.setUid(getUid(measuringUnit));

		measuringUnitInfo.setLabel(measuringUnit.getLabel());

		return measuringUnitInfo;
	}

	/**
	 * Create a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static MeasuringUnit createEntity(MeasuringUnitInfo measuringUnitInfo) {
		MeasuringUnit temperature = new MeasuringUnit();
		return updateEntity(temperature, measuringUnitInfo);
	}

	/**
	 * Update a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static MeasuringUnit updateEntity(MeasuringUnit measuringUnit, MeasuringUnitInfo measuringUnitInfo) {
		measuringUnit.setLabel(measuringUnitInfo.getLabel());
		return measuringUnit;
	}
}