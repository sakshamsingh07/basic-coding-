import java.util.Scanner;
public class reversingOfNumber
{
    public static void reversingOfNumber(int num)
    {
        while(num != 0)
        {
            int lastDigit = num%10;
            num /= 10 ;
            System.out.println(lastDigit);


        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();
        reversingOfNumber( num);
    }
}
