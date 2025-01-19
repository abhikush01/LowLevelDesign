package DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor;

import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor.Pizza;

public abstract class Restaurant {
	
	Pizza pizza;
	
	Restaurant(Pizza pizza){
		this.pizza = pizza;
	}
	
	public abstract void addSauce();
	public abstract void addToppings();
	public abstract void createCrust();
	
	public void makePizza() {
		createCrust();
		addSauce();
		addToppings();
		pizza.assemble();
		System.out.println("Order in Progress!");
	}
	
}
