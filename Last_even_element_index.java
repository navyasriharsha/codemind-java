import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        int i;
        for(i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(i=l-1;i>=0;i--)
        {
            if(arr[i]%2==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}