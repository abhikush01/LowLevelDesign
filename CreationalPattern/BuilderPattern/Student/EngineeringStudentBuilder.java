package CreationalPattern.BuilderPattern.Student;

import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		this.subjects = new ArrayList<>();
		subjects.add("JAVA");
		subjects.add("Operating System");
		subjects.add("DBMS");
		return this;
	}

}
