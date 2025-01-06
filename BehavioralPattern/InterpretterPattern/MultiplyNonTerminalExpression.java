package BehavioralPattern.InterpretterPattern;

public class MultiplyNonTerminalExpression implements AbstractExpression {
	
	AbstractExpression leftExpression;
	AbstractExpression rightExpression;
	
	
	
	public MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}



	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) * rightExpression.interpret(context);
	}

}
