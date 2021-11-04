package com.middleware.easypost.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 15)
	private String order;
	
	public Order(Long id, String order) {
		super();
		this.id = id;
		this.order = order;
	}
	
	public Long getId() {
		return id;
	}
	public String getOrder() {
		return order;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrder(String order) {
		this.order = order;
	}
}
