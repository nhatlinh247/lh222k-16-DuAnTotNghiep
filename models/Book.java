package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "book")
public class Book implements Serializable{
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private Integer quantity;
	@Column
	private String status;
	@Column
	private Float price;
	@Column
	private Integer publishingYear;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(Integer publishingYear) {
		this.publishingYear = publishingYear;
	}
	public Book(String id, String name, Integer quantity, String status, Float price, Integer publishingYear) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.publishingYear = publishingYear;
	}
	public Book() {
		super();
	}
	
}
