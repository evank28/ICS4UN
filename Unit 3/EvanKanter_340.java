//file EvanKanter_340.java
// Merge sort problem
import java.util.*;
public class EvanKanter_340 {

	public static void main(String[] args)
	{	
		int size = 100;
		int[] list = new int [size];
		for (int i = 0; i < list.length; i++)
		{
			list[i] = (int)(Math.random()*size);
		}
		print1DPartial(list, 10, 0, 9); //prints first 10 elements of array
		print1DPartial(list, 10, list.length-10, list.length-1); //prints last 10 elements of array
		//System.out.println(Arrays.toString(list));
		System.out.println("    ___________________________________________________________________");
		quickSort (list, 0, list.length-1);
		//System.out.println(Arrays.toString(list));
		print1DPartial(list, 10, 0, 9); //prints first 10 elements of array
		print1DPartial(list, 10, list.length-10, list.length-1); //prints last 10 elements of array
	}
	
	/* Quick Sort
	 * 
	 * Choose a pivot in a sequence. All elements to the right of pivot are greater than the pivot value
	 * All elements to the left are less than the pivot value
	 * Find a new pivot within each segment and partition on that point.
	 * Repeat.
	 */
	public static void quickSort (int[]data, int from, int to)
	{
		if (from<to)
		{
			int pivot = partition (data, from, to);
			quickSort(data, from, pivot-1); //sort the left half
			quickSort(data, pivot+1, to); //sort the right half
			
		}
	}

	public static int partition (int[]data, int from, int to)
	{
		int pivot = to;
		int runner = from; // element running from the left
		while (runner < pivot)
		{
			if (data[runner]<data[pivot])
			{
				runner++;
			}
			else
			{
				swap (data, runner, pivot-1);
				swap (data, pivot-1, pivot);
				pivot --;
			}
		}
		
		return pivot;
	}
	
	//Prints a part of a 1-D array
	public static void print1DPartial (int[] data, int cols, int from, int to)
	{
		int[] a = new int[to-from+1];
		for (int i = from; i<=to; i++)
		{
			a[i-from] = data[i];
		}
		print1D (a,cols);
		
	}
	
	//previously created function for printing a 1-D array
	public static void print1D(int [] data, int cols)
	{		
			if ( cols < 1)
				cols = 1 ;
			System.out.print("\n") ; // separate from previous output
			int rows = data.length / cols ; // the number of full rows
			for ( int i = 0 ; i < rows ; i ++ ) // print each full row
			{
				for( int j= 0 ; j < cols ; j ++ )
					System.out.printf( " %6d", data[ i * cols + j ] ) ; // formatted output
				System.out.println() ; // move the cursor to a new line
			}
			for ( int i = rows * cols ; i < data.length ; i ++ ) // print last row ( might be not full)
				System.out.printf( "%6d", data [ i ] ) ; // formatted output
			//System.out.print("\n") ; // separate from next output
	}
	
	
	//Saved swap method
	public static void swap (int[] list, int a, int b)
	{
		int temp = list[a] ;
		list[a] = list [b] ; 
		list [b] = temp ; 
	}

	
}