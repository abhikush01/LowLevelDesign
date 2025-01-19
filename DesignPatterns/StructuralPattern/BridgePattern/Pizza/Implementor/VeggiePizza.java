package DesignPatterns.StructuralPattern.BridgePattern.Pizza.Implementor;

public class VeggiePizza extends Pizza {

	@Override
	public void assemble() {
		System.out.println("Crust is : " + super.getCrust());
		System.out.println("Adding Sauce : " + super.getSauce());
		System.out.println("Adding Toppings : "+ super.getToppings());
		System.out.println("Adding Cheese");

	}


}
