package com.gestionagricole.dto;

import java.io.Serializable;
import java.util.List;

public class FarmUnitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uid;

	private String label;

	private String otherFeatures;

	private TownInfo town;

	private AreaInfo area;

	private ClimatologyInfo climatology;

	private List<PropertyInfo> properties;

	private TemperatureInfo temperature;

	private PedologyInfo pedology;

	private List<ArboriculturalPlanInfo> arboriCulturalPlans;

	private List<LargeculturalPlanInfo> largeCulturalPlans;

	private List<ArboriculturalOperationInfo> arboriculturalOperations;

	private List<LargeculturalOperationInfo> largeCulturalOperations;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getOtherFeatures() {
		return otherFeatures;
	}

	public void setOtherFeatures(String otherFeatures) {
		this.otherFeatures = otherFeatures;
	}

	public TownInfo getTown() {
		return town;
	}

	public void setTown(TownInfo town) {
		this.town = town;
	}

	public AreaInfo getArea() {
		return area;
	}

	public void setArea(AreaInfo area) {
		this.area = area;
	}

	public ClimatologyInfo getClimatology() {
		return climatology;
	}

	public void setClimatology(ClimatologyInfo climatology) {
		this.climatology = climatology;
	}

	public List<PropertyInfo> getProperties() {
		return properties;
	}

	public void setProperties(List<PropertyInfo> properties) {
		this.properties = properties;
	}

	public TemperatureInfo getTemperature() {
		return temperature;
	}

	public void setTemperature(TemperatureInfo temperature) {
		this.temperature = temperature;
	}

	public PedologyInfo getPedology() {
		return pedology;
	}

	public void setPedology(PedologyInfo pedology) {
		this.pedology = pedology;
	}

	public List<ArboriculturalPlanInfo> getArboriCulturalPlans() {
		return arboriCulturalPlans;
	}

	public void setArboriCulturalPlans(
			List<ArboriculturalPlanInfo> arboriCulturalPlans) {
		this.arboriCulturalPlans = arboriCulturalPlans;
	}

	public List<LargeculturalPlanInfo> getLargeCulturalPlans() {
		return largeCulturalPlans;
	}

	public void setLargeCulturalPlans(
			List<LargeculturalPlanInfo> largeCulturalPlans) {
		this.largeCulturalPlans = largeCulturalPlans;
	}

	public List<ArboriculturalOperationInfo> getArboriculturalOperations() {
		return arboriculturalOperations;
	}

	public void setArboriculturalOperations(
			List<ArboriculturalOperationInfo> arboriculturalOperations) {
		this.arboriculturalOperations = arboriculturalOperations;
	}

	public List<LargeculturalOperationInfo> getLargeCulturalOperations() {
		return largeCulturalOperations;
	}

	public void setLargeCulturalOperations(
			List<LargeculturalOperationInfo> largeCulturalOperations) {
		this.largeCulturalOperations = largeCulturalOperations;
	}

}