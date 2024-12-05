package CreationalPattern.AbstractFactoryPattern.Component;

public class MsiFactory implements Factory {

	@Override
	public Gpu getGpu() {
		MsiGpu gpu = new MsiGpu();
		gpu.assemble();
		return gpu;
	}

	@Override
	public Monitor getMonitor() {
		MsiMonitor monitor = new MsiMonitor();
		monitor.assemble();
		return monitor;
	}

}
