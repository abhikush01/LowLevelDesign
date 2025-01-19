package DesignPatterns.BehavioralPattern.InterpretterPattern;

public class SumNonTerminalExpression implements AbstractExpression {
	
	AbstractExpression leftExpression;
	AbstractExpression rightExpression;
	
	
	
	public SumNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}



	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) + rightExpression.interpret(context);
	}

}
