package DesignPatterns.StructuralPattern.FacadePattern.Employee;

public class Main {

	public static void main(String[] args) {
		EmployeeFacade employee = new EmployeeFacade();
		employee.saveEmployee(new Employee());

	}

}
