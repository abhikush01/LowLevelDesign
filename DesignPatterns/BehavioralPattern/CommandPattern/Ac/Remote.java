package DesignPatterns.BehavioralPattern.CommandPattern.Ac;

public class Remote {
	
	ICommand command;
	Remote(){
	}
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		this.command.execute();
	}
	
}
