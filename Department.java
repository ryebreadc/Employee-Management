package employeemanagement;

import java.util.ArrayList;

public class Department extends Company {

	String deptName;
	ArrayList<Employee> employees;
	
	public Department() {
		
	}
	public Department(String name, ArrayList<Employee> emp) {
		this.deptName = name;
		this.employees = emp;
	}
	public void hireEmployee(Employee emp) {
		employees.add(emp);
	}
	public void fireEmployee(Employee emp) {
		employees.remove(emp);
		emp.fired();
	}
	public void setEmployeePosition(Employee emp, String newPos) {
		
		emp.positionChange(newPos);
	}
	public void setEmployeeSalary(Employee emp, int sal) {
		
		emp.salaryChange(sal);
	}
	public String toString() {
		
		return "Department Name: " + deptName + "\n";
	}
}
