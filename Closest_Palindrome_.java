import java.util.Scanner;
class Main
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
	 int n,i,d1=0,d2=0;
         n=sc.nextInt();
         
	 for(i=(n-1);;i--)
	 {
	     if(ispalin(i))
		 {
		   d1=i;
                   break;
		 }
	 } 
	for(i=n+1;;i++)
	 {
	     if(ispalin(i))
		 {
		   d2=i;
                   break;
		 }
	 } 
        if((n-d1)<(d2-n))
            System.out.println(d1);
        else if((n-d1)==(d2-n))
        {
            System.out.println(d1+" "+d2);
        }
        else
            System.out.println(d2);
	 
  }
  
}
