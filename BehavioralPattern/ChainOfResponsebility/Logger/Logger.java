package BehavioralPattern.ChainOfResponsebility.Logger;

public abstract class Logger {
	
	Logger logger;
	
	Logger(){}
	
	Logger(Logger logger){
		this.logger = logger;	
	}
	
	public abstract void log(String log);
	
}
