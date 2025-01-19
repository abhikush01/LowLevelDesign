package DesignPatterns.BehavioralPattern.StatePattern.Phone.State;

import DesignPatterns.BehavioralPattern.StatePattern.Phone.Phone;

public abstract class State {
	Phone phone;
	
	State(Phone phone){
		this.phone = phone;
	}
	
	public abstract String onHome();
	public abstract String onOffOn();
	
}
