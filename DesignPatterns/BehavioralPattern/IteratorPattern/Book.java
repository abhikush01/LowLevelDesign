package DesignPatterns.BehavioralPattern.IteratorPattern;

public class Book {
	private int price;
	private String name;
	
	Book(int price , String name){
		this.price = price;
		this.name = name;
	}
	
	public String toString() {
		return price + " : " + name;
 	}
}
