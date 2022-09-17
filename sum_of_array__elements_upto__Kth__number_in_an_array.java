import java.util.Scanner;
class Arraya2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,k,sum=0;
n=sc.nextInt();

x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
k=sc.nextInt();

for(i=0;i<=k-1;i++)
{
    
    sum=sum+x[i];

}
System.out.print(sum);
}
}