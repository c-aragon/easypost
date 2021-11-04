package com.middleware.easypost.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unaorden")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 15)
	private String laOrden;
	
	public Order(Long id, String laOrden) {
		super();
		this.id = id;
		this.laOrden = laOrden;
	}
	
	public Long getId() {
		return id;
	}
	public String getOrder() {
		return laOrden;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrder(String laOrden) {
		this.laOrden = laOrden;
	}
}
