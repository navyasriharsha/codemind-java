import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        int n,k,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
        
    }
}