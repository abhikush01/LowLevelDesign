package StructuralPattern.DecoratorPattern.Pizza;

public class Mushroom implements PizzaDecorator {

	BasePizza basePizza;
	
	Mushroom(BasePizza basePizza){
		this.basePizza = basePizza;
	}
	
	@Override
	public int getPrice() {
		return this.basePizza.getPrice() + 30;
	}

}
