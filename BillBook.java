package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "billbooks")
public class BillBook implements Serializable {

	@Id
	private String id;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date DeliveryDate ;   //DeliveryDate : ngày giao
	@Column
	private Float UnitPrice ;  // UnitPrice : đơn giá 
	
	@ManyToOne
	@JoinColumn(name = 	"supplierID")
	private Supplier supplier ;
	
	
	
	

	
}
