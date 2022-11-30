import java.util.*; 
public class rotation_of_num
{
    public static int countDigitOfNumber(int num)
    {
        int count =0;
        while(num!=0)
        {
            num/=10;
            count++;
        }
        return count;
    }
    public static int rotate(int num , int r)
    {
        int len = countDigitOfNumber(num);
        // for negative or positive rotation or "r" is greater than num use this formula ,this is always valid ,folmula is
        // r=(r %len + len)%len;
        r=(r%len + len)%len;
        int a = num% (int)Math.pow(10,r);
        int b =num/ (int)Math.pow(10,r);
        return (a*(int)Math.pow(10,len-r) + b);
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();
        int r = scn.nextInt();
         int ans = rotate(num,r);
         System.out.println(ans);
        rotate(num,r);

    }
}
