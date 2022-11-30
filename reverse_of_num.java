import java.util.Scanner; 
public class reverse_of_num 
{
    public static void reverse(int n)
    {
        while(n!=0)
        {
        int lastdigit = (n%10);
        n/=10;
        System.out.println(lastdigit);
    }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverse(n);
    }
}