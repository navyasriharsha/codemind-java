import java.util.*;  
class UniqueNumberExample2  
{  
public static void main(String args[] )  
{  
Scanner sc=new Scanner(System.in);  
int number=sc.nextInt();  
 
String str= Integer.toString(number);   

int length=str.length();  
int flag=0, i, j;  

for(i=0;i<length-1;i++)  
{  
for(j=i+1;j<length;j++)  
{  
     
if(str.charAt(i)==str.charAt(j))   
{   
flag=1;  
break;   
}  
}  
}  

if(flag==0)  
System.out.println("Unique Number");  
else  
System.out.println("Not Unique Number");  
}  
}  