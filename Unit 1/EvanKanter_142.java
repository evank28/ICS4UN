// File EvanKanter_142.java
//12345 ACDBDEF\n12345\nMESSAGE
import java.util.* ;

public class EvanKanter_142
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ;			

		String a = stdin.next() ;
		String b = stdin.next() ;
		String c = stdin.next() ;
		String r = "" ;
		stdin.close() ;
		boolean ab  =(a.compareTo(b)<0) ;
		boolean ac = (a.compareTo(c)<0) ;
		boolean bc = (b.compareTo(c)<0) ;

		if (ab)
			 {
				if (ac)
					{
						if (bc)
							{
								r = a + " " + b + " " + c ;
							}
						else 
							{
								r = a + " " + c + " " + b;
							}
					}
				else {
						if (bc)
							{
								r = a + " " + b + " " + c ;
							}
						else 
							{
								r = c + " " + a + " " + b;
							}
					}
			 }
		else 
			{	
				if (ac)
					{
						r = b + " " + a + " " + c ;						
					}
				else {
						if (bc) 
							{
								r = b + " " + c + " " + a ;
							}
						else 
							{
								r = c + " " + b + " " + a;
							}
					}
			}
		//System.out.println("a>b: "+ ab + " a>c: "+ ac + " b>c: " + bc) ;
		System.out.println(r) ;
	}

}


