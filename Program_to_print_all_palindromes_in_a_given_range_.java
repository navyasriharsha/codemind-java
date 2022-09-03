import java.util.Scanner;
class Palindrome
{
public static boolean ispalin(int n)
{
 int sum=0,temp=n,r;
 while(n>0)
 {
 r=n%10;
 sum=sum*10+r;
 n=n/10;
}
 if(temp==sum)
 return true;
 else
 return false;
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,m;
 n=sc.nextInt();
 m=sc.nextInt();
 for(int i=n;i<m;i++)
 {
     if(ispalin(i))
     {
      System.out.print(i+" ");
      
     }
}
}
}