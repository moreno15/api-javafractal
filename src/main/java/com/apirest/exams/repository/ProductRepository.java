package com.apirest.exams.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.apirest.exams.entity.Clients;
import com.apirest.exams.entity.Products;

@Repository
public interface ProductRepository extends BaseRepository<Products, Long>{
	
	

}
