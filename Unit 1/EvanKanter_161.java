// File EvanKanter_161.java
//Reads a natural number and prints the number of multiplications to calculate x**n
import java.util.* ;

public class EvanKanter_161
{
	public static void main( String[] args)
	{

        Scanner stdin = new Scanner ( System.in ) ;
        int N = stdin.nextInt () ; 	   //The value of the greatest denominator
        stdin.close() ;
        double val = 1 ;   			   //The eventual sum
        double op = -1 ;
        for (double D=2; D<=N; D++)
        {
			val = val + op *(1/D) ;
			op = op * -1.0 ;
		}


        System.out.println(val) ;
	}

}


