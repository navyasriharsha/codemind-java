import java.util.Scanner;
class Arraya2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n;
n=sc.nextInt();
x=new int[n];

for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
int even,eei=0;
for(i=0;i<n;i++)
{
    if(x[i]%2==0)
    {
    even=x[i];
    eei=i;
    }

}
System.out.print(eei);
}
}