package com.multitenant.bootmultitenant.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cos")
public class Cos {

	@Id
	@Column(name = "id")
	private int cosId;

	@Column(name = "name")
	private String cosName;

	public Cos() {
		super();
	}

	public Cos(int cosId, String cosName) {
		super();
		this.cosId = cosId;
		this.cosName = cosName;
	}

	public int getCosId() {
		return cosId;
	}

	public void setCosId(int cosId) {
		this.cosId = cosId;
	}

	public String getCosName() {
		return cosName;
	}

	public void setCosName(String cosName) {
		this.cosName = cosName;
	}
}
