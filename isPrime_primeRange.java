import java .util.Scanner; 
public class isPrime_primeRange
{
    public static void prime(int num)
    {
        boolean isprime = true ;
        for(int i =2 ; i <num; i++) 
        {
            if(num%i==0)
            isprime = false;
            break;
        }
        if(isprime)
        {
            System.out.println(num+"prime");
        }
         else
         {
             System.out.println(num+"not prime");
         }
    }
    public static void primerange(int lo, int hi)
    {
        for(int i=lo;i<=hi;i++)
        {
            prime(i);
        }
    }
    public static void main( String[] args)
    {
        Scanner scn = new Scanner(System.in);
        // int num= scn.nextInt();
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        primerange(lo,hi);
    }
}