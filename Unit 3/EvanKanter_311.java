//file EvanKanter_311.java
//Introduction to Recursion
// Two methods of solving an arithmetic sequence, one recursively and the other using the general formula

public class EvanKanter_311 {

	public static void main(String[] args)
	{
		System.out.println(termArithm (1.0, 1.0, 10));
		System.out.println(termArithmGen (1.0, 1.0, 10));
	}

	public static double termArithm (double term, double diff, int n)
	{

			if (n==1)
				return term;
			return 	termArithm (term+diff, diff, n-1);
	}

	public static double termArithmGen (double term, double diff, int n)
	{
			return term + diff * (n-1);
	}


}
