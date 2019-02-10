// File EvanKanter_157.java
//Sums the number of digits of a number
import java.util.* ;

public class EvanKanter_157
{
	public static void main( String[] args)
	{

        Scanner stdin = new Scanner ( System.in ) ;
        long original = stdin.nextLong ();
        long sum = 0 ;
        while (original>10)
            {
				sum = sum +(original%10) ;
				original=original/10 ;
            }
        sum=sum+original ;
        stdin.close() ;
        System.out.println(sum) ;
	}

}


