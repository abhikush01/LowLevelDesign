package BehavioralPattern.IteratorPattern;

public class Client {

	public static void main(String[] args) {
		Library library = new Library();
		
		library.addBook(new Book(200,"Book 1"));
		library.addBook(new Book(250,"Book 2"));
		library.addBook(new Book(220,"Book 3"));
		library.addBook(new Book(1000,"Book 4"));
		library.addBook(new Book(500,"Book 5"));
		
		Iterator ite = library.createIterator();
		
		while(ite.hasnext()) System.out.println((Book)ite.next());
	}

}
