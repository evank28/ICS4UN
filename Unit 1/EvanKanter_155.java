// File EvanKanter_155.java
//Counts the number of sign changes
import java.util.* ;

public class EvanKanter_155
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ;			

        int a = stdin.nextInt() ;
        int b = stdin.nextInt() ;
        int count = 0 ;
    
        while (b!=0)
            {
                if (a/b<0)
                    count++ ;
                a = b ;
                b = stdin.nextInt() ;
                
            }
        stdin.close() ;
        System.out.println(count) ;
	}

}


