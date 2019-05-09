import java.util.Scanner;

public class EvanKanter_A53_CarLot{
 public static void main (String[] args){
     //initalize an inventory of cars stored as an Array
    Vehicle[] inventory = {new Car(2019,"Toyota", "Corolla", "Red",0, 1, 2), new Minivan(2019,"Honda","Odyssey","White",1, 0, 4, 3), new Truck(2018, "Dodge", "Ram", "Grey",1, 1, 4, 8)};
    
    while (true){           //begins looping, allowing the user to continously navigate through the menu until they select (Q)uit
        Scanner stdin = new Scanner (System.in);
    System.out.print("Select one of the options: \n(V)ehicle Information\n(S)tatus\n(Q)uit\nEnter your choice: ");          // prints the main menu
    String choice1 = stdin.next().toLowerCase();        //reads the user's selection, converting it to lower case
    if (choice1.equals("q")){
        System.exit(1);                                 //exits if instructed to do so by user
    }
    System.out.print("Select vehicle:\n(C)ar\n(M)inivan\n(T)ruck\nEnter your choice: ");
    Vehicle selection;
    switch(stdin.next().toLowerCase()){                 //uses a switch to select the vehicle specified by the user from the previously created inventory Array
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
        System.out.print("Vehicle Information:\n"+selection);       //if the user originally selected "Vehicle Information", then the info for the selected vehicle is printed
    }
    else{
        System.out.print("Change Status:\n(1) On the lot \n(2) In Maintenance\n(3) Rented out\nEnter your choice: ");      //if the user selected "Status", they are prompted to specify the new status for the vehicle
        selection.setVehicleStatus(stdin.nextInt()-1);                  //the user-entered status is assigned as the new vehicle status for the selected vehicle
    }
    System.out.println("\nThe vehicle is "+selection.getVehicleStatus()+".\n");     //the vehicle status is printed to the console

    }
    

    }
}

class Vehicle {
    private int year;
    private String make;
    private String model;   
    private String colour;
    private int status;
    private String[] statusCodes = {"on the lot", "in maintenance", "rented out"};      //Array of status codes for cars in the dealership

    /**
     * constructor for generic vehicle class
     * @param year
     * @param make
     * @param model
     * @param colour
     * @param status
     */
    public Vehicle(int year, String make, String model, String colour, int status) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.colour = colour;
    }
    
    /**
     * gets the vehicle status as currently stored
     * @return String vehicle status
     */
    public String getVehicleStatus() {
        return statusCodes[this.status];
    }

/**
 * sets the new vehicle status to specified param value
 * @param status
 */
    public void setVehicleStatus(int status) {
        this.status = status;
    }


    public String toString() {
        return year + " " + make + " " + model + ", " + colour;

    }
}

//defines a SpecificVehicle class extensing the generic Vehicle class
//this is an appropriate technique as it prevents code duplication
class SpecificVehicle extends Vehicle {
    private int fuelType;
    private int numDoors;
    private String[] fuelTypes = {"Gas", "Diesel"};         //Array storing the types of fuel for specific vehicles

    /**
     * Constructor for a specific vehicle
     * takes 2 new params:
     * @param fuelType
     * @param numDoors
     */
    public SpecificVehicle(int year, String make, String model, String colour, int status, int fuelType, int numDoors) {
        super(year, make, model, colour, status);       //passes properties of a generic vehicle to super class
        this.fuelType = fuelType;                       
        this.numDoors = numDoors;
    }

    public String toString() {
        return super.toString() + ", " + fuelTypes[fuelType] + ", " + numDoors + " doors";      //two string method converts the integer representation of fuel type into a String by pulling the String from the Array of Fuel Types

    }

}
class Car extends SpecificVehicle{

    /**
     * very simple constructor, simply passes values to the super class
     */
    public Car(int year, String make, String model, String colour, int status, int fuelType, int numDoors) {
        super(year, make, model, colour, status, fuelType, numDoors);       //passes params to superclass
    }

    public String toString() {
        return "Car - " + super.toString();
    }

}

class Minivan extends SpecificVehicle{
    private int rowsSeats;
    /**
     * constructor for Minivan class, adds 1 new parameter in addition to those of the superclass
     * @param rowsSeats
     */
    public Minivan(int year, String make, String model, String colour, int status, int fuelType, int numDoors, int rowsSeats){
        super(year, make, model, colour, status, fuelType, numDoors);       //passes params to superclass
        this.rowsSeats = rowsSeats;
    }

     public String toString() {
        return "Minivan - " + super.toString() + ", " + rowsSeats+ " rows";
    }
}

class Truck extends SpecificVehicle{
    private int engineCylinders;    //stores number of cylinders in the engine of the truck

    /**
     * constructor for Truck class, adds 1 new parameter in addition to those of the superclass
     * @param engingeCylinders
     */
    public Truck(int year, String make, String model, String colour, int status, int fuelType, int numDoors, int engingeCylinders){
        super(year, make, model, colour, status, fuelType, numDoors);       //passes params to superclass
        this.engineCylinders = engingeCylinders;
    }
    public String toString() {
        return "Truck - " + super.toString() + ", " + this.engineCylinders+ " cylinder";
    }
}