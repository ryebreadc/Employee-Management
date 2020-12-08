package employeemanagement;

public class Employee extends Department {

	String fullName;
	String position;
	int timeAtComp;
	int salary;	
	int employeeNum;

	public Employee() {

	}

	public Employee(String name, String pos, int time, int sal, int empNum) {

		this.fullName = name;
		this.position = pos;
		this.timeAtComp = time;
		this.salary = sal;
		this.employeeNum = empNum;

	}
	//Changes the employees name
	public String nameChange(String name) {
		String holder = this.fullName;
		this.fullName = name;
		return holder;
	}	
	//Changes the employees position
	public String positionChange(String position) {
		String holder = this.position;
		this.position = position;
		return holder;	
	}
	//Adds one year to the employees timeAtComp since time doesn't go backwards
	public void anotherYear(int time) {
		this.timeAtComp++;
	}
	//Changes the employees salary
	public int salaryChange(int sal) {
		int holder = this.salary;
		this.salary = sal;
		return holder;	
	}
	public void fired() {
		this.position = "Past Employee";
		this.salary = 0;
	}
	public String toString() {
		if((fullName != null) && (position != null) && (employeeNum != 0)) {
			return  "      " + fullName + " " +employeeNum + " " + position +
				"\n        Pay: " + salary + " Tenure: " + timeAtComp;
				
		} else {
			return "      Employee does not exist!";
		}
	}
}
