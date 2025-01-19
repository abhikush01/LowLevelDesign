package DesignPatterns.CreationalPattern.FactoryPattern.ShapePattern;

public class ShapeFactory {

	public Shape createShape(String type){
		switch(type) {
		case "CIRCLE" : return new Circle();
		case "RECTANGLE" : return new Rectangle();
		default : return new Square();
		}
	}
	
}
