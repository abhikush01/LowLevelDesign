package CreationalPattern.FactoryPattern.ShapePattern;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		factory.createShape("RECTANGLE").draw();

	}

}
