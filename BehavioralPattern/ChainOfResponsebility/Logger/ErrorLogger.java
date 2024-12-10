package BehavioralPattern.ChainOfResponsebility.Logger;

public class ErrorLogger extends Logger {

	ErrorLogger(Logger logger){
		super(logger);
	}
	ErrorLogger(){}
	
	@Override
	public void log(String log) {
		
		if(log.equals("ERROR")) {
			System.out.println("ERROR Logger Invoked");
		}
		else if(super.logger != null) {
			logger.log(log);
		}

	}

}
