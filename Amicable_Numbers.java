import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
     //   System.out.println(a);
      //  System.out.println(b);
        int c=0;
        int d=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            c=c+i;
        }
        for(int j=1;j<b;j++)
        {
            if(b%j==0)
            d=d+j;
        }
        if(b==c && a==d)
        
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
    }