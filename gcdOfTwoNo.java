import java.util.Scanner;  
public class gcdOfTwoNo 
{
    public static int gcd(int m ,int n )
    {
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int ans=gcd(n,m);
        System.out.println(ans);
    }
    
}
