package CreationalPattern.PrototypePattern;

public class Student implements Prototype {
	
	public String name;
	private int roll;
	
	Student(){}
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public Student clone() {
		return new Student(name,roll);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}
