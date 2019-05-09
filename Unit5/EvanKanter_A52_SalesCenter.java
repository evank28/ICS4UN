import java.util.Scanner;

public class EvanKanter_A52_SalesCenter
{
 public static void main (String[] args){
    Employee[] employeeDB = {new Manager("Diego", "Martin", 55000.00 ), new Associate("Kylie", "Walter", 18.50), new Associate("Michael", "Rose", 16.75)};
    while (true){
        Scanner stdin = new Scanner (System.in);
    System.out.print("Select one of the options: \n(E)mployee Information\n(P)ay\n(Q)uit\nEnter your choice: ");
    String choice1 = stdin.next().toLowerCase();
    if (choice1.equals("q")){
        System.exit(1);
    }
    System.out.print("Enter Employee Number (1, 2, or 3): ");
    Employee selection = employeeDB[stdin.nextInt()-1];
    if (choice1.equals("p")){
        try{ 
            if (selection instanceof Associate){
                System.out.print("Enter number of hours worked: ");
                System.out.println(selection +"\n" + String.format("$%.2f", selection.pay(stdin.nextInt())));
            }
        else System.out.println(String.format("$%.2f",selection.pay(0)));
        }
        catch (Exception e){
            System.out.println("Not enough information is available to calculate pay for Employee "+ selection); 
        }
    }
    else{
        System.out.println(selection);
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
    public abstract double pay(int hours);

}

class Manager extends Employee{
    private double yearSalary;
    public Manager(String fName, String lName, double salary) {
        super(fName, lName);
        yearSalary = salary;
    }

    public double getYearSalary() {
        return this.yearSalary;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Manager";
    }
    public double pay(int hours) {
        return yearSalary/52*2;
    }

}

class Associate extends Employee{
    private double hourPayRate;
    public Associate(String fName, String lName, double hourPayRate) {
        super(fName, lName);
        this.hourPayRate = hourPayRate;
    }

    public double getRate() {
        return this.hourPayRate;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Associate";
    }
    public double pay(int hours) {
        return hours * hourPayRate;
    }

}