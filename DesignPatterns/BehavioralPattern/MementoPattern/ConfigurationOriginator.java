package DesignPatterns.BehavioralPattern.MementoPattern;

public class ConfigurationOriginator {
	
	private int height;
	private int width;
	
	ConfigurationOriginator(int height,int width){
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public ConfigurationMemento createMemento() {
		return new ConfigurationMemento(height,width);
	}
	
	public void restore(ConfigurationMemento memento) {
		this.height = memento.getHeight();
		this.width = memento.getWidth();
	}
	
	public String toString() {
		return "height: " + height + " Width: " + width;
	}
	
}
