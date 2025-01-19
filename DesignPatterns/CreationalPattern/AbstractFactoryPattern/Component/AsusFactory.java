package DesignPatterns.CreationalPattern.AbstractFactoryPattern.Component;

public class AsusFactory implements Factory {

	@Override
	public Gpu getGpu() {
		AsusGpu gpu = new AsusGpu();
		gpu.assemble();
		return gpu;
	}

	@Override
	public Monitor getMonitor() {
		AsusMonitor monitor = new AsusMonitor();
		monitor.assemble();
		return monitor;
	}

}
