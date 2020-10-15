package com.springboot.wabit.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Deta")
public class Deta {


 		private static final long serialVersionUID = 1681261145191719508L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String client_product_name;
		private String client_projecte;
		private String client_product ;
	
}
