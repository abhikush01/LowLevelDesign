package StructuralPattern.DecoratorPattern.Pizza;

public class Cheese implements PizzaDecorator {

	BasePizza basePizza;
	
	Cheese(BasePizza basePizza){
		this.basePizza = basePizza;
	}
	
	@Override
	public int getPrice() {
		return this.basePizza.getPrice() + 20;
	}

}
