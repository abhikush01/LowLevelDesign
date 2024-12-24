package CreationalPattern.BuilderPattern.Student;

import java.util.List;

public class Student {
	
	private String roll;
	private String name;
	private String email;
	private String course;
	private String sem;
	private int phone;
	private String address;
	private List<String> subjects;
	
	
	Student(String roll, String name, String email, String course, String sem, int phone, String address,
			List<String> subjects) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.course = course;
		this.sem = sem;
		this.phone = phone;
		this.address = address;
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", course=" + course + ", sem=" + sem
				+ ", phone=" + phone + ", address=" + address + ", subjects=" + subjects + "]";
	}
	
	
}
