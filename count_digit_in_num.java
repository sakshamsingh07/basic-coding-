import java.util.Scanner; 
public class count_digit_in_num
{
    public static int count(int n)
    {
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int ans = count(n);
        System.out.println(ans);
        count(n);
    }

}

