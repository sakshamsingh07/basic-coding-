import java.util.Scanner; 
public class pattern
{
    public static void pattern(int n)
    {
        for (int i = 1; i<=n; i++)
        {
            System.out.println("X*\t"+i+"="+"X"+i);
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        pattern(n);
    }

}