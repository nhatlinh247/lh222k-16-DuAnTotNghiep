package edu.poly.spring.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poster")
public class Poster implements Serializable {
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String typeOfBook;
	@Column
	private String nameAuthor;
	@Column
	private String image;
	@Column
	private String namePublishingCompany;
	@Column
	private Integer page;
	//Tóm tắt nội dung
	@Column
	private String synopsis;
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
	public String getTypeOfBook() {
		return typeOfBook;
	}
	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public String getNamePublishingCompany() {
		return namePublishingCompany;
	}
	public void setNamePublishingCompany(String namePublishingCompany) {
		this.namePublishingCompany = namePublishingCompany;
	}
	public Integer getPage() {
		return page;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Integer getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(Integer publishingYear) {
		this.publishingYear = publishingYear;
	}
	public Poster(String id, String name, String image, String typeOfBook, String nameAuthor, String namePublishingCompany,
			Integer page, String synopsis, Integer publishingYear) {
		super();
		this.id = id;
		this.name = name;
		this.typeOfBook = typeOfBook;
		this.nameAuthor = nameAuthor;
		this.namePublishingCompany = namePublishingCompany;
		this.page = page;
		this.image = image;
		this.synopsis = synopsis;
		this.publishingYear = publishingYear;
	}
	public Poster() {
		super();
	}
	
}
