package StructuralPattern.AdaptorPattern.WeightMachine;

public class WeightPoundAdaptee implements WeightPound {

	@Override
	public double getWeightInPound(double num) {
		return num;
	}

}
