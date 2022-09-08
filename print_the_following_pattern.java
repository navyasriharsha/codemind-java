import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,k=0;
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++)			// rows 
		{   
			for(int j=1;j<=r;j++)		// cols 
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}
}