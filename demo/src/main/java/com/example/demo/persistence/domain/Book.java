package com.example.demo.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // classes that represent tables in our DB
@Data
@NoArgsConstructor
public class Book{

	// default constructor
	// all args constructor
	// getters
	// setters
	// toString
	// equals and hasCode

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;


	@ManyToOne
	private Library library;

	public Book(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public Book(String name) {
		super();
		this.name = name;
		
	}

}
