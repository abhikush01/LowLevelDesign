package DesignPatterns.StructuralPattern.FlyweightPattern.Robot;

public class HumanoidRobot extends IRobot {

	HumanoidRobot(String type,Sprites body){
		super(type,body);
	}
	
	@Override
	public void display(int x, int y) {
		
		System.out.println("Humanoid Robot Created at coordinates (x , y) : " + "(" + x + " , " + y +")");

	}

}
