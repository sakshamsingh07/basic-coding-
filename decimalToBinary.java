import java.util.Scanner; 
public class decimalToBinary
{
    public static int decimaltobinary(int n)
    { 
        int pow = 1 , ans = 0 ;
        while(n!=0)
        {
            int rem = n%2;
            n/=2;
            ans += rem * pow ;
            pow*=10; 
        }
        return(ans);
    }
    public static void main (String[] args)
    {
        Scanner scn =new Scanner (System.in);
        int n = scn.nextInt();
        int ans = decimaltobinary(n);
        System.out.println(ans);
        decimaltobinary(n);
    }
}