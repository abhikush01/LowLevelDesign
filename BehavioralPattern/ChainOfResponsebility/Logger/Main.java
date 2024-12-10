package BehavioralPattern.ChainOfResponsebility.Logger;

public class Main {

	public static void main(String[] args) {
		
		Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger()));
		logger.log("INFO");

	}

}
