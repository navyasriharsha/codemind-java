import java.util.Scanner;
class Arraya2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,a,c=0;
n=sc.nextInt();

x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
a=sc.nextInt();
for(i=0;i<n;i++)
{
if(x[i]==a)
c++;
}
System.out.println(c);
}
}