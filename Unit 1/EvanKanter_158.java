// File EvanKanter_158.java
//Reads a natural number and prints the number of multiplications to calculate x**n
import java.util.* ;

public class EvanKanter_158
{
	public static void main( String[] args)
	{

        Scanner stdin = new Scanner ( System.in ) ;
        int power = stdin.nextInt () ; //The current Power to which x is raised
        int mults = 0 ;   			   // The number of mutiplications
        while (power>1)
            {
				if (power%2==1)
				{
					power=power-1 ;
				}
				else
				{
					power=power/2 ;
			    }
				mults++ ;
            }

        stdin.close() ;
        System.out.println(mults) ;
	}

}


