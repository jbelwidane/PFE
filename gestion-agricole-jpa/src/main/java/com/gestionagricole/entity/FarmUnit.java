package com.gestionagricole.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "D001_FARM_UNITS")
public class FarmUnit {

	@Id
	@Column(name = "farm_unit_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "farm_unit_label")
	private String label;

	@Column(name = "farm_unit_other_features")
	private String otherFeatures;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Town.class)
	@JoinColumn(name = "farm_unit_town_pk_fk")
	private Town town;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Area.class)
	@JoinColumn(name = "area_pk_fk")
	private Area area;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Climatology.class)
	@JoinColumn(name = "clima_pk_fk")
	private Climatology climatology;

	@OneToMany(mappedBy = "farmUnit", fetch = FetchType.LAZY, targetEntity = Property.class)
	private List<Property> properties;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Temperature.class)
	@JoinColumn(name = "temperature_pk_fk")
	private Temperature temperature;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Pedology.class)
	@JoinColumn(name = "pedology_pk_fk")
	private Pedology pedology;

	@OneToMany(mappedBy = "farmUnit", fetch = FetchType.LAZY, targetEntity = ArboriculturalPlan.class)
	private List<ArboriculturalPlan> arboriCulturalPlans;

	@OneToMany(mappedBy = "farmUnit", fetch = FetchType.LAZY, targetEntity = LargeculturalPlan.class)
	private List<LargeculturalPlan> largeCulturalPlans;

	@OneToMany(mappedBy = "farmUnit", fetch = FetchType.LAZY, targetEntity = ArboriculturalOperation.class)
	private List<ArboriculturalOperation> arboriculturalOperations;

	@OneToMany(mappedBy = "farmUnit", fetch = FetchType.LAZY, targetEntity = LargeculturalOperation.class)
	private List<LargeculturalOperation> largeCulturalOperations;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = UserAccount.class)
	@JoinColumn(name = "user_account_pk_fk")
	private UserAccount manager;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Climatology getClimatology() {
		return climatology;
	}

	public void setClimatology(Climatology climatology) {
		this.climatology = climatology;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Pedology getPedology() {
		return pedology;
	}

	public void setPedology(Pedology pedology) {
		this.pedology = pedology;
	}

	public List<ArboriculturalPlan> getArboriCulturalPlans() {
		return arboriCulturalPlans;
	}

	public void setArboriCulturalPlans(
			List<ArboriculturalPlan> arboriCulturalPlans) {
		this.arboriCulturalPlans = arboriCulturalPlans;
	}

	public List<LargeculturalPlan> getLargeCulturalPlans() {
		return largeCulturalPlans;
	}

	public void setLargeCulturalPlans(List<LargeculturalPlan> largeCulturalPlans) {
		this.largeCulturalPlans = largeCulturalPlans;
	}

	public List<ArboriculturalOperation> getArboriculturalOperations() {
		return arboriculturalOperations;
	}

	public void setArboriculturalOperations(
			List<ArboriculturalOperation> arboriculturalOperations) {
		this.arboriculturalOperations = arboriculturalOperations;
	}

	public List<LargeculturalOperation> getLargeCulturalOperations() {
		return largeCulturalOperations;
	}

	public void setLargeCulturalOperations(
			List<LargeculturalOperation> largeCulturalOperations) {
		this.largeCulturalOperations = largeCulturalOperations;
	}

	public UserAccount getManager() {
		return manager;
	}

	public void setManager(UserAccount manager) {
		this.manager = manager;
	}
	
}