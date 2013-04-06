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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gestionagricole.entity.Province;

@NamedQueries({
	@NamedQuery(name = "findTownByLabel", query = "select t from Town as t where t.label = :townLabel"),
	@NamedQuery(name = "findAllTown", query = "select t from Town t") }
)
@Entity
@Table(name = "C003_TOWNS")
public class Town {

	@Id
	@Column(name = "town_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "town_label")
	private String label;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Province.class)
	@JoinColumn(name = "province_pk_fk")
	private Province province;

	@OneToMany(mappedBy = "town", fetch = FetchType.LAZY, targetEntity = FarmUnit.class)
	private List<FarmUnit> farmUnits;
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	// public OperationUnit[] unnamed_OperationUnit_ = new OperationUnit[0];

}