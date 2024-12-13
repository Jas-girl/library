package com.LibraryManagementSystem;

public class Library {
int id;
String title;
boolean isAvailable;

public Library(int id, String title) {
	super();
	this.id = id;
	this.title = title;
	this.isAvailable = false;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}
@Override
public String toString() {
	return " [id=" + id + ", title=" + title + ", isAvailable=" + isAvailable + "]";
}

}
