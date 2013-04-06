package com.gestionagricole.frontend.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.gestionagricole.dto.AreaInfo;
import com.gestionagricole.dto.ProvinceInfo;
import com.gestionagricole.exception.ApplicationException;
import com.gestionagricole.frontend.mb.AreaBean;
import com.gestionagricole.frontend.mb.ProvinceBean;
import com.gestionagricole.service.ConfigurationService;

@ManagedBean(name = "configurationService")
@RequestScoped
public class ConfigurationServiceBean implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	ConfigurationService cfgService;

	private FacesContext context = FacesContext.getCurrentInstance();

	public void createProvince(ProvinceBean provinceBean) {
		try {
			ProvinceInfo provinceInfo = new ProvinceInfo();
			provinceInfo.setLabel(provinceBean.getInfo().getLabel());
			provinceInfo = cfgService.createProvince(provinceInfo);
			context.addMessage(null, new FacesMessage(provinceInfo+ " a été enregistré avec succés"));

		} catch (ApplicationException e) {
			context.addMessage(null, new FacesMessage(provinceBean.getInfo()
					.getLabel() + " existe déjà"));
			e.printStackTrace();
		}
	}

	public List<ProvinceBean> findAllProvinces() {
		List<ProvinceBean> result = new ArrayList<ProvinceBean>();

		for (ProvinceInfo p : cfgService.getAllProvince()) {
			result.add(new ProvinceBean(p));
		}
		return result;
	}

	public void createArea(AreaBean areaBean) {
		try {
			AreaInfo areaInfo = areaBean.getInfo();
			areaInfo = cfgService.createArea(areaInfo);
			context.addMessage(null, new FacesMessage(areaInfo
					+ " a été enregistré avec succés"));

		} catch (ApplicationException e) {
			context.addMessage(null, new FacesMessage(areaBean.getInfo()
					.getLabel() + " existe déjà"));
			e.printStackTrace();
		}
	}

	public List<AreaBean> findAllAreas() {
		List<AreaBean> result = new ArrayList<AreaBean>();

		for (AreaInfo a : cfgService.getAllArea()) {
			result.add(new AreaBean(a));
		}
		return result;
	}

}
