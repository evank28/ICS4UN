import java.util.Scanner;

public class EvanKanter_A43_digitExtractor
{
    public static void main (String[] args)
    {
        Scanner initial = new Scanner (System.in) ;
        System.out.print("Enter an integer: ") ;
        Num myNum = new Num(initial.nextInt()) ;
        //initial.close();
        myNum.initalize();
    }
}

class Num
{
    private int whole = 0 ;      //declare integer whole at 0
    private String wholeString = "0";     //declare a String representation of the whole integer entered

    public Num (int whole)    //param constructor to initialize class with the whole integer entered by the user
    {
        this.whole = whole ; 
        this.wholeString = ""+ this.whole ;
    }

    public void initalize ()              //Displays the UI and creates a Scanner instance to capture user input, using a loop to make selections based on that input
    {
        System.out.println(" Please select one of the following options: \n Show (W)hole number. \n Show (O)nes place number. \n Show (T)ens place number. \n Show (H)undreds place number. \n (Q)uit") ;
        Scanner input = new Scanner (System.in) ;
        while (true) this.select(input) ;   //Loops through waiting for the user to exit the program.
    }
    public void select (Scanner input)      //Uses a switch to make decisions 
    {
        System.out.println("Enter your choice:") ; 

       switch (input.next())
       {
            default:                     //The program will only accept choices from the main menu, or it will notify the user of an input error
                System.out.println("\n ERROR: Please enter a choice from the list above. (W, O, T, H, or Q) \n") ;
                break ;

            // The following input cases correspond to the the main menu UI that is printed in num.initialize()
            case "Q":
                System.out.println("Goodbye!") ;        //Prints an exit message and then exits the program.
                System.exit(0) ;
            
            case "W":
                System.out.println("The whole integer is: "+ whole );   //prints the whole integer
                break ;

            case "O":
                System.out.println("The ones digit is: "+ wholeString.charAt(wholeString.length()-1) ) ;    //prints the ones digit
                break ;

            case "T": 
                if (whole>=10) System.out.println("The tens digit is: "+ wholeString.charAt(wholeString.length()-2) ) ;     //prints the tens digit or outputs an error if the number has no tens digit
                else System.out.println("There is no tens digit." ) ;
                break ;

            case "H":
                if (whole>=100) System.out.println("The hundreds digit is: "+ wholeString.charAt(wholeString.length()-3) ) ;     //prints the hundreds digit or outputs an error if the number has no hundreds digit
                else System.out.println("There is no hundreds digit." ) ;
                break ;

       } 

    }

}