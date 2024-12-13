package com.LibraryManagementSystem;

public class MainProgram {
public static void main(String[] args) {
	LibraryMethod lm=new LibraryMethod();
	lm.addBook(1, "The title of book");
	lm.addBook(2, "To Kill a Mockingbird");
	lm.addBook(3, "1984");
	lm.addBook(4,  "The Great Gatsby");
	lm.addBook(5, "My life");
	lm.display();
	System.out.println();
	lm.issueBook(2);
	System.out.println();
	lm.returnBook(2);
	System.out.println();
	lm.searchBook("1984");
}
}
