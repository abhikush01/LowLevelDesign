package BehavioralPattern.CommandPattern.Ac;

public class AcTurnOffCommand implements ICommand {

	Ac ac;
	AcTurnOffCommand(Ac ac){
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.turnOff();
	}

}
