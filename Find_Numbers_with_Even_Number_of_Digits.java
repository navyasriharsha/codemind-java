import java.util.Scanner;
class Main
{

 
    static int countDigit(int n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[],i,n,sum=0,c=0;
n=sc.nextInt();
arr=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
   
    sum=countDigit(arr[i]);
    

    if(sum%2==0)
    {
       c=c+1;
    }
    

}
System.out.println(c);
   
}
}
