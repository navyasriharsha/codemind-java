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
   int l=sc.nextInt();
   int arr[]=new int[l];
   for(int i=0;i<l;i++)
   {
       arr[i]=sc.nextInt();
       
   }
   int k=sc.nextInt();
   int c=0;
   for (int j=0;j<l;j++)
   {
       if(arr[j]==1)
       continue;
       if(arr[j]>=k)
       {
           if(isprime(arr[j]))
           c++;
           
       }
   }
   System.out.println(c);
}
}