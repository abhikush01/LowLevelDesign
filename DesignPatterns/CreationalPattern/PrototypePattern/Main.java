package DesignPatterns.CreationalPattern.PrototypePattern;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Jhon",101);
		Student s2 = s.clone();
		System.out.println(s2.equals(s));
	}
}
