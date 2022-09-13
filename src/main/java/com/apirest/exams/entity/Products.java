package com.apirest.exams.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="products")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor  
public class Products extends Base {
	
	private static final long serialVersionUID = 1L;
	 
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name="category") 
	private String category; 
   
	
	@Column(name = "state")
	private boolean state;
}
