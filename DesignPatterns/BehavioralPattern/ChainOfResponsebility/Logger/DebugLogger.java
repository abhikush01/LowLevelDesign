package DesignPatterns.BehavioralPattern.ChainOfResponsebility.Logger;

public class DebugLogger extends Logger {

	DebugLogger(Logger logger){
		super(logger);
	}
	
	@Override
	public void log(String log) {
		
		if(log.equals("DEBUG")) {
			System.out.println("DEBUG Logger Invoked");
		}
		else if(super.logger != null) {
			logger.log(log);
		}

	}

}
