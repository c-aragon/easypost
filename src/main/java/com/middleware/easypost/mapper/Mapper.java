package com.middleware.easypost.mapper;
import org.springframework.stereotype.Component;
import com.middleware.easypost.dto.OrderDTO;
import com.middleware.easypost.entity.Order;

@Component
public class Mapper {
	
	public OrderDTO order2orderDTO() {
		OrderDTO teamDTO = new OrderDTO(null, null);
		return teamDTO;
	}
	
	public Order orderDTO2order() {
		Order order = new Order(null, null);
		return order;
	}
	
}
