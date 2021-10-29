package com.middleware.easypost.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middleware.easypost.dto.OrderDTO;

public interface OrderController {

	OrderDTO handleOrder();
	
}
