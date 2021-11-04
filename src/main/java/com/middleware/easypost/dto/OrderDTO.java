package com.middleware.easypost.dto;

import javax.persistence.Column;

public class OrderDTO {

	private Long id;
	private String laOrden;
	
	public OrderDTO(Long id, String laOrden) {
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
