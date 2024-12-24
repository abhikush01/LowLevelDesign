package BehavioralPattern.StatePattern.Phone.State;

import BehavioralPattern.StatePattern.Phone.Phone;

public class LockedState extends State {
	
	public LockedState(Phone phone){
		super(phone);
	}
	
	@Override
	public String onHome() {
		phone.setState(new ReadyState(phone));
		return phone.unlock();
	}

	@Override
	public String onOffOn() {
		phone.setState(new OffState(phone));
		return phone.lock();
	}

}
