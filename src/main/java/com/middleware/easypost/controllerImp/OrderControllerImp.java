package com.middleware.easypost.controllerImp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middleware.easypost.controller.OrderController;


@RestController
@RequestMapping(path="order")
public class OrderControllerImp implements OrderController{

	@Override
	public com.summa.sellercenter.dto.order.OrderDTO handleOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
