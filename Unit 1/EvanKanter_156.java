// File EvanKanter_156.java
//Counts the number of local minimus and maximums
import java.util.* ;
public class EvanKanter_156
{
	public static void main( String[] args)
	{
		Scanner stdin = new Scanner ( System.in ) ;

		int a = stdin.nextInt() ;
		int b = stdin.nextInt() ;
		int c = stdin.nextInt() ;
		int count = 2 ; // because edges are always local maximums/minimums

		while (c!=0)
				{
					if ((b<a && b<c) || (b>a && b>c))
						count++ ;
					a = b ;
					b = c ;
					c = stdin.nextInt() ;

				}
        stdin.close() ;
        System.out.println(count) ;
	}

}


