package InterviewQuestions.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class ProductShelf {
	
	List<Product> products;
	int quantiny;
	ItemType type;
	double price;
	
	public ProductShelf(int size, ItemType type, double price) {
		products = new ArrayList<>();
		for(int i = 0 ; i < size; i++) {
			products.add(new Product(type, price));
		}
		this.quantiny = size;
		this.type = type;
		this.price = price;
	}
	
	public boolean isAvailable() {
		return this.quantiny > 0;
	}
	
	public double getProductPrice() {
		return this.price;
	}
	
	public Product getProduct() {
		Product product = products.get(products.size() - 1);
		products.remove(products.size() - 1);
		this.quantiny--;
		return product;
	}
	
	public void addProduct() {
		products.add(new Product(type, price));
		this.quantiny++;
	}
	
	
}
