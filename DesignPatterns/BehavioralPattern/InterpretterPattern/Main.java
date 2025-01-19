package DesignPatterns.BehavioralPattern.InterpretterPattern;

public class Main {

	public static void main(String[] args) {
		
		Context context = new Context();
		context.put("a", 10);
		context.put("b", 5);
		context.put("c", 8);
		context.put("d", 6);
		
		AbstractExpression expression = new MultiplyNonTerminalExpression(
				new SumNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")), 
				new SumNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"))
				);
		
		System.out.println(expression.interpret(context));

	}

}
