package employeemanagement;

import java.util.ArrayList;

public class Company {

	String companyName;
	String industry;
	ArrayList<Department> departments;
	int established;
	
	public Company() {
			
	}
	public Company(String name, String ind, ArrayList<Department> dept, int est) {
		this.companyName = name;
		this.industry = ind;
		this.departments = dept;
		this.established = est;
	}
	public String changeCompanyName(String name) {
		String holder = this.companyName;
		this.companyName = name;
		return holder;
	}
	public void addDepartment(Department dept) {
		departments.add(dept);
	}
	public String removeDepartment(Department dept) {
		departments.remove(dept);
		return dept.deptName;
	}
	public Department getDepartment(String name) {
		for(int i = 0; i < departments.size(); i++) {
			if(departments.get(i).deptName.equals(name)) {
				return departments.get(i);	
			}
		}
		return new Department();
	}
	public Employee getEmployeeAll(int empNum) {
		for(Department dept : departments) {
			for(int i = 0; i < dept.employees.size(); i++) {
				if(dept.employees.get(i).employeeNum == empNum) {
					return dept.employees.get(i);
				}	
			}	
		}
		return new Employee();
	}
	public String toString() {
		return "Company Name: " + companyName + "\nIndustry: " + industry +
				"\nEstablished: " + established + "\n";
		
	}
}
