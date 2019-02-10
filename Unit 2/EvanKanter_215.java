// File EvanKanter_215.java

import java.util.* ;

public class EvanKanter_215
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int N = stdin.nextInt();	// Size of Array
		int [] array = new int [N]	;
		int sumElements = 0 ;
		int sumIndices = -1 ;
		for (int index = 0; index<N; index++)

		{
			array [index] = (int)(stdin.nextDouble()) ; 		// Reads all values into the array
			sumElements = sumElements + array[index] ;
		}

		for (int index = 0; index<N; index++)
		{

				if (array[index]>sumElements)
				{
				sumIndices = sumIndices + index ;
				}

		}
		if (sumIndices > -1 )
			sumIndices ++ ;
		System.out.println (sumIndices) ;

	}

}


