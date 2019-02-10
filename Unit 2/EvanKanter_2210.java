// File EvanKanter_2210.java
//Bubble Sort
import java.util.* ;

public class EvanKanter_2210
{
	public static void main( String[] args)
	{


		//Create an array
		int [] data = new int[20] ;
		int [] dataTwo = new int[30] ;

		// fill the first array with random sorted numbers

		data[0] =  (int) (Math.random()* 100) ;
		dataTwo[0] = (int) (Math.random()* 100) ;

		for ( int i = 1; i < data.length; i++ )
		{
			data [i] = data[i-1]+ (int) ( Math.random()* 100 ) ;
		}

		// fill the second array with random sorted numbers
		for ( int i = 1; i < dataTwo.length; i++ )
		{
			dataTwo [i] = dataTwo [i-1] + (int) ( Math.random()* 1000 ) ;
		}

		// print the arrays
		System.out.println (Arrays.toString(data)) ;
		System.out.println (Arrays.toString(dataTwo)) ;

		//print the merged array
		int[] d = merge(data, dataTwo);
		System.out.println (Arrays.toString(d)) ;


	}

	public static int[] merge (int[] a, int[] b)
	{


		int[] c = new int [a.length + b.length] ;
		int aInd = 0 ;
		int bInd = 0 ;

		int count = 0 ;
		while (count < c.length && (aInd < a.length && bInd < b.length))
		{
			if (a[aInd] < b[bInd])
			{
				c[count] = a[aInd] ;
				aInd++ ;
			}
			else
			{
				c[count] = b[bInd] ;
				bInd++ ;
			}
			count++ ;
		}
		if (a.length==aInd)
		{
			while (bInd < b.length)
			{
				c[count] = b[bInd] ;
				count++ ;
				bInd++ ;
			}
		}
		else
		{
			while (aInd < a.length)
			{
				c[count] = a[aInd] ;
				count++ ;
				aInd++ ;
			}
		}
		return c;
	}

}


