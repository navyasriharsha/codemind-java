import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m,res;
        double power;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        power=Math.pow(x,y);
        res=(int)power%m;
        System.out.println(res);
    }
}