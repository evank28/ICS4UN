// FileEvanKanter_SoldiersSinglePass.java
//Solider sort
import java.util.* ;

public class EvanKanter_SoldiersSinglePass
{
	public static void main( String[] args)
	{
		// Initializes Soldiers with input N and directions
		
		Scanner stdin	  = new Scanner(System.in) ;
		int N			  = stdin.nextInt() ;
        String[] soldiers = new String[N] ;
        
        int rCount = 0;
		int lCount= 0;
		int rLeft = -1;
		int lRight = -1;
		int lPenalty = 0;
		int ilPenalty = -1;
		int rPenalty = 0;
		int addRPenalty = 0;
		int subRPenalty= 0;
		boolean lastL = false;
		boolean lastR = false;
		boolean rOffender = false;
		boolean rPenaltyCheck = true;

		for (int i = 0; i<N; i++)
			{
                soldiers[i] = stdin.next();
                
                if (soldiers[i].equals("R"))
                {
                    rCount++;
                    addRPenalty++;
                    if (lastR && rOffender)
                    {
                        rPenalty++;
                    }

                    if (rLeft == -1) //Sets rLeft as the index of the left most R element
                    {
                        rLeft = i;
                        rOffender = true;
                    }
                    

                    lastR=true;
                    lastL=false;
                }

            else
                {
                    //Deals with sub & add for R Penalty
                    if (lastR & !rOffender & rPenaltyCheck)
                    {
                        if (addRPenalty-subRPenalty>0)
                        {
                            rPenalty=rPenalty+addRPenalty-subRPenalty;
                        }
                        else
                            rPenaltyCheck=false;
                        addRPenalty=0;
                        subRPenalty=0;
                    }
                    
                    lCount++;
                    lRight=i; //eventually sets lRight as the index of the right most L element
                    subRPenalty++;
                    addRPenalty=0;
                    rOffender=false; //turns off the penalty counter for Rs
                    
                    if (lastR && (lPenalty-(i-ilPenalty-1)+1)<1 && ilPenalty!=-1)
                    {
                        lPenalty=0;
                        ilPenalty=-1;
                    }
                    if (lastR && (lPenalty-(i-ilPenalty-1))+1>0 && ilPenalty!=-1)
                    {
                        lPenalty=lPenalty-(i-ilPenalty-1)+1;
                        ilPenalty = i;
                    }
                    if (lastL)
                    {
                        lPenalty++;
                        ilPenalty = i;
                    }

                    lastR=false;
                    lastL=true;

                }
			}
		

		int lDiff = lRight-lCount+1;
		int rDiff = (soldiers.length-rCount)-rLeft;
		int calcSeconds = 0;
		int calcSecondsL = lDiff + lPenalty;
		int calcSecondsR = rDiff + rPenalty;
		if (lDiff+lPenalty>rDiff+rPenalty)
			calcSeconds = calcSecondsL;
		else
			calcSeconds = calcSecondsR;

		System.out.println ("Calculated Seconds: "+ calcSeconds );

	}	

}


