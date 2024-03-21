package com.biblioteca.victor;

import java.util.ArrayList;

public class Reader {
	public int id;
	public String name;
	public String cpf;
	public ArrayList<Book> books;
	
	public Reader(int id,String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		ArrayList<Book> books = new ArrayList<Book>();
	}
	
	public void addBooks(Book book) {
		books.add(book);
	}
	
	public void removeBooks(Book book) {
		books.remove(book);
	}
	
	public void donateBook(Reader donor, Reader receiver, Book book) {
		donor.removeBooks(book);
		receiver.addBooks(book);
	}
}
