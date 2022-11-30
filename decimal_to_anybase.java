import java.util.Scanner; 
public class decimal_to_anybase
{
    public static int decimaltoanybase(int n, int b)
    {
        int pow = 1 , ans = 0 ;
        while(n!=0)
        {
            int rem=n%b;
            n/=b;
            ans += rem*pow;
            pow*=10;
        }
        return(ans);
    }
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = decimaltoanybase(n,b);
        System.out.println(ans);
        decimaltoanybase(n,b);
    }
}
