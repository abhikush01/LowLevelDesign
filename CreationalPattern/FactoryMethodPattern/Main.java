package CreationalPattern.FactoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory factory = new SquareFactory();
		Shape shape = factory.generate();
		

	}

}
