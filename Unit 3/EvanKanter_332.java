//file EvanKanter_332.java
// Merge sort problem
public class EvanKanter_332 {

	public static void main(String[] args)
	{	
		/*int size = 100;
		int[] list = new int [size];
		for (int i = 0; i < list.length; i++)
		{
			list[i] = (int)(Math.random()*size);
		}*/
		
		//print1DPartial(list, 10, 0, 9); //prints first 10 elements of array
		//print1DPartial(list, 10, list.length-10, list.length-1); //prints last 10 elements of array
		//System.out.println(Arrays.toString(list));
		//System.out.println("    ___________________________________________________________________");
	//	mergeSort (list, 0, list.length-1);
		//System.out.println(Arrays.toString(list));
		//print1DPartial(list, 10, 0, 9); //prints first 10 elements of array
		//print1DPartial(list, 10, list.length-10, list.length-1); //prints last 10 elements of array
		int[] list  = new int[] {7,5,2,9,6,1,8,0,4,3,5,2};
		print1D(list,12);
		mergeSort(list, 0, list.length-1);
		print1D(list,12);
	}
	
	public static void mergeSort (int[]data, int from, int to)
	{
		if (from<to)
		{
			mergeSort (data, from, (from+to)/2);    //sort the left half
			mergeSort (data, (from+to)/2+1, to);	//sort the right half
			merge (data, from, to);
			//print1D(data,12);
			
		} 
	}

	public static void merge (int[]data, int from, int to)
	{
		int [] aux = new int[to-from+1];
		for (int i = 0; i < aux.length; i++)
		{
			aux[i] = data[from + i];
		}
		
		int ia = 0;
		int ib = (aux.length+1) / 2;
		int id = from;
		
		while (ia < (aux.length+1)/2 && ib <aux.length)
		{
			if (aux[ia] < aux[ib])
			{
				data[id] = aux[ia] ;
				ia++ ;
			}
			else
			{
				data[id] = aux[ib] ;
				ib++ ;
			}
			id++ ;
		}
		
		while (ia  < (aux.length+1)/2)
		{
			data[id] = aux[ia] ;
			ia++ ;
			id++ ;
		}
		
		
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
	

	
}