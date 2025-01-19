package DesignPatterns.StructuralPattern.FacadePattern.Employee;

public class EmployeeDao {
	
	public void saveEmployee(Employee emp) {
		//Save Logic
	}
	
	public Employee getEmployeeDetails(String empId) {
		// Get Employee Logic
		return new Employee();
	}
	
	public Employee updateEmployee(String empId, Employee updatedDetails) {
		return new Employee();
	}
	
	public void deleteEmployee(String empId) {
		
	}
	//Similarly there can be 100s of method in this class
	
}
