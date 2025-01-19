package DesignPatterns.CreationalPattern.FactoryMethodPattern;

public class SquareFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Square();
	}

	
}
