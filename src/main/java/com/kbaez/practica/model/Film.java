package com.kbaez.practica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Film {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

	@NotEmpty
	private String title;
	
	@NotNull
	private Integer year;
	
	@NotEmpty
	private String director;

	private Film() {
		
	}
	
	public Film(String title, Integer year, String director) {
		this.title = title;
		this.year = year;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getDirector() {
		return director;
	}
	
	

}
