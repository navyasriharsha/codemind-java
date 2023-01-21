import java.util.*;
import java.util.Map.*;
class Main
{
    public static void printOutput(int arr[])
    {
        int sum=0,count=0;
        int i;
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }
        for(i=0;i<arr.length;i++)
        {
            
        
        if(arr[i]==(int)hm.get(arr[i]))
                {
                System.out.print(arr[i]+" ");
                hm.put(arr[i],0);
                count++;
                }
        }
        if(count==0)
          System.out.println("-1");
    }
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        printOutput(x);
    }
}