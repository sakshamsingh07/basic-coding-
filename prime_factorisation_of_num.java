import java.util.Scanner;
public class prime_factorisation_of_num 
 {
     public static void primeFactor(int n)
     {
         for(int i =2; i*i <=n; i++)
         {
             while(n%i==0)
             {
              n/=i;
            System.out.print(i+" ");
            // n/=i;
             }
        }
        if (n!=1)
        {
            System.out.println(n);
        }
     }
     public static void main(String[] args)
     {
         Scanner scn =new Scanner(System.in);
         int n = scn.nextInt();
         primeFactor(n);
     }  
}
