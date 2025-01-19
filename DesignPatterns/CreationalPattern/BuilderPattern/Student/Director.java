package DesignPatterns.CreationalPattern.BuilderPattern.Student;

public class Director {
	
	StudentBuilder builder;
	Director(StudentBuilder builder){
		this.builder = builder;
	}
	
	public Student createStudent() {
		if(builder instanceof EngineeringStudentBuilder) {
			return createEngineer();
		}
		else{
			return createMBA();
		}
	}
	
	private Student createEngineer() {
		return builder.setRoll("ENG001").setName("ENG").setAddress("Home 1").setPhone(1234567890).setEmail("eng@eng.com").setSubjects().build();
	}
	private Student createMBA() {
		return builder.setRoll("MBA001").setName("MBA").setEmail("mba@mba.com").setSubjects().build();
	}
}
