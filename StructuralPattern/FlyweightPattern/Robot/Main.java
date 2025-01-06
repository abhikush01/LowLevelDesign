package StructuralPattern.FlyweightPattern.Robot;

public class Main {

	public static void main(String[] args) {
		IRobot robot = RobotFactory.createRobot("HUMANOID");
		robot.display(50, 60);
		IRobot robot2 = RobotFactory.createRobot("HUMANOID");
		System.out.println(robot == robot2);

	}

}
