package com.springboot.wabit.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OurProdInfo {

	private static final long serialVersionUID = 1681261145191719508L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	@ManyToOne
	@JoinColumn(name = "id")
	private String product_info;
	private String code;

	private OurProddata ourProddata;

	public String getProduct_info() {
		return product_info;
	}

	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public OurProddata getOurProddata() {
		return ourProddata;
	}

	public void setOurProddata(OurProddata ourProddata) {
		this.ourProddata = ourProddata;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
