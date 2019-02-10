// File EvanKanter_230.java
//Bubble Sort
import java.time.temporal.TemporalAmount;
import java.util.* ;

public class EvanKanter_230
{
	public static void main( String[] args)
	{




	}

	public static void bubbleSort (int[] data)
	{
		boolean flag = true; //swap flag
		int last = data.length-1;
		int sorted = 0;
		while (flag == true)
		{
			flag = false; //swap flag
			for (int ind = ((data.length)-1); ind > sorted; ind--)
			{
				if (data[ind] > data[ind-1])
				{
					swap (data, data[ind], data[ind-1]) ;
					flag = true;
				}
				
			}
			sorted++;
		}
	}

	public static void swap (int[] list, int a, int b)
	{
		int temp = list[a] ;
		list[a] = list [b] ; 
		list [b] = temp ; 
	}

}


