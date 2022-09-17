import java.util.Scanner;
class palindrome
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
 if(temp==sum)
 return true;
 else
 return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,c=0;
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(product(x[i]))
c++;

}
System.out.println(c);
}
}