package BehavioralPattern.InterpretterPattern;

public class NumberTerminalExpression implements AbstractExpression {
	
	String key;
	
	NumberTerminalExpression(String key){
		this.key = key;
	}
	
	@Override
	public int interpret(Context context) {
		return context.get(key);
	}

}
