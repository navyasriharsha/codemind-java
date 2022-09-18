import java.util.Scanner;
class Arraya2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,sum=0,c=0;
double avg;
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
    sum=sum+x[i];
}
avg=Math.floor(sum/n);
for(i=0;i<n;i++)
 {
     if(x[i]>=avg)
     c++;
 }
System.out.println(c);
}
}