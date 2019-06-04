import java.util.*;
public class Carnival
{
 public static void main (String[] args)
 {
     Scanner stdin = new Scanner(System.in);
     //initalize an array of different gamebooths
     GameBooth[] games = {new RedOrBlack(1.00, "some cotton candy", "a giant teddy bear"), new PennyToss(1.00, "some popcorn", "a stuffed panda"), new CoinFlip(1.50, "a lolipop", "an icecream sundae", stdin)};
     Player me = new Player(10.00);                           //initialize a player with an initial balance
     System.out.println("Welcome to the Carnival!");
     while (true){                                           //begins looping, allowing the user to continously navigate through the menu until they select (Q)uit
        System.out.print("\nSelect one of the following options: \n(G) Play a Game\n(S) See Balances & Prizes\n(Q) Quit\nEnter your choice: ");         //prints menu  
        String choice1 = stdin.next().toLowerCase();        //reads the user's selection, converting it to lower case
        if (choice1.equals("q")){
            System.exit(1);                                 //exits if instructed to do so by user
        }
        else if (choice1.equals("s")){
            System.out.println(me);                         //calls the toString() method of the Player class on the me instance, printing balance and list of prizes won
        }
        else if (choice1.equals("g")){
            System.out.print("Which game would you like to play?\n(1) Red or Black\n(2) Penny Toss\n(3) Coin Flip\n Enter your choice: ");
            int choice2 = stdin.nextInt();                  //accepts user input to specify a choice in game booth
            me.play(games[choice2-1]);                      //sends user input to player class' .play() method to evaulate if the player can afford the cost of the game, and if so to begin the game
        }
        else {
            System.out.println("Please enter one of the available options (G, S, Q).");         //catches any non-specified user input and instructs user to enter a value corresponding with the menu choices
        }
    }
}
}


abstract class GameBooth{
    private double cost;
    private String smallPrize;
    private String largePrize;

    /**
     * Constructor for Gamebooth class
     * @param cost is the double cost to the player expensed to play this game
     * @param smallPrize is the String expression representing the smaller prize that is available to win from this Game Booth
     * @param largePrize is the String expression representing the larger prize that is available to win from this Game Booth
     */
    public GameBooth(double cost, String smallPrize, String largePrize) {
        this.cost = cost;
        this.smallPrize = smallPrize;
        this.largePrize = largePrize;
    }

    /**
     * Cost accessor method
     * @return the cost of that gamebooth
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Large Prize accessor method
     * @return String value of the large Prize
     */
    public String getLargePrize(){
        return largePrize;
    }

    /**
     * Small Prize accessor method
     * @return String value of the small Prize
     */
    public String getSmallPrize(){
        return smallPrize;
    }
    public abstract String start();                  //abstract method to start each gamebooth, to be implemented in subclasses
}

class RedOrBlack extends GameBooth{
    public RedOrBlack(double cost, String smallPrize, String largePrize){
        super(cost, smallPrize, largePrize);        // sends parameters to superclass constructor
    }

    /**
     * Start method for RedOrBlack game
     * @return String expression of prize won
     */
    public String start(){
        String result = "You drew:";                            //Initializing string to hold output of result
        boolean large = true;
        String last="";
        String curr;
        String prize;
        for (int i=0; i<=2; i++){                               //Loops through 3 times to simulate 3 draws
            if (Math.random()>0.49){                            //Generates 50% probability of drawing red or black
               curr =  " Red";  
            }
            else{
                curr =  " Black";
            }
            if (i>0 & curr != last){                           //compares the colours of the draws to evaluate whether a large prize should be awarded
                large = false;                                 // if any of the prizes is not equal to the earlier prize, a small prize will be awarded
            }
            result += curr;                                    //appends the result to the result string
            last = curr;                                          
        }

        if (large){
            prize = super.getLargePrize();                     //access the large prize from the superclass, if needed
        }
        else{
            prize = super.getSmallPrize();                     //access the small prize from the superclass, if needed
        }
        System.out.println(result + "; you win "+ prize +".");      //outputs the result and prize won
        return prize;                                          //returns the correct prize
    }
}

class PennyToss extends GameBooth{
    private boolean[] grid = new boolean[16];                  //creates an empty grid with 16 squares
    public PennyToss(double cost, String smallPrize, String largePrize){
        super(cost, smallPrize, largePrize);                    //sends parameters to superclass constructor
    }
    
    /**
     * Start method for PennyToss game
     * @return String expression of prize won
     */
    public String start(){
    for (int i=0; i<=15; i++){                                 //iterates through the grid, resetting all squares to false (representing the lack of presence of a landed penny)
        grid[i]=false;
    }
    for (int i=0; i<=3; i++){                                  //loops 3 times, representing three seperate coin tosses
        grid[(int)(Math.random()*16)]=true;                    //sets a random "square"(index) within the "grid"(array) to true, representing a penny landing on that square
    }
    if (grid[0] || grid[1] || grid[7] || grid[8] || grid[10]){
        System.out.println("One or more of your coins landed on a poster.");   //if any of the squares with posters on them (per the assignment specification) are hit by a penny, the user is notified and a small prize is awarded
        return super.getSmallPrize();
    }
    else if (grid[2] && grid[5] && grid[15]){                  //if all 3 pennies land on squares with plush tigers (per the assignment specification), the user is notified and a large prize is awarded
        System.out.println("All your coins landed on plush tigers!");
        return super.getLargePrize();
    }
    return "no prize";                                         //if neither of the above 2 conditions are met, no prize is awarded
    }
    
}

class CoinFlip extends GameBooth{
    int score=0;
    Scanner stdin;
    final String[][] coinFaces = new String[][]{{"h", "Heads"}, {"t", "Tails"}};            //initializes a 2D array of short and long forms of the sides of the coin
    public CoinFlip(double cost, String smallPrize, String largePrize, Scanner stdin){
        super(cost, smallPrize, largePrize);                                                //passes the params to the superclass
        this.stdin=stdin;                                                                   //passes the reference to the Scanner object from the main class to the CoinFlip object
    }

    /**
     * Prints the instructions for the CoinFlip game, using the prizes used when initializing the instance of the game booth.
     */
    public void printInstructions(){
        System.out.println("INSTRUCTIONS: You will be allowed to flip a two sided coin up to 2 times. Each time, to win a prize you will have to correctly guess which side will be up when the coin lands. If you guess correctly the first time, you will be allowed to either walk away with " + this.getSmallPrize() + " or guess again for the chance to win " + this.getLargePrize() + " (at the risk of losing the prize you initially won). \n");
    }
    /**
     * Start method for CoinFlip game
     * @return String expression of prize won
     */
    public String start(){
        System.out.println("Do you guess (H)eads or (T)ails?");
        String guess = new String (stdin.next().toLowerCase());                              //takes input for the guess of the user. Creates a new String reference for each input, since this method can run multiple times per game
        int flipInt = (int)(Math.random()*2);                                                //generates a random int either 1 or 0
        String flipStr = coinFaces[flipInt][0];                                              //converts the random int flipInt into the short form of the side of the coin by referring to the 2D array of Strings coinFaces
        String wrongFlip;                                                                    //declares String to store the name of the opposite side of the coin, if needed
      
        if (guess.equals(flipStr)){                                                          //evaulates if the user's guess was accurate
            score++;                                                                         //if so, add's to the user's score
            System.out.println("Your guess of "+coinFaces[flipInt][1] + " is correct!");                //and notifies user of correct guess
 //if the user has guessed correctly just once, they are given the option to play again for the chance to win a large prize (and risk losing the small prize they have already won), or to simply walk away with the smaller prize
            if (score==1){                                                                  
                System.out.println("You win a small prize. Would you like to flip again for a chance at a large prize? (Y/N)");
                if (stdin.next().toLowerCase().equals("y")){                                //evaulates user input to determine if the user chooses to play again
                    return this.start();                                                   //recursively calls the .start() method if the user wishes to play again
                }
                else {                                                                     
                    score=0;                                                                //if the user does not wish to play again, the score is reset (for any future calls to the same object)
                    return super.getSmallPrize();                                           //the smallPrize value from the superclass is accessed and returned
                }
            }
            if (score>1)                                                                    //if the user chose to play again and again guessed correctly, the large prize is returned
                score=0;                                                                    //the score is reset (for any future calls to the same object)
                return super.getLargePrize();
        }
        else{
            //if the user guesses wrong, the String value of their guess is pulled from the 2D array of Strings coinFaces
            if (flipInt >0){            
                wrongFlip = coinFaces[0][1];
            }
            else{
                wrongFlip = coinFaces[1][1];
            }
            System.out.print("We're sorry, but your guess of "+wrongFlip + " is not correct. ");        //the user is notifieid their guess was incorrect
            if (score>0)
                System.out.println("You lose your prize. ");                                             //if the user was playing again in the "all or nothing" second round, and they guessed wrong, they are notified that they lost their initial small prize
            score=0;
            return "no prize";                                                                           //the result that no prize was won is returned
        }
        
    }
}
class Player{
    private double spendingMoney=0;                                     //Initializing private fields for Player class
    private ArrayList<String> prizesWon = new ArrayList<String>();
    
    public Player(){                                                     //Default Constructor for Player class       
    }
    public Player(double initialFunds){                                 //Constructor for Player class
        spendingMoney = initialFunds;                                   //Sets spendingMoney to initial value
    }

    public void play (GameBooth game){
        if (game.getCost() <= spendingMoney){                             //evaluates if player can afford the cost of the game
            spendingMoney -= game.getCost();                             //deducts the cost from the spending money
            System.out.println("You are playing "+game.getClass().getSimpleName()+"...");
            try {                                                                //because game is cast to superclass GameBooth as the parameter of play, I will need to cast back down to the subclass inorder to print instructions. To do this, I will use a try-catch block to prevent ClassCast exceptions that could be thrown.
                ((CoinFlip) game).printInstructions();                           //prints the instructions if the game is CoinFlip
            }
            catch (ClassCastException e){}                                       //catch the ClassCastException and ignore it
            String prize = game.start();                                //begins selected game 
            System.out.println("You recieved " + prize + ".");           //prints the prize won
            if (prize!="no prize")
                prizesWon.add(prize);                                    //if a prize was won, it is appended to the ArrayList of Strings prizesWon                                                                                         
        } 
        else{
            System.out.println("Sorry, you don't have enough cash to afford that game.");         //if a user cannot afford a game, they are notified of their lack of sufficient funds
        }
    }

    public String toString(){
        String prizeString = "";
        Iterator list = prizesWon.listIterator();
        while (list.hasNext()){                                     //Converts the ArrayList of prizes won to a String, by iterating through each Prize and appending to a String
            prizeString+=", " + list.next();   
        }
        if (prizeString.length()>0)
            prizeString=prizeString.substring(2);                   //a substring that removes the initial comma and space from prizeString is set to prizeString
        else
            prizeString="none";                                     //if absolutely no prizes were won, thr String "none" is returned in place of a null value
       return "Your balance is " + String.format("$%.2f", spendingMoney) +". You have won the following prizes: " + prizeString + ".";    //Returns string of balance and list of prizes won
    }
}