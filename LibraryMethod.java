package com.LibraryManagementSystem;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LibraryMethod {
LinkedHashMap<Integer, Library> lm;
public LibraryMethod() {
	lm=new LinkedHashMap<Integer, Library>();
}
void addBook(int id,String title) {
	lm.put(id, new Library(id,title));
}
void issueBook(int n) {
	boolean flag=false;
	for (Entry<Integer, Library> element : lm.entrySet()) {
		if(element.getKey()==n) {
			element.getValue().setAvailable(true);
			System.out.println(element);
			flag=true;
		}
	}
	System.out.println(flag==true?"Book get issued":"No book is get issued");
}
void returnBook(int n) {
	boolean flag=false;
	for (Entry<Integer, Library> element : lm.entrySet()) {
		if(element.getKey()==n && element.getValue().isAvailable==true) {
			element.getValue().setAvailable(false);
			System.out.println(element);
			flag=true;
		}
	}
	System.out.println(flag==true?"Book is returned":"No book is returned");
}
void searchBook(String title) {
	boolean flag=false;
	for (Entry<Integer, Library> element : lm.entrySet()) {
		if(element.getValue().getTitle().equalsIgnoreCase(title)) {
			System.out.println(element);
			flag=true;
		}
	}
	System.out.println(flag==true?"Book is found":"No book is found");
}
void display() {
	for (Entry<Integer, Library> element : lm.entrySet()) {
		System.out.println(element);
	}
	
}
}
