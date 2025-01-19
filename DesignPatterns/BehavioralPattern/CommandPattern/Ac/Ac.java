package DesignPatterns.BehavioralPattern.CommandPattern.Ac;

public class Ac {
	
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
		System.out.println("AC is on");
	}
	
	public void turnOff(){
		isOn = false;
		System.out.println("AC is off");
	}
	
}
