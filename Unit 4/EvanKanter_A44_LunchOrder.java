import java.util.Scanner;

public class EvanKanter_A44_LunchOrder
{
    public static void main (String[] args)
    {
        //If I had learned hash maps, I would store all the below Arrays in a hash map instead
        final double[] costs = new double[] {1.85, 2.00, 1.30, 0.95} ;                        //stores the unit costs of the 4 foods
        final String[] foods = new String[] {"hamburgers", "salads", "fries", "sodas"} ;      //stores the names of all the foods
        final double[] fat = new double[] {9.0, 1.0, 11.0, 0.0} ;                             // stores the fat in grams of all the foods
        final double[] carbs = new double[] {33.0, 11.0, 36.0, 38.0} ;                        // stores th carbs in grams of all the foods
        final double[] fiber = new double[] {1.0, 5.0, 4.0, 0.0} ;                            // stores th fiber in grams of all the foods

        double total = 0.0 ;
        Scanner stdin = new Scanner (System.in) ;
        
        for (int i = 0; i<4; i++)   //prompts the user for quantity of each food and adds the unit cost * the quantity entered to the total
        {   
            System.out.print("Enter number of " + foods[i] + ": ") ;
            total += stdin.nextInt() * costs[i] ;
            System.out.println("Each serving of " + foods[i] + " has " + fat[i]+ "g of fat, " + carbs[i] + "g of carbs, and " + fiber[i] + "g of fiber. \n") ;  //prints the nutritional facts as stored in the array above.
        }
       
        System.out.println("Your order comes to: $" + String.format("%.2f", total)) ;     //prints the total cost
    }
}