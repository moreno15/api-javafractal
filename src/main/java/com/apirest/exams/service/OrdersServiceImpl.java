package com.apirest.exams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.entity.Orders;
import com.apirest.exams.repository.BaseRepository;
import com.apirest.exams.repository.ClientsRepository;
import com.apirest.exams.repository.OrdersRepository;
 
@Service
public class OrdersServiceImpl  extends BaseServiceImpl<Orders, Long> implements ClientsService {

	@Autowired
	private OrdersRepository ordersRepository;
	   
	 
	public OrdersServiceImpl(BaseRepository<Orders, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	
}
