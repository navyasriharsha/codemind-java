import  java.util.*;  
 class Abundant_number {  
    public static void main(String[] args) {  
        
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        Abundant_number  a = new Abundant_number();  
        if(a.checkAbundant(n))  
    {  
        System.out.println("True");  
    }  
    else   
    {  
        System.out.println("False");  
    }  
    }  
public int getSum(int n)  
{  
    int sum = 0;  
    for (int i=1; i<=Math.sqrt(n); i++)  
    {  
        if (n%i==0)  
        {  
            if (n/i == i)  
                sum = sum + i;  
            else  
            {  
                sum = sum + i;  
                sum = sum + (n / i);  
            }  
        }  
    }  
    sum = sum - n;  
    return sum;  
}  
public  boolean checkAbundant(int n)  
{  
    return (getSum(n) > n);  
}}  