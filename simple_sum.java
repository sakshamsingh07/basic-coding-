import java.util.Scanner; 
public class simple_sum
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int sum = (a+b+c+d);
        System.out.println(sum);
    }
}
