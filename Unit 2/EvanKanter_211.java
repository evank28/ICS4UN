// File EvanKanter_211.java

import java.util.* ;

public class EvanKanter_211
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int N = stdin.nextInt();	// Size of Array
		int A = stdin.nextInt(); 	// Lower boundary
		int B = stdin.nextInt(); 	// Upper boundary
		int [] array = new int [N]	;

		for (int index = 0; index<N; index++)
			{
				array [index] = (int)(Math.random() * ( B - A ) + A );
			}
		int fcount = 0 ;
		int lcount = 0 ;
		int ocount = 0 ;
		int other = 0;
		for (int index = 0; index<N; index++)
			{
				//System.out.println (array[index]) ;
				if ( array [index] == array [0] )
					fcount++ ;
				if ( array [index] == array [array.length-1] )
					lcount++ ;
				if (other == 0 && array [index] != array [0] && array [index] != array [array.length-1])
					{
						other = index ;
					}
				if (array [index] == array [other])
					ocount ++ ;
			}
		System.out.println (""+"First Element: "+array [0]+" | count: "+fcount+"\n"
							+"Last  Element: "+array [array.length-1]+" | count: "+lcount+"\n"
							+"Other Element: "+array [other]+" | count: "+ocount) ;



	}

}


