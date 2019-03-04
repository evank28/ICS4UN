// Creates the Circle class as per instructions
import java.util.*;
public class EvanKanter_421_Coin
{
    public static void main (String[] args)
    {
        Coin nickel = new Coin();
        nickel.flipCoin();
        if (nickel.showFace() == 0) {
        System.out.println("Heads up!");
        }
        else {
        System.out.println("Tails up!");
        }
    }
}

class Coin {
    private int faceUp = 0;
  
    //PLEASE NOTE - Interestingly, no Constructor is needed 
    

    public int showFace(){
        return faceUp;
    }

    public void flipCoin(){
        faceUp = (int) (Math.random()*2);
    }
        
        
}