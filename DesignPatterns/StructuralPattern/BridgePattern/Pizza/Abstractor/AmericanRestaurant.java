package DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor;

import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor.Pizza;

public class AmericanRestaurant extends Restaurant {
	
	public AmericanRestaurant(Pizza pizza){
		super(pizza);
	}

	@Override
	public void addSauce() {
		pizza.setSauce("Secret Sauces");

	}

	@Override
	public void addToppings() {
		pizza.setToppings("Everything");

	}

	@Override
	public void createCrust() {
		pizza.setCrust("Thick");

	}

}
