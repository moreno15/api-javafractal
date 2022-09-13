package com.apirest.exams.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.entity.Orders;

@Repository
public interface OrdersRepository extends BaseRepository<Orders, Long>{
	
	

}
