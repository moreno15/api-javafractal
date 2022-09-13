package com.apirest.exams.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.service.ClientsServiceImpl; 

@RestController 
@CrossOrigin 
//Controller method CORS configuration
//@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "api/v1/clients") 
public class ClientsController extends BaseControllerImpl<Clients, ClientsServiceImpl> {

	/*
	3.1.) findOneOrders
	3.2.) findOneProducts
	3.3.) findOneClients
	3.4.) findAllOrder
	3.5.) findAllProducts]
	3.6.) findAllClients*/
} 
