// File EvanKanter_SoldierRecursion.java
//Solider sort
import java.util.* ;

public class EvanKanter_SoldiersRecursion
{
	public static void main( String[] args)
	{

		// Initializes Soldiers with input N and directions
		
		Scanner stdin	  = new Scanner(System.in) ;
		int N			  = stdin.nextInt() ;
		String[] soldiers = new String[N] ;
		for (int j = 0; j<N; j++)
			{
				soldiers[j] = stdin.next();
			}
		

		System.out.println(Arrays.toString(soldiers));
	
	
			// Performs the brute force method
			int seconds = -1; // begins at -1 since the last iteration includes no rotations
	
			boolean flag = true;
			while (flag == true)
			{
				flag = false;
				for (int i = 0; i <soldiers.length-1; i++)
				{
						if (soldiers[i].equals("R") && soldiers[i+1].equals("L"))
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
		//	System.out.println(Arrays.toString(soldiers));
			System.out.println("Number of seconds: "+ seconds);

	}	

}


