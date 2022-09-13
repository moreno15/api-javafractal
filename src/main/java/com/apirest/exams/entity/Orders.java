package com.apirest.exams.entity;
 
import java.sql.Date;
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
@Table(name="Orders")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor  
public class Orders  extends Base {
	private static final long serialVersionUID = 1L;
	
	 
	
	@JoinColumn(name="id_client")
	@ManyToOne(fetch=FetchType.EAGER) 
	private Clients client;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true )
	@JoinColumn(name="id_order")
	private List<OrderDetails> order_details;
  
	  
	@Column(name = "total")
	private Double total; 
	
	@Column(name = "date_order")
	private Date  date_order;
	
	@Column(name = "status_order")
	private String  status_order;
	
}
