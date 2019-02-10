// File EvanKanter_SoldierBrute.java
//Solider sort
import java.util.* ;

public class EvanKanter_SoldierBrute
{
	public static void main( String[] args)
	{
		int N =100000;
		//Specific Testing	
		//String [] soldiers = new String[] {"R","R","L","R","L","R","R","R","L","L","R","L","R","R","L","L","R","L","R","L"};
	

		String[] soldiers = new String [N];

		//Initializes Solider with random directions
		String[] directions = new String[] {"L", "R"};

		for (int i = 0; i<N; i++)
			{
				soldiers[i] = directions[(int)(Math.random() * 1.99)];
			}
		

		
		// Initializes Soldiers with input N and directions
		/*
		Scanner stdin	  = new Scanner(System.in) ;
		int N			  = stdin.nextInt() ;
		String[] soldiers = new String[N] ;
		for (int i = 0; i<N; i++)
			{
				soldiers[i] = stdin.next();
			}
		*/


		System.out.println(Arrays.toString(soldiers));
		String[] soldiersDup = soldiers.clone(); //prepares for algorithmic method
		// Performs the brute force method
		int seconds = -1; // begins at -1 since the last iteration includes no rotations
	
		boolean flag = true;
		while (flag == true)
		{
			flag = false;
			for (int i = 0; i <soldiers.length-1; i++)
			{
					if (/*soldiers[i] == "R" && soldiers[i+1]=="L"*/soldiers[i].equals("R") && soldiers[i+1].equals("L"))
					{
						flag = true;
						soldiers[i]="L";
						soldiers[i+1]="R";
						i++;
					}
			}
			seconds++;
			//System.out.println("Second " + (seconds+1) + ": " + Arrays.toString(soldiers));
		}
		System.out.println(Arrays.toString(soldiers));
		System.out.println("Number of seconds: "+ seconds);

		//beginning algorithmic checks
		//step 1: determine count of Rs and Ls
		int rCount = 0;
		int lCount= 0;
		int rLeft = -1;
		int lRight = -1;
		int lPenalty = 0;
		int ilPenalty = -1;
		int irPenalty = -1;
		int rPenalty = 0;
		int addRPenalty = 0;
		int subRPenalty= 0;
		boolean lastL = false;
		boolean lastR = false;
		boolean rOffender = false;
		boolean rPenaltyCheck = true;
		for (int i = 0; i <N; i++)
		{

			if (soldiersDup[i].equals("R"))
				{
					rCount++;
					addRPenalty++;
					if (lastR && rOffender)
					{
						rPenalty++;
						if (lastR)
							irPenalty = i;
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
					if (lastL /*(i-ilPenalty<=3 && ilPenalty!=-1)*/)
					{
						lPenalty++;
						ilPenalty = i;
					}

					lastR=false;
					lastL=true;

				}
			
		}
		int lDiff = lRight-lCount+1;
		int rDiff = (soldiersDup.length-rCount)-rLeft;
		int calcSeconds = 0;
		int calcSecondsL = lDiff + lPenalty;
		int calcSecondsR = rDiff + rPenalty;
		if (lDiff+lPenalty>rDiff+rPenalty)
			calcSeconds = calcSecondsL;
		else
			calcSeconds = calcSecondsR;


		System.out.println("L count: "+ lCount + " | lRight: " +lRight + " | lDiff: " + lDiff + " | lPenalty: " + lPenalty);
		System.out.println ("R count: "+ rCount + " | rLeft: "+rLeft + " | rDiff: " + rDiff + " | rPenalty: " + rPenalty);
		System.out.println ("Calculated Seconds: "+ calcSeconds );

	}	

}


