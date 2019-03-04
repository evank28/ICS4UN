//file EvanKanter_319.java
public class EvanKanter_321 {

	public static void main(String[] args)
	{
		double number = 4.0;
		long exponent =  4;
		System.out.println("number: "+number+"; exponent: "+exponent+"; result: "+ power(number, exponent));
	}

	// Complexity is O(N^2)
	public static double power(double x, long n)
	{
			if (n==1)
				return x;
			return (x * power(x, n-1));
				
	}

	public static double quickPower (double x, long n, long cur)
	{
		if (n==1)
			return x;
		if (n==3):
			return 
		return quickPower(x * x, n/2);
	}
}