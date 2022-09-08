import java.util.Scanner;
 class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++)			// rows 
		{   
			for(int j=1;j<=i;j++)		// cols 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
