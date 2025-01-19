package DesignPatterns.BehavioralPattern.MementoPattern;

public class ConfigurationMemento {

	private int height;
	private int width;
	
	ConfigurationMemento(int height,int width){
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth(){
		return this.width;
	}
	
}
