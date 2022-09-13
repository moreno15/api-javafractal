package com.apirest.exams.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clients")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor  
public class Clients extends Base{
	
	private static final long serialVersionUID = 1L;
	 
	@Column(name = "name_client")
	private String name_client;
	  
	@Column(name = "type_document")
	private String type_document;
	
	@Column(name = "number_document")
	private String number_document;

}
