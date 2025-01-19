package DesignPatterns.StructuralPattern.FacadePattern.Employee;


// In Dao class there can be 100s of Method and we only exposed few method here
public class EmployeeFacade {
	EmployeeDao employeeDao;
	
	EmployeeFacade(){
		this.employeeDao = new EmployeeDao();
	}
	
	public void saveEmployee(Employee emp) {
		employeeDao.saveEmployee(emp);
	}
	
	public Employee getEmployeeDetails(String empId) {
		return employeeDao.getEmployeeDetails(empId);
	}
	
}
