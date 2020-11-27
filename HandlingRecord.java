package edu.poly.spring.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "handlingrecords")
public class HandlingRecord implements Serializable {

	@Id
	private String idReader;
	private String idBook;
	
	@ManyToOne
	@JoinColumn(name = "readerId")
	private Reader reader ;
	
	@OneToMany(mappedBy = "handlingrecords" , cascade = CascadeType.ALL)
	private Set<Book> book ;
	
	
}
