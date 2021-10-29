package com.middleware.easypost.dto;

import javax.persistence.Column;

public class OrderDTO {

	private Long id;
	private String order;
	
	public OrderDTO(Long id, String order) {
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
