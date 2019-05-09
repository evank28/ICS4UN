import java.util.Scanner;

public class EvanKanter_A52_SalesCenter
{
 public static void main (String[] args){
    //initalize a database of employees stored as an Array
    Employee[] employeeDB = {new Manager("Diego", "Martin", 55000.00 ), new Associate("Kylie", "Walter", 18.50), new Associate("Michael", "Rose", 16.75)};
    
    
    while (true){       //begins looping, allowing the user to continously navigate through the menu until they select (Q)uit
        Scanner stdin = new Scanner (System.in);
        System.out.print("\nSelect one of the options: \n(E)mployee Information\n(P)ay\n(Q)uit\nEnter your choice: ");             // prints the main menu
        String choice1 = stdin.next().toLowerCase();            //reads the user's selection, converting it to lower case
        if (choice1.equals("q")){
            System.exit(1);                                     //exits if instructed to do so by user
        }
        System.out.print("Enter Employee Number (1, 2, or 3): ");
        Employee selection = employeeDB[stdin.nextInt()-1];     //selects the employee specified by the user from the previously created EmployeeDB Array
        if (choice1.equals("p")){
            try{ 
                if (selection instanceof Associate){            //if the selected Employee is an Associate, then the user is prompted to enter hours worked
                    System.out.print("Enter number of hours worked: ");
                    System.out.println(selection +"\n" + String.format("$%.2f", selection.pay(stdin.nextInt())));
                }
            else System.out.println(String.format("$%.2f",selection.pay(0)));       //if the selected Employee is a manager, then the pay is calculated without additional prompting
            }
            catch (Exception e){
                System.out.println("Not enough information is available to calculate pay for Employee "+ selection);       //if the type of employee -- Associate or Manager -- is not specified, an error is thrown
            }
        }
        else{
            System.out.println(selection);                      //if the user originally selected "Employee Information", then the info for the selected employee is printed
        }
    }
    
    }
}

abstract class Employee {
    private String FirstName;
    private String LastName;
    public Employee(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String toString() {
        return  this.FirstName + " " + this.LastName;
    }
    public abstract double pay(int hours);          //defines abstract pay method that will be implemented later

}

class Manager extends Employee{
    private double yearSalary;          //annual salary for the Manager

    /**
     * Constructor for the Manager Class which extends Employee
     * @param fName
     * @param lName
     * @param salary
     */
    public Manager(String fName, String lName, double salary) {
        super(fName, lName);        //passes name variables to superclass
        yearSalary = salary;        //sets the salary according to user input
    }

    /**
     * Gets the previously stored annual salary
     * @return double Salary
     */
    public double getYearSalary() {
        return this.yearSalary;
    }
    
    @Override
    public String toString() {
        return  super.toString() + ", Manager";
    }

    /**
     * implements abstract pay method, calculating bi-weekly salary calculated off of the annual salary stored previously
     *  @param hours -- although there is an hours param for the sake of implementing the abstract pay method, it is unused in this implementation
     *  @return double bi-weekly salary
     */
    public double pay(int hours) {
        return yearSalary/52*2;     
    }

}

class Associate extends Employee{
    private double hourPayRate;         // hourly pay rate for the employee

     /**
     * Constructor for the Associate Class which extends Employee
     * @param fName is the first name
     * @param lName is the last name
     * @param hourPayRate is the hourly pay rate for the employee, as entered by the user
     */
    public Associate(String fName, String lName, double hourPayRate) {
        super(fName, lName);                //pasing name variables to the superclass
        this.hourPayRate = hourPayRate;
    }

    public double getRate() {
        return this.hourPayRate;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Associate";
    }

    /**
     * implements abstract pay method, calculating the bi-weekly pay by taking hours worked <br/>and multiplying by the hourly rate
     *@param hours is the hours worked
     * */
    public double pay(int hours) {
        return hours * hourPayRate;
    }

}