import java.util.Scanner;

public class EvanKanter_A53_CarLot{
 public static void main (String[] args){
    Vehicle[] inventory = {new Car(2019,"Toyota", "Corolla", "Red",1, 1, 2), new Minivan(2019,"Honda","Odyssey","White",1, 1, 4, 3), new Truck(2018, "Dodge", "Ram", "Grey",1, 2, 4, 8)};
    
    while (true){
        Scanner stdin = new Scanner (System.in);
    System.out.print("Select one of the options: \n(V)ehicle Information\n(S)tatus\n(Q)uit\nEnter your choice: ");
    String choice1 = stdin.next().toLowerCase();
    if (choice1.equals("q")){
        System.exit(1);
    }
    System.out.print("Select vehicle:\n(C)ar\n(M)inivan\n(T)ruck\nEnter your choice: ");
    Vehicle selection;
    switch(stdin.next().toLowerCase()){
        default:  
            selection = inventory[0];
            break;
        case "m":
            selection = inventory[1];
            break;
        case "t":
            selection = inventory[2];
            break;
    }
    if (choice1.equals("v")){
        System.out.print("Vehicle Information:\n"+selection);
    }
    else{
        System.out.print("Change Status:\n(1) On the lot \n(2) In Maintenance\n(3) Rented out\nEnter your choice: ");
        selection.setVehicleStatus(stdin.nextInt()-1);
    }
    System.out.println("\nThe vehicle is "+selection.getVehicleStatus()+".\n");

    }
    

    }
}

abstract class Vehicle {
    private int year;
    private String make;
    private String model;   
    private String colour;
    private int status;
    private String[] statusCodes = {"on the lot", "in maintenance", "rented out"};

    public Vehicle(int year, String make, String model, String colour, int status) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.colour = colour;
    }
    
    public String getVehicleStatus() {
        return statusCodes[this.status];
    }


    public void setVehicleStatus(int status) {
        this.status = status;
    }


    public String toString() {
        return year + " " + make + " " + model + ", " + colour;

    }
}

class SpecificVehicle extends Vehicle {
    private int fuelType;
    private int numDoors;
    private String[] fuelTypes = {"Gas", "Diesel"};

    public SpecificVehicle(int year, String make, String model, String colour, int status, int fuelType, int numDoors) {
        super(year, make, model, colour, status);
        this.fuelType = fuelType;
        this.numDoors = numDoors;
    }

    public String toString() {
        return super.toString() + ", " + fuelTypes[fuelType] + ", " + numDoors + " doors";

    }

}
class Car extends SpecificVehicle{
    public Car(int year, String make, String model, String colour, int status, int fuelType, int numDoors) {
        super(year, make, model, colour, status, fuelType, numDoors);
    }

    public String toString() {
        return "Car - " + super.toString();
    }

}

class Minivan extends SpecificVehicle{
    private int rowsSeats;
    public Minivan(int year, String make, String model, String colour, int status, int fuelType, int numDoors, int rowsSeats){
        super(year, make, model, colour, status, fuelType, numDoors);
        this.rowsSeats = rowsSeats;
    }

     public String toString() {
        return "Minivan - " + super.toString() + ", " + rowsSeats+ " rows";
    }
}

class Truck extends SpecificVehicle{
    private int engineCylinders;
    public Truck(int year, String make, String model, String colour, int status, int fuelType, int numDoors, int engingeCylinders){
        super(year, make, model, colour, status, fuelType, numDoors);
        this.engineCylinders = engingeCylinders;
    }
    public String toString() {
        return "Truck - " + super.toString() + ", " + this.engineCylinders+ " cylinder";
    }
}