package DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor;

import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor.Pizza;

public class ItalianRestaurant extends Restaurant {

	public ItalianRestaurant(Pizza pizza){
		super(pizza);
	}
	
	@Override
	public void addSauce() {
		pizza.setSauce("Oil");

	}

	@Override
	public void addToppings() {
		pizza.setToppings("-");

	}

	@Override
	public void createCrust() {
		pizza.setCrust("Thin");

	}

}
