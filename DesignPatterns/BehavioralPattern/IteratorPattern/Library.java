package DesignPatterns.BehavioralPattern.IteratorPattern;

import java.util.ArrayList;

public class Library implements Aggregate {
	
	private ArrayList<Book> books;
	
	Library(){
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(books);
	}

}
