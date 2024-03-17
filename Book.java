package com.biblioteca.victor;

import java.time.*;

public class Book {
	public String title;
	public String subtitle;
	public String author;
	public LocalDate releaseDate;

	public Book(String title, String subtitle, String author, LocalDate releaseDate) {
		super();
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.releaseDate = releaseDate;
	}

}
