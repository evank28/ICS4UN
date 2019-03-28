import java.util.Scanner;

public class EvanKanter_A42_mySavings
{
    public static void main (String[] args)
    {
        System.out.println("Please initialize the piggy bank. Enter the starting balance: ") ;
        Scanner initial = new Scanner (System.in) ;
        PiggyBank myBank = new PiggyBank(initial.nextDouble()) ;
        //initial.close();
        myBank.initalize();
    }
}

class PiggyBank
{
    private double balance = 0.0 ;      //initialize balance

    public PiggyBank ()                  //no param constructor
    {
    }

    public PiggyBank (double balance)    //param constructor to initialize class with a set balance
    {
        this.balance = balance ; 
    }

    public void initalize ()              //Displays the UI and creates a Scanner instance to capture user input, using a loop to make selections based on that input
    {
        System.out.println(" Please select one of the following options: \n 1. Show total in bank \n 2. Add a penny. \n 3. Add a nickel. \n 4. Add a dime. \n 5. Add a quarter. \n 6. Take money out of the bank. \n    Enter 0 to quit. \n") ;
        Scanner input = new Scanner (System.in) ;
        while (true) this.select(input) ;   //Loops through waiting for the user to exit the program.
    }
    public void select (Scanner input)      //Uses a switch to make decisions 
    {
        System.out.println("Enter your choice:") ;

       switch (input.nextInt())
       {
           default:                     //The program will only accept choices 0 through 6, or it will notify the user of an input error
                System.out.println("\n ERROR: Please enter a value between 0 and 6. \n") ;
                break ;

            // The following input cases correspond to the the main menu UI that is printed in piggyBank.initialize()
            case 0:
                System.out.println("Goodbye!") ;        //Prints an exit message and then exits the program.
                System.exit(0) ;

            case 1:
                this.printBalance() ; 
                break ;

            case 2: 
                this.addPenny() ;
                break ;

            case 3:
               this.addNickel() ;
               break ;

            case 4:
                this.addDime() ;
                break ;

            case 5:
                this.addQuarter() ;
                break ;

            case 6:
                this.withdraw(input) ;
                break ;
       } 

    }

    public void printBalance()   // prints the balance in the bank
    {
        System.out.println("Your current balance is: $"+ String.format("%.2f", balance) );
    }

    public void addPenny()       // adds $0.01 to the bank balance
    {
        balance+=0.01 ;
        System.out.println("Congratulations - you've saved an extra penny!") ;
    }

    public void addNickel()      // adds $0.05 to the bank balance
    {
        balance+=0.05 ;
        System.out.println("Congratulations - you've saved an extra Nickel!") ;
    }

    public void addDime()        // adds $0.10 to the bank balance
    {
        balance+=0.10 ;
        System.out.println("Congratulations - you've saved an extra Dime!") ;
    }

    public void addQuarter()     // adds $0.25 to the bank balance
    {
        balance+=0.25 ;
        System.out.println("Congratulations - you've saved an extra Quarter!") ;
    }

    public void withdraw(Scanner input)              //withdraws a user-specified amount from the bank or yelds an error if there are less funds than the user wishes to withdraw
    {
        System.out.print ("How much would you like to withdraw? \n$") ;
        double  withdrawal = input.nextDouble() ;      // assigns the next double in the stream to the withdraw variable
        if (balance - withdrawal >= 0.0)                // checks if the specified amount of funds is in the bank
        {
            balance-= withdrawal ;                      //subtracts the specified amoutn from the balance and confirms to the user
            System.out.println ("You have succesfully withdrawn $"+String.format("%.2f", withdrawal)+".\n") ;
        }
        else 
        {
            System.out.println ("Sorry, you have insufficient funds for that transaction. Please enter a lesser amount to withdraw.") ;
            this.withdraw(input);               //Recursive call to allow the user to re-enter the transaction amount, without returning to the main menu
        }
    }

}