package com.apirest.exams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.entity.Products;
import com.apirest.exams.repository.BaseRepository;
import com.apirest.exams.repository.ClientsRepository;
import com.apirest.exams.repository.ProductRepository;
 
@Service
public class ProductsServiceImpl  extends BaseServiceImpl<Products, Long>  {

	@Autowired
	private ProductRepository productRepository;
	   
	 
	public ProductsServiceImpl(BaseRepository<Products, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	
}
