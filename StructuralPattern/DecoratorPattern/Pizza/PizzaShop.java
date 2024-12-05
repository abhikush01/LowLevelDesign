package StructuralPattern.DecoratorPattern.Pizza;

public class PizzaShop {

	public static void main(String[] args) {
		BasePizza pizza = new Cheese(new Mushroom(new Cheese(new MargeritaPizza())));
		System.out.println("Price of Pizza is " + pizza.getPrice());
	}

}
