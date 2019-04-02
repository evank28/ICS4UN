import java.util.Scanner;

public class EvanKanter_A44_LunchOrder_withObject
{
    public static void main (String[] args)
    {
        //This implemetation uses the food class to generate menu items, as dicussed by email
        //The following Array of Food objects stores the menu
        Food[] menu = new Food[] {new Food ("hamburgers", 1.85, 9.0, 33.0, 1.0), new Food ("salad", 2.0, 1.0, 11.0, 5.0), new Food ("fries", 1.3, 11.0, 36.0, 4.0), new Food ("soda", 0.95, 0.0, 38.0, 0.0)} ;
        
        double total = 0.0 ;
        Scanner stdin = new Scanner (System.in) ;
        
        for (int i = 0; i<menu.length; i++)     //prompts the user for quantity of each food item in the menu and adds the unit cost * the quantity entered to the total
        {   
            System.out.print("Enter number of servings of " + menu[i].name + ": ") ;
            total += stdin.nextInt() * menu[i].cost ;
            System.out.println("Each serving of " + menu[i].name + " has " + menu[i].fat + "g of fat, " + menu[i].carbs + "g of carbs, and " + menu[i].fiber + "g of fiber. \n") ;  //prints the nutritional facts as stored in the array above.
        }
       
        System.out.println("Your order comes to: $" + String.format("%.2f", total)) ;            //prints the total cost
    }
}

class Food 
{
     public double cost, carbs, fiber, fat ;                     //initalize variable to store the properties of food item
     public String name ;                                         //initalize variable for the name of the food item
   
    public Food (String name, double cost, double fat, double carbs, double fiber)      //constructor
    {
        this.name = name ;
        this.cost = cost ;
        this.carbs = carbs ;
        this. fiber =  fiber ;
        this.fat = fat ;
    }

}