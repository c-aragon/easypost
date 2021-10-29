package com.middleware.easypost.service;
import org.springframework.stereotype.Service;
import com.middleware.easypost.dto.OrderDTO;

public interface OrderService {

	OrderDTO handleOrder();
	
}
