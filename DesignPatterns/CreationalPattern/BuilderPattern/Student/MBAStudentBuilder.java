package DesignPatterns.CreationalPattern.BuilderPattern.Student;

import java.util.ArrayList;

public class MBAStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		this.subjects = new ArrayList<>();
		subjects.add("Economics");
		subjects.add("Accounts");
		return this;
	}

}
