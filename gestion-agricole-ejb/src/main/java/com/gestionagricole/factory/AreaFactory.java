package com.gestionagricole.factory;

import com.gestionagricole.dto.AreaInfo;
import com.gestionagricole.entity.Area;

public class AreaFactory {

	public static Long getId(String uid) {

		String[] s = uid.split("\\.");

		if (s.length == 3)
			return new Long(s[2]);

		return 0L;
	}

	public static String getUid(Area area) {
		return area.getId() + "";
	}

	/**
	 * Create a Dto from an Entity
	 * @param an Entity
	 * @return a Dto
	 */

	public static AreaInfo createDto(Area area) {
		AreaInfo areaInfo = new AreaInfo();

		if (area == null)
			return areaInfo;

		if (area.getId() != null)
			areaInfo.setUid(getUid(area));

		areaInfo.setLabel(area.getLabel());

		return areaInfo;
	}

	/**
	 * Create a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Area createEntity(AreaInfo areaInfo) {
		Area area = new Area();
		return updateEntity(area, areaInfo);
	}

	/**
	 * Update a Entity from a Dto
	 * @param a Dto
	 * @return an Entity
	 */

	public static Area updateEntity(Area area, AreaInfo areaInfo) {
		area.setLabel(areaInfo.getLabel());
		return area;
	}

}