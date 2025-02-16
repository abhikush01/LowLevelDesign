package InterviewQuestions.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	Map<ItemType, ProductShelf> map;
	
	Inventory(){
		map = new HashMap<>();
	}
	
	public void addShelf(ItemType type, ProductShelf shelf) {
		map.put(type, shelf);
	}
	
	public void addProducts(ItemType type, int size) {
		restock(type, size);
	}
	
	public void restock(ItemType type, int size) {
		for(int i = 0; i < size; i++) {
			map.get(type).addProduct();
		}
	}
	
	public Product getItem(ItemType type) {
		if(map.containsKey(type) && map.get(type).isAvailable()) {
			Product product = map.get(type).getProduct();
			return product;
		}
		System.out.println("Product is not available");
		return null;
	}
}
