package com.biblioteca.victor;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	ArrayList<Reader> readers = new ArrayList<Reader>();
	Scanner scanner = new Scanner(System.in);

	public void registerReader() { // 1#
		System.out.println();
		System.out.print("Enter the id of the reader: ");
		int id = scanner.nextInt();
		System.out.print("Enter the name of the reader: ");
		String name = scanner.next();
		System.out.print("Enter the cpf of the reader: ");
		String cpf = scanner.next();

		readers.add(new Reader(id, name, cpf));
	}

	public void addBook() { // 2#
		System.out.println();
		System.out.print("Enter the id of the reader: ");
		int id = scanner.nextInt();

		Reader reader = readers.stream().filter(e -> e.id == id).findFirst().get();
		if (reader == null) {
			System.out.println("Reader could not be found!");
		} else {
			System.out.print("Enter the id of the book: ");
			int bookId = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter the title of the book: ");
			String title = scanner.nextLine();

			System.out.print("Enter the subtitle: ");
			String subtitle = scanner.nextLine();

			System.out.print("Enter the author: ");
			String author = scanner.nextLine();

			Book book = new Book(bookId, title, subtitle, author);

			reader.addBooks(book);
		}
	}

	public void removeBook() { // 3#
		System.out.println();
		System.out.print("Enter the id of the reader: ");
		int id = scanner.nextInt();

		Reader reader = readers.stream().filter(e -> e.id == id).findFirst().get();
		if (reader == null) {
			System.out.println("Reader could not be found!");
		} else {
			System.out.print("Enter the id of the book: ");
			int bookId = scanner.nextInt();

			Book book = reader.books.stream().filter((e -> e.id == bookId)).findFirst().get();
			if (book == null) {
				System.out.println("Book could not be found");
			} else {
				reader.books.remove(book);
			}
		}
	}

	public void donateBook() { // 4#
		System.out.println();
		System.out.print("Enter the id of the donor: ");
		int donorId = scanner.nextInt();

		Reader donor = readers.stream().filter(e -> e.id == donorId).findFirst().get();
		if (donor == null) {
			System.out.println("Reader could not be found!");
		} else {

			System.out.print("Enter the id of the book: ");
			int bookId = scanner.nextInt();

			Book book = donor.books.stream().filter((e -> e.id == bookId)).findFirst().get();
			if (book == null) {
				System.out.println("Book could not be found");
			} else {
				System.out.print("Enter the id of the receiver: ");
				int receiverId = scanner.nextInt();

				Reader receiver = readers.stream().filter(e -> e.id == receiverId).findFirst().get();
				if (receiver == null) {
					System.out.println("Reader could not be found!");
				} else {
					donor.books.remove(book);
					receiver.books.add(book);
				}
			}
		}
	}

	public void listAllReaders() {
		System.out.println();
		if (readers.isEmpty()) {
			System.out.println("There are no registered readers!");
		} else {
			for (Reader reader : readers) {
				System.out.println("ID: " + reader.id + " Name: " + reader.name + " CPF: " + reader.cpf);
				for (Book book : reader.books) {
					System.out.println("\tBook ID: " + book.id + " Title" + book.title + ", " + book.subtitle);
				}
			}
		}
	}

	public void listSpecificReader() {
		System.out.println();
		System.out.print("Enter the id of the reader: ");
		int id = scanner.nextInt();

		Reader reader = readers.stream().filter(e -> e.id == id).findFirst().get();
		if (reader == null) {
			System.out.println("Reader could not be found!");
		} else {
			if (reader.books.isEmpty()) {
				System.out.println("The reader has no books in his collection!");
			} else {
				System.out.println("ID: " + reader.id + " Name: " + reader.name + " CPF: " + reader.cpf);
				for (Book book : reader.books) {
					System.out.println("\tBook ID: " + book.id + " Title" + book.title + ", " + book.subtitle);
				}
			}
		}
	}
}
