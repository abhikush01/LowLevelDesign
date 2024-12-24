package CreationalPattern.BuilderPattern.Student;

public class Main {

	public static void main(String[] args) {
		Director dir1 = new Director(new EngineeringStudentBuilder());
		Student student1 = dir1.createStudent();
		System.out.println(student1);
		
		Director dir2 = new Director(new MBAStudentBuilder());
		Student student2 = dir2.createStudent();
		System.out.println(student2);
	}

}
