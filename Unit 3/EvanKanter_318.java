//file EvanKanter_317.java
//
import java.util.*;
public class EvanKanter_318 {

	public static void main(String[] args)
	{
		printTopCorner((int) (Math.random()*10));
	}


	public static void printTopCorner( int n )
	{
			if (n>0)
				{
				String output = new String(new char[n]).replace("\0", "*");
				System.out.println(output);
				printTopCorner(n-1);
				
				}
				
	}
}