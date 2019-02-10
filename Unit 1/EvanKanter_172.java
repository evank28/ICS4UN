// File EvanKanter_172.java
//prints out the GCF of two number
import java.util.* ;

public class EvanKanter_172
{
	public static void main ( String[] args)
	{
		Scanner input = new Scanner ( System.in ) ;
		double a = input.nextdouble() ;
		double b = input.nextdouble() ;
		double c = input.nextdouble() ;
		System.out.println (getArea (a,b,c)) ;
	}

	public static double getArea (double a, double b, double c)
	{
		double s = (a + b + c)/2		// Semiperimeter
		double heronArea = s * (s-a) * (s-b) * (s-c)
		return heronArea
	}

}


