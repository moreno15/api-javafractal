package com.apirest.exams.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

  
@Entity
@Table(name="order_details")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor  
public class OrderDetails extends Base {
	 
	private static final long serialVersionUID = 1L;
	
	
	@JoinColumn(name="id_product")
	@ManyToOne(fetch=FetchType.EAGER) 
	private Products product;
  
	@Column(name = "quantity")
	private int quantity; 
	
	@Column(name = "unit_price")
	private Double unit_price;  
	
	@Column(name = "cost")
	private Double cost; 
	
	@Column(name = "city_tax")
	private Double city_tax; 
	
	@Column(name = "country_tax")
	private Double country_tax; 
	
	@Column(name = "state_tax")
	private Double state_tax; 
	
	@Column(name = "federal_tax")
	private Double federal_tax; 
	 
}
