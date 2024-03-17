package com.biblioteca.victor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {

	ArrayList<Reader> readers = new ArrayList<Reader>();
	Scanner scanner = new Scanner(System.in);

	public void registerReader() {
		System.out.println();
		System.out.print("Enter the name of the reader: ");
		String name = scanner.next();
		System.out.print("Enter the cpf of the reader: ");
		String cpf = scanner.next();
		
		readers.add(new Reader(name, cpf));
	}
	
	public void addBooks() {
		System.out.println();
		System.out.print("Enter the title of the book: ");
		String title = scanner.next();
		System.out.print("Enter the subtitle: ");
		String subtitle = scanner.next();
		System.out.print("Enter the author: ");
		String author = scanner.next();
		System.out.print("Enter the release date: ");
		String auxReleaseDate = scanner.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate releaseDate = LocalDate.parse(auxReleaseDate, formatter);
 
	}
}
