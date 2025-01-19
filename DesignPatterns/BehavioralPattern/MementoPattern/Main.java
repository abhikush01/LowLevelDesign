package DesignPatterns.BehavioralPattern.MementoPattern;

public class Main {

	public static void main(String[] args) {
		
		ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
		
		ConfigurationOriginator originator = new ConfigurationOriginator(10,20);
		
		careTaker.addMemento(originator.createMemento());
		
		System.out.println(originator);
		
		originator.setHeight(15);
		originator.setWidth(20);
		
		careTaker.addMemento(originator.createMemento());
		
		System.out.println(originator);
		
		originator.setHeight(25);
		originator.setWidth(20);
		System.out.println(originator);
		originator.restore(careTaker.undo());
		
		System.out.println(originator);

	}

}
