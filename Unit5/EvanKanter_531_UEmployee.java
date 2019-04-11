
import java.util.Scanner;

public class EvanKanter_531_UEmployee {
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		/*System.out.println("Thanks for using our instant HR generator. Please provide the following info." +
								"\n space separated - String name, double salary, String department, boolean tenure, String jobTitle");*/
		Staff employ = new Staff ("Mr. Ianine", 112000, "Math and Computer Science", false, "Assistant Teacher");
		System.out.println(employ);
	}
}


class UEmployee {
	String employeeName;
	double salary;
	public UEmployee(String employeeName, double salary){
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public String getEmployeeName(){
		return employeeName;
	}

	public double getSalary(){
		return salary;
	}

	public void setSalary(double newSal){
		salary = newSal;
	}

}

class Faculty extends UEmployee{
	String departmentName;
	boolean tenure;
	public Faculty(String name, double salary, String department, boolean tenure){
		super(name, salary);
		departmentName = department;
		this.tenure = tenure;
	}
	/**@author vs-code generates the following accessor and modifier methods*/
	/** 
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	public double getMonthlySalary(){
		return salary/12;
	}

	@Override
	public String toString() {
		return "{ name = '"+ super.getEmployeeName() +
			"' &' departmentName='" + getDepartmentName() + "'" +
			"}";
	}
	
}

class Staff extends Faculty {
	String jobTitle;
	public Staff(String name, double salary, String department, boolean tenure, String jobTitle) {
		super(name, salary, department, tenure);
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return "{ Name = '" + super.getEmployeeName() +
			"' & jobTitle='" + getJobTitle() + "'" +
			"}";
	}


}