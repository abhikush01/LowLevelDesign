package StructuralPattern.AdaptorPattern.WeightMachine;

public class WeightKgAdaptor implements WeightKg {
	WeightPound weight;
	WeightKgAdaptor(){
		this.weight = new WeightPoundAdaptee();
	}
	@Override
	public double getWeightInKg(double num) {
		double pound = weight.getWeightInPound(num);
		return pound * 0.45;
	}

}
