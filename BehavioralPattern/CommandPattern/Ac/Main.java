package BehavioralPattern.CommandPattern.Ac;

public class Main {

	public static void main(String[] args) {
		Ac ac = new Ac();
		Remote remote = new Remote();
		ICommand command = new AcTurnOnCommand(ac);
		remote.setCommand(command);
		
		remote.pressButton();
		remote.setCommand(new AcTurnOffCommand(ac));
		remote.pressButton();

	}

}
