package DesignPatterns.BehavioralPattern.ObserverPattern.Wheather;

public interface Subject {

	public void addObserver(Observer obj);
	public void removeObserver(Observer obj);
	public void updateObserver();
	public int getData();
	public void setData(int i);
	
	
}
