package com.apirest.exams.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.apirest.exams.entity.Clients;

@Repository
public interface ClientsRepository extends BaseRepository<Clients, Long>{
	
	

}
