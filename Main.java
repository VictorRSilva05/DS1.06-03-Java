package com.biblioteca.victor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		byte selector = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (selector != 7) {
			System.out.println();
			System.out.println("1- Register a reader");
			System.out.println("2- Add books to a reader");
			System.out.println("3- Remove a book from a reader");
			System.out.println("4- Donate a book to another reader");
			System.out.println("5- List all readers and their books");
			System.out.println("6- List a specific reader and their books");
			System.out.println("7- Exit");
			
			System.out.print("Select an option: ");
            selector = scanner.nextByte();
			
			switch(selector) {
			case 1:
				library.registerReader();
				break;
			case 2:
				library.addBook();
				break;
			case 3:
				library.removeBook();
				break;
			case 4:
				library.addBook();
				break;
			case 5:
				library.listAllReaders();
				break;
			case 6:
				break;
			}
				
		}
	}

}
