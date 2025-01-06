package StructuralPattern.FlyweightPattern.Robot;

public class RoboticDog extends IRobot {

	RoboticDog(String type,Sprites body){
		super(type,body);
	}
	
	@Override
	public void display(int x, int y) {
		
		System.out.println("Robotic Dog Created at coordinates (x , y) : " + "(" + x + " , " + y +")");

	}

}
