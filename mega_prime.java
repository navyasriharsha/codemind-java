
import java.util.*;

class Prime{
	

	public static boolean checkDigits(int n)
	{
	
		while (n > 0) {
			int dig = n % 10;

			
			if (dig != 2 && dig != 3 &&
				dig != 5 && dig != 7)
				return false;

			n /= 10;
		}

		return true;
	}
	
	
	public static boolean prime(int n)
	{
		if (n == 1)
			return false;

	
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
	
	
	public static boolean isFullPrime(int n)
	{
		
		return (checkDigits(n) && prime(n));
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (isFullPrime(n))
			System.out.print( "Mega Prime" );
		else
			System.out.print( "Not Mega Prime");
	}
}