package StructuralPattern.FlyweightPattern.Robot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	private static Map<String,IRobot> map = new HashMap<>();
	
	public static IRobot createRobot(String type) {
		if(map.containsKey(type)) {
			return map.get(type);
		}
		else {
			if(type.equals("HUMANOID")) {
				Sprites humanoidSprite = new Sprites();
                IRobot humanoidObject = new HumanoidRobot(type, humanoidSprite);
                map.put(type, humanoidObject);
                return humanoidObject;
			}
			else {
				Sprites roboticDogSprite = new Sprites();
                IRobot roboticDogObject = new RoboticDog(type, roboticDogSprite);
                map.put(type, roboticDogObject);
                return roboticDogObject;
			}
		}
	}
}
