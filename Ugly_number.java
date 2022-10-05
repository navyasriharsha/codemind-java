
import java.io.*;  
import java.util.*;
class UglyNumberExample2 {  
     
    static int divideByGreatestDivisible(int number, int gdp)  
    {  
        while (number % gdp == 0)  
            number = number / gdp;  
        return number;  
    }  
  
    static boolean checkUglyNumber(int number)  
    {  
        number = divideByGreatestDivisible(number, 2);  
        number = divideByGreatestDivisible(number, 3);  
        number = divideByGreatestDivisible(number, 5);  
   
        return (number == 1) ? true : false;  
    }  
   
    
    public static void main(String args[])  
    {  
          
        int number1;  
          

        Scanner sc = new Scanner(System.in);  
         
        number1 = sc.nextInt();  
  
        
          
        if (checkUglyNumber(number1))   
                        System.out.println("Ugly Number");   
                else  
                        System.out.println("Not Ugly Number");  
          
         
        }  
}  