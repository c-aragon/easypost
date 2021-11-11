package com.middleware.easypost.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden") //No puede tener order por conflicto con order de MySQL
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 15)
	private String theOrder;
	
	public Order(Long id, String theOrder) {
		super();
		this.id = id;
		this.theOrder = theOrder;
	}
	
	public Long getId() {
		return id;
	}
	public String getOrder() {
		return theOrder;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrder(String theOrder) {
		this.theOrder = theOrder;
	}
}
