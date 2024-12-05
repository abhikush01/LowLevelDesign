package CreationalPattern.FactoryMethodPattern;

public abstract class ShapeFactory {

	public Shape generate(){
		Shape shape = createShape();
		shape.draw();
		return shape;
	}
	
	public abstract Shape createShape();
	
}
