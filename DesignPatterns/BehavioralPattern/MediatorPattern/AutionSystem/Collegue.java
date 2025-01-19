package DesignPatterns.BehavioralPattern.MediatorPattern.AutionSystem;

public interface Collegue {
	public void setMediator(Mediator mediator);
	public void placeBid(int amount);
	public void receiveNotification(String name,int amount);
	public String getName();
}
