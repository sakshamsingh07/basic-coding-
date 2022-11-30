import java.util.Scanner;
public class numberSum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int ans = (a+b+c);
        //int ans = sum(a,b,c);
        System.out.println("sum of two num a+b+c = " + ans);
       // System.out.println( ans);
    }
   // public static int sum(int a, int b, int c)
   // {
        //return (a+b+c);
   // }

}
