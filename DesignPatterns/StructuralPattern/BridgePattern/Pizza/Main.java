package DesignPatterns.StructuralPattern.BridgePattern.Pizza;

import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor.AmericanRestaurant;
import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor.ItalianRestaurant;
import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Abstractor.Restaurant;
import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor.PapperoniPizza;
import DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor.VeggiePizza;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new AmericanRestaurant(new PapperoniPizza());
		restaurant.makePizza();
		
		restaurant = new ItalianRestaurant(new VeggiePizza());
		restaurant.makePizza();

	}

}
