package DesignPatterns.BehavioralPattern.ObserverPattern.Wheather;

public class PhoneDisplay implements Observer {

	@Override
	public void update(Subject sub) {
		
		System.out.println("Phone display Updated data "+sub.getData());		
	}

}