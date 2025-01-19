package DesignPatterns.CreationalPattern.FactoryMethodPattern;

public class CircleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
