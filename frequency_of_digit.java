import java.util.Scanner; 
public class frequency_of_digit
{
    public static int frequency(int n, int d)
    {
        int count = 0;
        while(n!=0)
        {
            int ld = n%10;
            n/=10;
            if(ld==d)
            count++; 
        }
        return(count);
    }
    public static void main(String[] args )
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d= scn.nextInt();
        int ans = frequency(n,d);
        System.out.println(ans);
        frequency(n,d);
    }
} 

