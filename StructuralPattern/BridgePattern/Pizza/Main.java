package StructuralPattern.BridgePattern.Pizza;

import StructuralPattern.BridgePattern.Pizza.Abstractor.AmericanRestaurant;
import StructuralPattern.BridgePattern.Pizza.Abstractor.ItalianRestaurant;
import StructuralPattern.BridgePattern.Pizza.Abstractor.Restaurant;
import StructuralPattern.BridgePattern.Pizza.Implementor.PapperoniPizza;
import StructuralPattern.BridgePattern.Pizza.Implementor.VeggiePizza;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new AmericanRestaurant(new PapperoniPizza());
		restaurant.makePizza();
		
		restaurant = new ItalianRestaurant(new VeggiePizza());
		restaurant.makePizza();

	}

}
