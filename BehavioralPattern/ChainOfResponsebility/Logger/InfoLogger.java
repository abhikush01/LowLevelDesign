package BehavioralPattern.ChainOfResponsebility.Logger;

public class InfoLogger extends Logger {

	InfoLogger(Logger logger){
		super(logger);
	}
	
	@Override
	public void log(String log) {
		
		if(log.equals("INFO")) {
			System.out.println("INFO Logger Invoked");
		}
		else if(super.logger != null) {
			logger.log(log);
		}

	}

}
