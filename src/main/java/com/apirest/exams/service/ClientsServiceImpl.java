package com.apirest.exams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.repository.BaseRepository;
import com.apirest.exams.repository.ClientsRepository;
 
@Service
public class ClientsServiceImpl  extends BaseServiceImpl<Clients, Long> implements ClientsService {

	@Autowired
	private ClientsRepository clientsRepository;
	   
	 
	public ClientsServiceImpl(BaseRepository<Clients, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	
}
