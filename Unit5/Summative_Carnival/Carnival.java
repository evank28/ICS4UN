public class Carnival
{
 public static void main (String[] args)
 {

 }
}

abstract class GameBooth{
    private double cost;
    private String smallPrize;
    private String largePrize;
    public GameBooth(double cost, String smallPrize, String largePrize) {
        this.cost = cost;
        this.smallPrize = smallPrize;
        this.largePrize = largePrize;
    }


    public double getCost() {
        return this.cost;
    }

    public String getLargePrize(){
        return largePrize;
    }
    public String getSmallPrize(){
        return smallPrize;
    }
    public abstract String Start();                  //add this
    

}

class RedOrBlack extends GameBooth{
    public RedOrBlack(double cost, String smallPrize, String largePrize){
        super(cost, smallPrize, largePrize);
    }

    public String start(){
        String result = "You drew:";                            //Initializing string to hold output of result
        boolean large = true;
        String last;
        String curr;
        for (int i=0; i<=3; i++){                               //Loops through 3 times to simulate 3 draws
            if (Math.random()>0.49){                            //Generates 50% probability of drawing red or black
               curr =  " Red";  
            }
            else{
                curr =  " Black";
            }
            if (i>0 && curr != last){                           //compares the colours of the draws to evaluate whether a large prize should be awarded
                large = false;
            }
            result += curr;
            last = curr;
        }

        if (large){
            String prize = super.getLargePrize();
        }
        else{
            String prize = super.getSmallPrize();
        }
        System.out.println(result + "; you win a "+ prize);
        return prize;
    }
}


class PennyToss extends GameBooth{
    private boolean[] grid = new boolean[16];
    public PennyToss(double cost, String smallPrize, String largePrize){
        super(cost, smallPrize, largePrize);
    }

    public String start(){
    for (int i=0; i<=3; i++){
        grid[(int)(Math.random()*16)]=true;
    }
    if (grid[0] || grid[1] || grid[7] || grid[8] || grid[10]){
        return super.getSmallPrize();
    }
    else if (grid[2] && grid[5] && grid[15]){
        return super.getLargePrize();
    }
    return "No prize";
    }
    
}

class WhackAMole extends GameBooth{
    
    public WhackAMole(double cost, String smallPrize, String largePrize){
        super(cost, smallPrize, largePrize);
    }

    private void printGrid(){

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
        if (game.getCost()<=spendingMoney){                             //evaluates if player can offord the cost of the game
            spendingMoney-=game.getCost();                              //deducts the cost from the spending money
            game.Start();                                               //begins selected game                                               
        }
        else{
            System.out.println("Sorry, you don't have enough cash to afford that game.");
        }
    }

    public String toString(){
        String prizeString = "";
        while (prizesWon.hasNext()){                                    //Converts the ArrayList of prizes won to a String, by iterating through each Prize and appending to a String
            prizeString+=", " + prizesWon.next();   
        }
       return "Your balance is " + String.format("$%.2f", spendingMoney) +". You have won the following prizes: " + prizeString + ".";    //Returns string of balance and list of prizes won
    }

}
