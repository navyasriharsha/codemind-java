import java.util.Scanner;
class Prime
{
    public static boolean isprime(int n)
    {
        int count=0;
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             count++;
             
        }
        if (count==0)
         return true;
        else
         return false;
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,c=0,sum=0;
double avg;
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(x[i]==1)
continue;
if(isprime(x[i]))
{
c++;
sum=sum+x[i];
}
}
avg=(double)sum/c;

System.out.format("%.2f",avg);
}
}