package com.apirest.exams.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.entity.Orders;
import com.apirest.exams.service.ClientsServiceImpl;
import com.apirest.exams.service.OrdersServiceImpl; 

@RestController 
@CrossOrigin 
//Controller method CORS configuration
//@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "api/v1/orders") 
public class OrdersController extends BaseControllerImpl<Orders, OrdersServiceImpl> {

 
} 
