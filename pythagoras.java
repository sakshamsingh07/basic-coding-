import java.util.Scanner;
public class pythagoras
{
    public static void pythagoras(int a, int b, int c)
    {
        if(a*a == b*b +c*c )
        {
            System.out.println("Result = it's pytha triplet");
        }
        else if (b*b == a*a + c*c)
        {
            System.out.println("Result = it's pytha triplet");  
        }
        else if ( c*c == b*b + a*a)
        {
            System.out.println("Result = it's pytha triplet");
        }
        else 
        {
            System.out.println("Result = it's not a pytha triplet");
        }
       
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.print("enter the first num:");
        int a = scn.nextInt();
        System.out.print("enter the second num:");
        int b = scn.nextInt();
        System.out.print("enter the third num:");
        int c = scn.nextInt();
        pythagoras (a,b,c);
    }
}
