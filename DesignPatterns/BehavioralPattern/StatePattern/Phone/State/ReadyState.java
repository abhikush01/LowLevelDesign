package DesignPatterns.BehavioralPattern.StatePattern.Phone.State;

import DesignPatterns.BehavioralPattern.StatePattern.Phone.Phone;

public class ReadyState extends State {
	public ReadyState(Phone phone) {
		super(phone);
	}
	@Override
	public String onHome() {
		return phone.Home();
	}

	@Override
	public String onOffOn() {
		phone.setState(new OffState(phone));
		return phone.lock();
	}

}
