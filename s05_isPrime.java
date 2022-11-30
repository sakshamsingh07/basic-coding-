import java.util.Scanner; 
public class s05_isPrime
{
    public static void isprime(int a)
    {
        boolean isprime = true;
        for(int i = 2 ; i<a; i++)
        {
            if (a%i==0)
            {
                isprime = false;
                break;
            }

        }
        if (isprime)
        {
            System.out.println(a+"is prime");
        }
        else
        {
            System.out.println(a+"is not a prime");
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        isprime(a);
    }
    
}