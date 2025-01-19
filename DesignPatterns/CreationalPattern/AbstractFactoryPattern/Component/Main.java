package DesignPatterns.CreationalPattern.AbstractFactoryPattern.Component;

public class Main {

	public static void main(String[] args) {
		
		Factory factory = new MsiFactory();
		Gpu gpu = factory.getGpu();
		Monitor monitor = factory.getMonitor();

	}

}