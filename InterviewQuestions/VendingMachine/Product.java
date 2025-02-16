package InterviewQuestions.VendingMachine;

public class Product {
	ItemType type;
	double price;
	
	Product(ItemType type, double price){
		this.type = type;
		this.price = price;
	}
	
	public ItemType getItemType() {
		return this.type;
	}
	
	public double getPrice() {
		return this.price;
	}
}
