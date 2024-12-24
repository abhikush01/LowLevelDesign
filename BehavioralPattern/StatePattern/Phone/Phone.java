package BehavioralPattern.StatePattern.Phone;

import BehavioralPattern.StatePattern.Phone.State.OffState;
import BehavioralPattern.StatePattern.Phone.State.State;

public class Phone {
	State state;
	
	Phone(){
		state = new OffState(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String lock() {
		return "Locking phone and turning off the screen";
	}
	
	public String Home() {
		return "Going to home-screen";
	}
	
	public String unlock() {
        return "Unlocking the phone to home";
    }

    public String turnOn() {
        return "Turning screen on, device still locked";
    }
    
    public String clickHome() {
    	return state.onHome();
    }
    
    public String clickPower() {
    	return state.onOffOn();
    }
	
}
