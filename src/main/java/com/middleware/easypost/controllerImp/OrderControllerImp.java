package com.middleware.easypost.controllerImp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middleware.easypost.controller.OrderController;
import com.middleware.easypost.dto.OrderDTO;

@RestController
@RequestMapping(path="orden")
public class OrderControllerImp implements OrderController{

	@Override
	public OrderDTO handleOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
