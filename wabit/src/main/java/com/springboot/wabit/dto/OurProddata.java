package com.springboot.wabit.dto;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class OurProddata {

	private static final long serialVersionUID = 1681261145191719508L;
	@Id
	@OneToMany(mappedBy = "user")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String product_name;
	private Collection<OurProdInfo> ourProdInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Collection<OurProdInfo> getOurProdInfo() {
		return ourProdInfo;
	}

	public void setOurProdInfo(Collection<OurProdInfo> ourProdInfo) {
		this.ourProdInfo = ourProdInfo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
