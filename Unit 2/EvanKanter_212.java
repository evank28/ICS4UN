// File EvanKanter_212.java
//Note an Array is not needed to solve this problem
import java.util.* ;

public class EvanKanter_212
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int N = stdin.nextInt();	// Size of Array
		double [] array = new double [N]	;
		double diff = 0 ;
		double maxPosDiff = 0 ;
		for (int index = 0; index<N; index++)
			{
				array [index] = (double)(stdin.nextDouble()) ; 		// Reads all values into the array
				diff = array[index]-array[index-1] ;
				if (diff > maxPosDiff)
					maxPosDiff = diff ;
			}

		System.out.println (maxPosDiff) ;



	}

}


