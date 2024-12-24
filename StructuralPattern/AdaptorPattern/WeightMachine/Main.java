package StructuralPattern.AdaptorPattern.WeightMachine;

public class Main {

	public static void main(String[] args) {
		WeightKg weight = new WeightKgAdaptor();
		double kg = weight.getWeightInKg(100);
		System.out.println(kg);
	}

}
