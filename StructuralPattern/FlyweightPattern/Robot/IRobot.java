package StructuralPattern.FlyweightPattern.Robot;

public abstract class IRobot {
	
	private String type;
    private Sprites body;
    
    IRobot(String type , Sprites body){
    	this.body = body;
    	this.type = type;
    }

	public String getType() {
		return type;
	}
	public Sprites getBody() {
		return body;
	}
	
	public abstract void display(int x,int y);
}
