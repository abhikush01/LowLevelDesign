package DesignPatterns.BehavioralPattern.CommandPattern.Ac;

public class AcTurnOnCommand implements ICommand {
	
	Ac ac;
	AcTurnOnCommand(Ac ac){
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.turnOn();
	}

}
