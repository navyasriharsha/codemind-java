import java.util.Scanner;
class Clase
{
public static boolean product(int n)
{
 int sum=0,temp=n,r;
 while(n>0)
 {
 r=n%10;
 sum=sum*10+r;
 n=n/10;
}
 if(sum==temp)
 return true;
 else
return false;

}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,d1,d2,p1=0,p2=0;
 n=sc.nextInt();
 
 for( int i=Math.abs(n-1);;i--)
	 {
	     if(product(i))
		 {
		   d1=i;
                   break;
		 }
	 } 
	for(int j=(n+1);;j++)
	 {
	     if(product(j))
		 {
		   d2=j;
                   break;
		 }
	 } 
       p1=Math.abs(n-d1);
       
       p2=d2-n;

        if((p1)<(p2))
            System.out.println(d1);
       else if(p1==p2)
            System.out.println(d1+" "+d2);
	    else
	    System.out.println(d2);
  }

}