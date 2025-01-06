package BehavioralPattern.MementoPattern;

import java.util.Stack;

public class ConfigurationCareTaker {
	
	Stack<ConfigurationMemento> stk;
	
	ConfigurationCareTaker(){
		stk = new Stack<>();
	}
	
	public void addMemento(ConfigurationMemento memento){
		stk.push(memento);
	}
	
	public ConfigurationMemento undo() {
		return stk.isEmpty() ? null : stk.pop();
	}
	
}
