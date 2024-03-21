package com.biblioteca.victor;

import java.time.*;

public class Book {
	public int id;
	public String title;
	public String subtitle;
	public String author;
	public LocalDate releaseDate;

	public Book(int id, String title, String subtitle, String author, LocalDate releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.releaseDate = releaseDate;
	}

}
