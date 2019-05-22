public class Carnival
{
 public static void main (String[] args)
 {

 }
}

class GameBooth{
    public GameBooth(){

    }
}

class RedOrBlack extends GameBooth{
    public RedOrBlack(){
    
    }
}

class PennyToss extends GameBooth{
    public PennyToss(){
    
    }
}

class WhackAMole extends GameBooth{
    public WhackAMole(){

    }
}

class Player{
    private double spendingMoney=0;                                     //Initializing private fields for Player class
    private ArrayList<String> prizesWon = new ArrayList<String>();
    
    public Player(){                                                     //Default Constructor for Player class                                //Sets spendingMoney to initial value
    }
    public Player(double initialFunds){                                 //Constructor for Player class
        spendingMoney = initialFunds;                                   //Sets spendingMoney to initial value
    }

    public void play (){

    }

    public String toString(){
        String prizeString = "";
        while (prizesWon.hasNext()){                                //Converts the ArrayList of prizes won to a String, by iterating through each Prize and appending to a String
            prizeString+=", " + prizesWon.next();
        }
       return "Your balance is " + String.format("$%.2f", spendingMoney) +". You have won the following prizes: " + prizeString + ".";    //Returns string of balance and list of prizes won
    }

}
