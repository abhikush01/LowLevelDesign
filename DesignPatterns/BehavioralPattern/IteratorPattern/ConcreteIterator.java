package DesignPatterns.BehavioralPattern.IteratorPattern;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator {
	
	private ArrayList<Book> books;
	int index;
	
	ConcreteIterator(ArrayList<Book> books){
		this.books = books;
		index = 0;
	}
	
	@Override
	public boolean hasnext() {
		return index < books.size();
	}

	@Override
	public Object next() {
		return books.get(index++);
	}

}
