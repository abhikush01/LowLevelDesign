package DesignPatterns.CreationalPattern.BuilderPattern.Student;

import java.util.List;

public abstract class StudentBuilder {
	
	
	private String roll;
	private String name;
	private String email;
	private String course;
	private String sem;
	private int phone;
	private String address;
	protected List<String> subjects;
	
	
	
	public StudentBuilder setRoll(String roll) {
		this.roll = roll;
		return this;
	}
	
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public StudentBuilder setCourse(String course) {
		this.course = course;
		return this;
	}
	
	public StudentBuilder setSem(String sem) {
		this.sem = sem;
		return this;
	}
	
	public StudentBuilder setPhone(int phone) {
		this.phone = phone;
		return this;
	}
	
	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public abstract StudentBuilder setSubjects();
	
	public Student build() {
		return new Student(roll, name, email, course, sem, phone, address, subjects);
	}
}
